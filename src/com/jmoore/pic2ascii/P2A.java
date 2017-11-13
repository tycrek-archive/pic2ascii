package com.jmoore.pic2ascii;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import javax.imageio.ImageIO;

/**
 * Project: Pic2Ascii - Convert an image to ASCII characters
 * @author Joshua Moore
 */
public class P2A {

    //These color the console output
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_BLACK = "\u001B[30m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";
    //private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_BLUE = "\u001B[34m";
    //private static final String ANSI_PURPLE = "\u001B[35m";
    //private static final String ANSI_CYAN = "\u001B[36m";
    private static final String ANSI_WHITE = "\u001B[37m";

    private File file;
    private Color[][] scaled; //Contains the colors for each pixel of the scaled image
    private String[][] ascii; //Contains the colored ASCII characters
    private BufferedImage image = null; //Stores the image
    private String abc; //The character to display
    private volatile boolean completed = false;

    private int width, height; //Width and height of the SCALED image

    /**
     * Get an ASCII BufferedImage from a String filename
     * @param filename The filename of the image to convert
     * @param abc The character to represent pixels
     * @param scale What to scale the image by (higher value = smaller result)
     * @return The converted ASCII BufferedImage
     */
    @SuppressWarnings("unused")
    public BufferedImage getImage(String filename, String abc, int scale) {
        new Timer().start();
        file = new File(filename);
        loadImage();
        this.abc = abc;
        scaleImage(scale);
        convertImage();
        return saveImage();
    }

    /**
     * Get an ASCII BufferedImage from a normal BufferedImage
     * @param file The file of the image to convert
     * @param abc The character to represent pixels
     * @param scale What to scale the image by (higher value = smaller result)
     * @return The converted ASCII BufferedImage
     */
    @SuppressWarnings("unused")
    public BufferedImage getImage(File file, String abc, int scale) {
        new Timer().start();
        this.file = file;
        loadImage();
        this.abc = abc;
        scaleImage(scale);
        convertImage();
        return saveImage();
    }

    /**
     * Get an ASCII BufferedImage from a normal BufferedImage
     * @param image The image to convert
     * @param abc The character to represent pixels
     * @param scale What to scale the image by (higher value = smaller result)
     * @return The converted ASCII BufferedImage
     */
    @SuppressWarnings("unused")
    public BufferedImage getImage(BufferedImage image, String abc, int scale) {
        new Timer().start();
        this.image = image;
        this.abc = abc;
        scaleImage(scale);
        convertImage();
        return saveImage();
    }

    /**
     * Beginning of the program. Calls all major methods when run standalone
     */
    private void start(String filename) {
        file = new File(filename);
        if(!loadImage()) quit(); //Load the image
        int scale = getUserScale(); //Get the scale
        changeCharacter(); //Ask the user for a character
        new Timer().start();
        if(!scaleImage(scale)) quit(); //Scale the image
        if(!convertImage()) quit(); //Convert the image
        //printImage();
        saveImage();
    }

