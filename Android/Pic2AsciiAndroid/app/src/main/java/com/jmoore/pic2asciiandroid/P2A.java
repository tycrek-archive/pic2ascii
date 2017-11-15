package com.jmoore.pic2asciiandroid;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * Project: Pic2Ascii - Convert an image to ASCII characters
 * @author Joshua Moore
 */
public class P2A {

    private File file;
    private int[][] scaled; //Contains the colors for each pixel of the scaled image
    private Bitmap image = null; //Stores the image
    private String abc; //The character to display
    private volatile boolean completed = false;

    private int width, height; //Width and height of the SCALED image

    private Bitmap saveImage;
    private int[] threadProgress;
    private int cores;

    /**
     * Get an ASCII Bitmap from a String filename
     * @param filename The filename of the image to convert
     * @param abc The character to represent pixels
     * @param scale What to scale the image by (higher value = smaller result)
     * @return The converted ASCII Bitmap
     */
    @SuppressWarnings("unused")
    public Bitmap getImage(String filename, String abc, int scale) {
        new Letters().setAll();
        new Timer().start();
        file = new File(filename);
        loadImage();
        this.abc = abc;
        scaleImage(scale);
        return saveImage();
    }

    /**
     * Get an ASCII Bitmap from a normal Bitmap
     * @param file The file of the image to convert
     * @param abc The character to represent pixels
     * @param scale What to scale the image by (higher value = smaller result)
     * @return The converted ASCII Bitmap
     */
    @SuppressWarnings("unused")
    public Bitmap getImage(File file, String abc, int scale) {
        new Letters().setAll();
        new Timer().start();
        this.file = file;
        loadImage();
        this.abc = abc;
        scaleImage(scale);
        return saveImage();
    }

    /**
     * Get an ASCII Bitmap from a normal Bitmap
     * @param image The image to convert
     * @param abc The character to represent pixels
     * @param scale What to scale the image by (higher value = smaller result)
     * @return The converted ASCII Bitmap
     */
    @SuppressWarnings("unused")
    public Bitmap getImage(Bitmap image, String abc, int scale) {
        new Letters().setAll();
        new Timer().start();
        this.image = image;
        this.abc = abc;
        scaleImage(scale);
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
        //printImage();
        saveImage();
    }