    /**
     * Load the image into a BufferedImage object
     * @return Whether the image was loaded or not
     */
    private boolean loadImage() {
        System.out.print("Step 1 of 6: Load image... ");
        try {
            image = ImageIO.read(file); //Read the file into the BufferedImage
            System.out.println("Completed.");
            return true;
        } catch(Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    /**
     * Pick a value from the user to scale the image by.
     * The higher the value, the smaller the result will be. For example, a scale of 2 on an image with a width of 1024 would make the scaled width 512.
     * @return The Integer value scale the user chose
     */
    private int getUserScale() {
        int scale = 0;
        System.out.print("Step 2 of 6: Enter a scale value (higher will produce smaller result): ");
        try {
            scale = new Scanner(System.in).nextInt();
        } catch(Exception ex) {
            System.out.println("Please enter a valid input!");
            quit();
        }
        return scale;
    }

    /**
     * Get a character from the user
     */
    private void changeCharacter() {
        System.out.print("Step 3 of 6: Enter a character to represent pixels: ");
        abc = new Scanner(System.in).nextLine();
        abc = abc.concat(abc); //Make it show each pixel as two characters so scaling works better.
                               //One pixel is a square, but a character is more vertical.
    }

    /**
     * Scale the image into an array of Color objects
     * @param scale What to scale the image by
     * @return Whether the image scaled correctly or not
     */
    private boolean scaleImage(int scale) {
        System.out.print("Step 4 of 6: Scale image... ");
        width = image.getWidth() / scale; //The new width is the original divided by the scale. A higher scale results in a smaller image
        height = image.getHeight() / scale; //The new height is the original divided by the scale. A higher scale results in a smaller image
        scaled = new Color[width][height]; //The new color values of the scaled image
        try {
            for(int x = 0; x < width; x++) { //For each value in the X...
                for(int y = 0; y < height; y++) { //... and Y of the new array
                    scaled[x][y] = new Color(image.getRGB(x * scale,y * scale)); //Multiply the current value by the scale so we cover the entire image instead of just a small section
                }
            }
            System.out.println("Completed.");
            return true;
        } catch(Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    /**
     * Convert each pixel into an colored ASCII character
     * @return Whether it was converted correctly or not
     */
    private boolean convertImage() {
        System.out.print("Step 5 of 6: Convert image... ");
        ascii = new String[width][height]; //This will hold the String values
        try {
            for(int x = 0; x < width; x++) {
                for(int y = 0; y < height; y++) {
                    Color c = scaled[x][y]; //Get the color of the pixel at the current coordinate
                    if(c.getRed() > 170 && c.getGreen() > 170 && c.getBlue() > 170) { //WHITE
                        ascii[x][y] = ANSI_WHITE + abc + ANSI_RESET;
                    } else if(c.getRed() < 85 && c.getGreen() < 85 && c.getBlue() < 85) { //BLACK
                        ascii[x][y] = ANSI_BLACK + abc + ANSI_RESET;
                    } else if(c.getRed() > c.getBlue() && c.getRed() > c.getGreen()) { //RED
                        ascii[x][y] = ANSI_RED + abc + ANSI_RESET;
                    } else if(c.getGreen() > c.getBlue() && c.getGreen() > c.getRed()){ //GREEN
                        ascii[x][y] = ANSI_GREEN + abc + ANSI_RESET;
                    } else if(c.getBlue() > c.getGreen() && c.getBlue() > c.getRed()) { //BLUE
                        ascii[x][y] = ANSI_BLUE + abc + ANSI_RESET;
                    } else {                                            //NORMAL
                        ascii[x][y] = ANSI_RESET + abc + ANSI_RESET;
                    }
                }
            }
            System.out.println("Completed.");
            return true;
        } catch(Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    /**
     * Print the image to the screen
     * @deprecated
     */
    @SuppressWarnings("unused")
    private void printImage() {
        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
                System.out.print(ascii[x][y]);
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Saves the image to a file
     */
    private BufferedImage saveImage() {
        System.out.println("Step 6 of 6: Save image... ");
        BufferedImage saveImage = new BufferedImage(width * Letters.width, height * Letters.height, BufferedImage.TYPE_INT_RGB); //Create a new BufferedImage
        boolean[][] array;
        switch(abc.substring(1)) { //Pick a letter array to use based off the user selected character
            case "A":
                array = Letters.A;
                break;
            case "B":
                array = Letters.B;
                break;
            case "C":
                array = Letters.C;
                break;
            case "D":
                array = Letters.D;
                break;
            case "E":
                array = Letters.E;
                break;
            case "F":
                array = Letters.F;
                break;
            case "G":
                array = Letters.G;
                break;
            case "H":
                array = Letters.H;
                break;
            case "I":
                array = Letters.I;
                break;
            case "J":
                array = Letters.J;
                break;
            case "K":
                array = Letters.K;
                break;
            case "L":
                array = Letters.L;
                break;
            case "M":
                array = Letters.M;
                break;
            case "N":
                array = Letters.N;
                break;
            case "O":
                array = Letters.O;
                break;
            case "P":
                array = Letters.P;
                break;
            case "Q":
                array = Letters.Q;
                break;
            case "R":
                array = Letters.R;
                break;
            case "S":
                array = Letters.S;
                break;
            case "T":
                array = Letters.T;
                break;
            case "U":
                array = Letters.U;
                break;
            case "V":
                array = Letters.V;
                break;
            case "W":
                array = Letters.W;
                break;
            case "X":
                array = Letters.X;
                break;
            case "Y":
                array = Letters.Y;
                break;
            case "Z":
                array = Letters.Z;
                break;
            case "a":
                array = Letters.a;
                break;
            case "b":
                array = Letters.b;
                break;
            case "c":
                array = Letters.c;
                break;
            case "d":
                array = Letters.d;
                break;
            case "e":
                array = Letters.e;
                break;
            case "f":
                array = Letters.f;
                break;
            case "g":
                array = Letters.g;
                break;
            case "h":
                array = Letters.h;
                break;
            case "i":
                array = Letters.i;
                break;
            case "j":
                array = Letters.j;
                break;
            case "k":
                array = Letters.k;
                break;
            case "l":
                array = Letters.l;
                break;
            case "m":
                array = Letters.m;
                break;
            case "n":
                array = Letters.n;
                break;
            case "o":
                array = Letters.o;
                break;
            case "p":
                array = Letters.p;
                break;
            case "q":
                array = Letters.q;
                break;
            case "r":
                array = Letters.r;
                break;
            case "s":
                array = Letters.s;
                break;
            case "t":
                array = Letters.t;
                break;
            case "u":
                array = Letters.u;
                break;
            case "v":
                array = Letters.v;
                break;
            case "w":
                array = Letters.w;
                break;
            case "x":
                array = Letters.x;
                break;
            case "y":
                array = Letters.y;
                break;
            case "z":
                array = Letters.z;
                break;
            case "1":
                array = Letters.num_1;
                break;
            case "2":
                array = Letters.num_2;
                break;
            case "3":
                array = Letters.num_3;
                break;
            case "4":
                array = Letters.num_4;
                break;
            case "5":
                array = Letters.num_5;
                break;
            case "6":
                array = Letters.num_6;
                break;
            case "7":
                array = Letters.num_7;
                break;
            case "8":
                array = Letters.num_8;
                break;
            case "9":
                array = Letters.num_9;
                break;
            case "0":
                array = Letters.num_0;
                break;
            case ".":
                array = Letters.period;
                break;
            case ",":
                array = Letters.comma;
                break;
            case "\"":
                array = Letters.doubleQuotes;
                break;
            case "\'":
                array = Letters.singleQuotes;
                break;
            case "`":
                array = Letters.apostrophe;
                break;
            case "?":
                array = Letters.questionMark;
                break;
            case "!":
                array = Letters.exclamationMark;
                break;
            case "@":
                array = Letters.at;
                break;
            case "_":
                array = Letters.underscore;
                break;
            case "*":
                array = Letters.asterisk;
                break;
            case "#":
                array = Letters.hash;
                break;
            case "$":
                array = Letters.dollar;
                break;
            case "%":
                array = Letters.percent;
                break;
            case "&":
                array = Letters.ampersand;
                break;
            case "(":
                array = Letters.leftBracket;
                break;
            case ")":
                array = Letters.rightBracket;
                break;
            case "+":
                array = Letters.plus;
                break;
            case "-":
                array = Letters.minus;
                break;
            case "/":
                array = Letters.forwardSlash;
                break;
            case "\\":
                array = Letters.backwardSlash;
                break;
            case ":":
                array = Letters.colon;
                break;
            case ";":
                array = Letters.semiColon;
                break;
            case "<":
                array = Letters.leftArrow;
                break;
            case ">":
                array = Letters.rightArrow;
                break;
            case "=":
                array = Letters.equals;
                break;
            case "[":
                array = Letters.leftSquareBracket;
                break;
            case "]":
                array = Letters.rightSquareBracket;
                break;
            case "^":
                array = Letters.power;
                break;
            case "{":
                array = Letters.leftBrace;
                break;
            case "}":
                array = Letters.rightBrace;
                break;
            case "|":
                array = Letters.pipe;
                break;
            case "~":
                array = Letters.tilda;
                break;
            default:
                array = Letters.X;
                break;
        }

        float total = width * height; //Total number of pixels
        float progress = 0; //Current pixel
        int percent = 0; //Percentage completed
        int tempPercent; //If this is the same as percent, DO NOT print to the screen so we don't flood the screen with duplicate percentages
        
        for(int x = 0; x < width; x++) { //For each X...
            for(int y = 0; y < height; y++) { //... and Y
                int[][] col = Letters.getArray(array, scaled[x][y].getRGB(), Color.OPAQUE);
                for(int a = 0; a < Letters.width; a++) {
                    for(int b = 0; b < Letters.height; b++) {
                        saveImage.setRGB((Letters.width * x) + a, (Letters.height * y) + b, col[a][b]);
                    }
                }
                progress++; //Increase the progress
            }
            double fp = (progress / total) * 100; //Actual percentage
            tempPercent = (int) fp; //Integer percentage
            if(tempPercent != percent) { //As described above, this ensures we don't flood the screen with duplicate percentages
                percent = (int) fp;
                System.out.println(percent + "%");
            }
        }

        try { //Try to save the new image to a .jpg file
            File newFile;
            int count = 0; //If the file already exists, don't overwrite it, just increase the numerical counter
            while(true) { //Loop until the filename does not exist
                String name = file.getName() + "_ASCII_" + abc.substring(1) + "_" + count + ".jpg"; //Filename that we will check if it exists
                newFile = new File(name);
                if(newFile.exists()) count++; //If it does, increase the counter and try again
                else break; //If not, exit the loop and save the file
            }
            try {
                ImageIO.write(saveImage, "jpg", newFile); //Save the new image to a jpg formatted file
            } catch(Exception ex) {
                newFile = new File(file.getName() + "_ASCII_" + Integer.toString(ThreadLocalRandom.current().nextInt(1,Integer.MAX_VALUE)) + ".jpg");
                ImageIO.write(saveImage, "jpg", newFile);
            }
        } catch(Exception ex) {
            ex.printStackTrace();
            quit();
        }
        System.out.println("Completed.");
        completed = true;
        try {
            Thread.sleep(50);
        } catch(Exception ex) {
            ex.printStackTrace();
        }
        return saveImage; //Return the image to the calling function (for library use)
    }

    /**
     * Main method for P2A class
     * @param args Arguments passed from command line
     */
    public static void main(String[] args) {
        new Letters().setAll();
        if(args.length < 1) {
            System.out.println("ERROR: You must specify a file!");
            System.out.println("\nCorrect usage: java -jar p2a.jar <filename>");
            try {
                Thread.sleep(2000);
            } catch(InterruptedException ex) {
                ex.printStackTrace();
            }
            System.exit(1);
        } else {
            new P2A().start(args[0]);
        }
        System.out.println("\nThanks for using pic2ascii!\nCreated by Joshua Moore\nhttps://github.com/supamonkey2000/pic2ascii");
    }

    /**
     * Quit the program with an error
     */
    private void quit() {
        System.err.println("WARN: An error has occurred, quitting!");
        try {
            Thread.sleep(2000);
        } catch(InterruptedException ex) {
            ex.printStackTrace();
        }
        System.exit(1);
    }

    class Timer extends Thread {
        int seconds = 0;
        int minutes = 0;
        int hours = 0;
        int days = 0;
        Timer() {

        }
        @Override
        public void run() {
            while(!completed) {
                if(seconds == 60) {
                    seconds = 0;
                    minutes++;
                }
                if(minutes == 60) {
                    minutes = 0;
                    hours++;
                }
                if(hours == 24) {
                    hours = 0;
                    days++;
                }
                try {
                    Thread.sleep(1000);
                } catch(Exception ex) {
                    ex.printStackTrace();
                }
                seconds++;
            }
            try {
                Thread.sleep(20);
            } catch(Exception ex) {
                ex.printStackTrace();
            }
            System.out.println(days + " days, " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds");
        }
    }
}