    /**
     * Load the image into a Bitmap object
     * @return Whether the image was loaded or not
     */
    private boolean loadImage() {
        System.out.print("Step 1 of 5: Load image... ");
        try {
            image = BitmapFactory.decodeFile(file.getAbsolutePath()); //Read the file into the Bitmap
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
        System.out.print("Step 2 of 5: Enter a scale value (higher will produce smaller result): ");
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
        System.out.print("Step 3 of 5: Enter a character to represent pixels: ");
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
        System.out.print("Step 4 of 5: Scale image... ");
        width = image.getWidth() / scale; //The new width is the original divided by the scale. A higher scale results in a smaller image
        height = image.getHeight() / scale; //The new height is the original divided by the scale. A higher scale results in a smaller image
        scaled = new int[width][height]; //The new color values of the scaled image
        try {
            for(int x = 0; x < width; x++) { //For each value in the X...
                for(int y = 0; y < height; y++) { //... and Y of the new array
                    int red = Color.red(image.getPixel(x * scale,y * scale));
                    int green = Color.green(image.getPixel(x * scale,y * scale));
                    int blue = Color.blue(image.getPixel(x * scale,y * scale));
                    scaled[x][y] = Color.rgb(red, green, blue); //Multiply the current value by the scale so we cover the entire image instead of just a small section

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
     * Saves the image to a file
     */
    private Bitmap saveImage() {
        System.out.println("Step 5 of 5: Save image... ");
        saveImage = Bitmap.createBitmap(width * Letters.width, height * Letters.height, Bitmap.Config.RGB_565); //Create a new Bitmap
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

        ArrayList<Thread> threads = new ArrayList<>();
        cores = Runtime.getRuntime().availableProcessors();
        //cores = 1;
        int sectionWidth = width / cores;
        threadProgress = new int[cores];

        for(int c = 0; c < cores; c++) {
            int startX = c * sectionWidth;
            int endX = (c + 1) * sectionWidth;
            ThreadedCompute tc = new ThreadedCompute(c, startX, endX, height, array);
            threads.add(tc);
            threadProgress[c] = 0;
            tc.start();
        }

        System.out.println("Cores: " + cores + ", Threads: " + threads.size());

        for(Thread t : threads) {
            try {
                t.join();
            } catch(Exception ex) {
                ex.printStackTrace();
            }
        }

        try { //Try to save the new image to a .jpg file
            File newFile;
            int count = 0; //If the file already exists, don't overwrite it, just increase the numerical counter
            while(true) { //Loop until the filename does not exist
                String name = "ANDROID" + "_ASCII_" + abc.substring(1) + "_" + count + ".jpg"; //Filename that we will check if it exists
                newFile = new File(name);
                if(newFile.exists()) count++; //If it does, increase the counter and try again
                else break; //If not, exit the loop and save the file
            }
            /*try {
                ImageIO.write(saveImage, "jpg", newFile); //Save the new image to a jpg formatted file
            } catch(Exception ex) {
                newFile = new File(file.getName() + "_ASCII_" + Integer.toString(ThreadLocalRandom.current().nextInt(1,Integer.MAX_VALUE)) + ".jpg");
                ImageIO.write(saveImage, "jpg", newFile);
            }*/
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
     * Gives a background color based off the foreground color to ensure text is legible, and that the image doesn't show up too dark
     * @param red The red value of the foreground color
     * @param green The green value of the foreground color
     * @param blue The blue value of the foreground color
     * @return The new background color
     */
    private int getBackground(int red, int green, int blue) {
        if(red > 36) red -= 35;
        if(green > 36) green -= 35;
        if(blue > 36) blue -= 35;
        return Color.rgb(red, green, blue);
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

    private void updatePercent() {
        int total = 0;
        for(int i : threadProgress) {
            total += i;
        }
        MainActivity.updatePercent(total / cores);
    }

    class ThreadedCompute extends Thread {
        int startX, endX, height, threadID;
        boolean[][] array;

        float total; //Total number of pixels
        float progress = 0; //Current pixel
        int percent = 0; //Percentage completed
        int tempPercent; //If this is the same as percent, DO NOT print to the screen so we don't flood the screen with duplicate percentages

        ThreadedCompute(int threadID, int startX, int endX, int height, boolean[][] array) {
            this.threadID = threadID;
            this.startX = startX;
            this.endX = endX;
            this.height = height;
            this.array = array;
            total = (endX - startX) * height;
        }

        @Override
        public void run() {
            for(int x = startX; x < endX; x++) { //For each X...
                for(int y = 0; y < height; y++) { //... and Y
                    int background = getBackground(Color.red(scaled[x][y]), Color.green(scaled[x][y]), Color.blue(scaled[x][y])); //Get a new background color based of the foreground
                    int[][] col = Letters.getArray(array, Color.rgb(Color.red(scaled[x][y]),Color.green(scaled[x][y]),Color.blue(scaled[x][y])), background); //Get the letter array for the new sections
                    for(int a = 0; a < Letters.width; a++) { //For each "width" in the letter array
                        for(int b = 0; b < Letters.height; b++) { //For each "height" in the letter array
                            saveImage.setPixel((Letters.width * x) + a, (Letters.height * y) + b, col[a][b]); //Tricky maths
                            //Basically, X and Y are the width and height for the scaled image array. For
                            //each SINGLE coordinate, we need to make a new 6x8 section for the new image.
                            //This is done by the setRGB, which takes an X and a Y. We have a second pair
                            //of for loops for the new section. So the X in the new saveImage is the Letter
                            //width (6) multiplied by the current scaled X, plus A, the position in the
                            //letter array. Maybe this is a better explanation:
                            // If X and Y are 0, we want to make a new section in the new image ranging
                            // from (0,0), the scaled coordinate, to (6,8), the end of the new section.
                            // For the X, 0 times 6 is 0, plus an A of 0, is 0.
                            // The next X, 0 times 6 is 0, plus an A of 1, is 1.
                            // If we go further down the image, with X being a 16 for example, 16 times
                            // 6 is 96. 96 is the starting coordinate of the original pixel (at X 16),
                            // with an end coordinate of 96 + 6 (the Letter width).
                            // I honestly don't know if I can explain it any easier. In my opinion,
                            // always follow this motto (unless it's a professional project which this
                            // is not):
                            //
                            // I F   I T   W A S   H A R D   T O   W R I T E ,   T H E N   I T
                            // S H O U L D   B E   H A R D   T O   U N D E R S T A N D .
                        }
                    }
                    progress++; //Increase the progress
                }
                double fp = (progress / total) * 100; //Actual percentage
                tempPercent = (int) fp; //Integer percentage
                if(tempPercent != percent) { //As described above, this ensures we don't flood the screen with duplicate percentages
                    percent = (int) fp;
                    threadProgress[threadID] = percent;
                    updatePercent();
                }
            }
        }
    }

    /**
     * For monitoring the length of time the program takes to execute. Runs on a separate Thread
     */
    class Timer extends Thread {
        int seconds = 0;
        int minutes = 0;
        int hours = 0;
        int days = 0;

        @Override
        public void run() {
            while(!completed) { //Run as long as the program has not completed
                if(seconds == 60) { //Increase the minute counter
                    seconds = 0;
                    minutes++;
                }
                if(minutes == 60) { //Increase the hours counter
                    minutes = 0;
                    hours++;
                }
                if(hours == 24) { //Dear god either your image is 55 mega-pixels and running on a cloud server with terabytes of RAM, or your computer is excruciatingly slow
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