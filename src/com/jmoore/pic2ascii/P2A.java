package com.jmoore.pic2ascii;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import javax.imageio.ImageIO;

/**
 * Project: Pic2Ascii - Convert an image to ASCII characters
 * @author Joshua Moore
 */
public class P2A {

    private volatile boolean completed = false; //Allows for Timer class to check if the program has completed
    private int width, height; //Width and Height of the image AFTER SCALING
    private Progress status; //Tracks conversion progress from benchmarks and user
    private FinalImage finalImage; //The finished, converted image. It needs its own object since thread objects can't report to a method

    /**
     * Get an ASCII BufferedImage from a String filename
     * @param filename The filename of the image to convert
     * @param abc The character to represent pixels
     * @param scale What to scale the image by (higher value = smaller result)
     * @param multi Whether to use multithreading or not
     * @return The converted ASCII BufferedImage
     */
    @SuppressWarnings("unused")
    public BufferedImage getImage(String filename, String abc, int scale, boolean multi) {
        new Timer().start();
        return saveImage(multi, scale, abc, scaleImage(loadImage(new File(filename)), scale));
    }

    /**
     * Get an ASCII BufferedImage from a normal BufferedImage
     * @param file The file of the image to convert
     * @param abc The character to represent pixels
     * @param scale What to scale the image by (higher value = smaller result)
     * @param multi Whether to use multithreading or not
     * @return The converted ASCII BufferedImage
     */
    @SuppressWarnings("unused")
    public BufferedImage getImage(File file, String abc, int scale, boolean multi) {
        new Timer().start();
        return saveImage(multi, scale, abc, scaleImage(loadImage(file), scale));
    }

    /**
     * Get an ASCII BufferedImage from a normal BufferedImage
     * @param image The image to convert
     * @param abc The character to represent pixels
     * @param scale What to scale the image by (higher value = smaller result)
     * @param multi Whether to use multithreading or not
     * @return The converted ASCII BufferedImage
     */
    @SuppressWarnings("unused")
    public BufferedImage getImage(BufferedImage image, String abc, int scale, boolean multi) {
        new Timer().start();
        return saveImage(multi, scale, abc, scaleImage(image, scale));
    }

    /**
     * Generate an image, but don't save it since it is only for a temporary benchmark
     * @param image The image to use in the benchmark
     * @param multi Whether to use multithreading or not
     */
    private void getBench(BufferedImage image, boolean multi) {
        //Scale of 2 here is for Benchmarking. If your system completes the benchmark too quickly,
        //change this to a 1. If it takes forever (which it shouldn't), change it to 3 or higher.
        saveImage(multi, 2, "X", scaleImage(image, 2));
    }

    /**
     * Beginning of the program. Calls all major methods when run standalone
     * @param filename The filename of the image
     */
    private void start(String filename) {
        File f = new File(filename);
        boolean multi = runBench(); //Ask if single or multi thread, or run benchmark
        int scale = getUserScale(); //Get the scale from the user
        String abc = changeCharacter(); //Ask the user for a character

        new Timer().start(); //Start a new timer
        save(saveImage(multi, scale, abc, scaleImage(loadImage(f), scale)), f, abc);
    }

    /**
     * Run a benchmark to determine if single threading or multithreading is faster
     * @return Whether multithreading should be used
     */
    private boolean runBench() {
        if(Runtime.getRuntime().availableProcessors() > 1) { //Only ask for multiple threads if system has more than 1 core
            System.out.print("Pick either Single Thread (1) or Multi Thread (2), or 0 to run a benchmark: ");
            int option = new Scanner(System.in).nextInt();
            if(option == 1) { //User wants Single Thread...
                return false; //... So we make multi threading false
            } else if(option == 2) { //User wants Multi Thread...
                return true; //... So we make multi threading true
            } else if(option == 0) { //The user is unsure, so we perform a benchmark to determine the best method

                // D I S C L A I M E R
                //The term "benchmark" should be taken loosely here; The benchmark I designed should
                //NOT be used to determine overall system performance. This benchmark is ONLY valid
                //for this program. I still suggest running the benchmark, but don't take the results
                //seriously. Again, they ONLY apply to the performance of this specific program.

                System.err.println("- - BENCHMARKING, PLEASE WAIT - -"); //Print as an error to get users attention
                try(InputStream is = P2A.class.getResourceAsStream("benchmark.jpg")) { //The benchmark image is compiled with the classes, so it is always available as a resource
                    BufferedImage benchImage = ImageIO.read(is); //Read the image to a BufferedImage object

                    System.out.println("Starting Single Thread...");
                    BenchTimer singleTimer = new BenchTimer(); //Separate timers are needed for single and multithreading
                    singleTimer.start(); //Start the timer
                    getBench(benchImage, false); //Run a benchmark WITHOUT multithreading
                    singleTimer.fin = true; //When it is finished, stop the timer (couldn't use 'stop()' since that is already a Thread method with weird rules)
                    int sTime = singleTimer.time; //Save the time from the timer

                    System.out.println("Starting Multi Thread...");
                    BenchTimer multiTimer = new BenchTimer();
                    multiTimer.start();
                    getBench(benchImage, true); //Run a benchmark WITH multithreading
                    multiTimer.fin = true;
                    int mTime = multiTimer.time;

                    System.out.println("\nSingle Thread: " + sTime + "ms\nMulti Thread: " + mTime + "ms");

                    if(sTime > mTime) { //If single thread time is higher, then obviously it's slower
                        System.out.println("Benchmark has determined that multi threading is faster.\n");
                        return true; //Use multithreading
                    } else {
                        System.out.println("Benchmark has determined that single threading is faster.\n");
                        return false; //Use single threading
                    }
                } catch(Exception ex) {
                    ex.printStackTrace();
                    quit();
                }
                return true; //This will never be reached, but is required to compile (and it can't be null)
            } else { //They picked an invalid option...
                quit(); //... and I'm mean so we quit the program
                return false; //Required for compilation
            }
        } else {
            System.out.println("Your system only has one core, using single threading.");
            return false; //Read the above print statement
        }
    }

    /**
     * Load the image into a BufferedImage object
     * @param file The file to read an image from
     * @return A BufferedImage object containing the image
     */
    private BufferedImage loadImage(File file) {
        System.out.print("Loading image... ");
        try {
            BufferedImage image = ImageIO.read(file); //Read the file into a BufferedImage
            System.out.println("Completed.");
            return image;
        } catch(Exception ex) {
            ex.printStackTrace();
            quit();
            return null;
        }
    }

    /**
     * Pick a value from the user to scale the image by.
     * The higher the value, the smaller the result will be. For example, a scale of 2 on an image with a width of 1024 would make the scaled width 512.
     * @return The Integer value scale the user chose
     */
    private int getUserScale() {
        int scale = 0;
        System.out.print("Enter a scale value (higher will produce smaller result): ");
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
     * @return The character to use (yeah I'm calling a String a character, deal with it)
     */
    private String changeCharacter() {
        System.out.print("Enter a character to represent pixels: ");
        String abc = new Scanner(System.in).nextLine();
        return abc.concat(abc); //Make it show each pixel as two characters so scaling works better.
                               //One pixel is a square, but a character is more vertical.
    }

    /**
     * Scale the image into an array of Color objects
     * @param image The image to scale
     * @param scale What to scale the image by
     * @return A 2-dimensional array containing Color objects
     */
    private Color[][] scaleImage(BufferedImage image, int scale) {
        System.out.print("Scaling image... ");
        width = image.getWidth() / scale; //The new width is the original divided by the scale. A higher scale results in a smaller image
        height = image.getHeight() / scale; //The new height is the original divided by the scale. A higher scale results in a smaller image
        Color[][] scaled = new Color[width][height]; //The new color values of the scaled image
        try {
            for(int x = 0; x < width; x++) { //For each value in the X...
                for(int y = 0; y < height; y++) { //... and Y of the new array
                    scaled[x][y] = new Color(image.getRGB(x * scale, y * scale)); //Multiply the current value by the scale so we cover the entire image instead of just a small section
                }
            }
            System.out.println("Completed.");
            return scaled;
        } catch(Exception ex) {
            ex.printStackTrace();
            quit();
            return null;
        }
    }

    /**
     * Despite the "save" in the name, this CONVERTS the image to an "ASCII image"
     * @param multi Whether to use multithreading or not
     * @param scale The scale value
     * @param abc The character to represent pixels
     * @param scaled The 2-dimensional array containing the Color object of the original image
     * @return The converted image as a BufferedImage
     */
    private BufferedImage saveImage(boolean multi, int scale, String abc, Color[][] scaled) {
        System.out.print("Converting image... ");
        finalImage = new FinalImage(); //Create an image object for the threads to report changes to
        boolean[][] array; //The array that holds the one-hot points for a letter
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

        ArrayList<Thread> threads = new ArrayList<>(); //Hold the threads
        int cores; //Number of cores (technically threads but that username is taken XD)
        if(multi) cores = Runtime.getRuntime().availableProcessors();
        else cores = 1;
        int sectionWidth = width / cores; //Divide the image into sections for each thread
        status = new Progress(cores);

        for(int c = 0; c < cores; c++) { //For each core...
            int startX = c * sectionWidth; //The starting X value for the section
            int endX = (c + 1) * sectionWidth; //The ending X value for the section
            ThreadedCompute tc = new ThreadedCompute(c, startX, endX, height, array, scale, scaled); //... create a new Thread
            threads.add(tc); //Add the new thread to our list of threads
            tc.start(); //Start the thread
        }

        //Checks if all threads have completed by iterating through each one, and waiting until it has finished
        for(Thread t : threads) {
            try {
                t.join(); //Wait until the thread has completed
            } catch(Exception ex) {
                ex.printStackTrace();
            }
        }

        System.out.println("Completed.");
        completed = true;
        return finalImage.saveImage; //Return the new image from finalImage
    }

    /**
     * Saves the image to a file
     * @param saveImage The image to save
     * @param file The file the image originated from (used for naming the new file)
     * @param abc The character that was used to convert the image
     */
    private void save(BufferedImage saveImage, File file, String abc) {
        try {
            Thread.sleep(1001); //Ensures that the time is displayed before saving
        } catch(Exception ex) {
            ex.printStackTrace();
        }
        System.out.print("Saving image to disk... ");
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
            } catch(Exception ex) { //If the file could not be saved (perhaps an invalid character), make a valid random name instead
                newFile = new File(file.getName() + "_ASCII_" + Integer.toString(ThreadLocalRandom.current().nextInt(1,Integer.MAX_VALUE)) + ".jpg");
                ImageIO.write(saveImage, "jpg", newFile); //Save the new image to a jpg formatted file with the fixed name
            }
        } catch(Exception ex) {
            ex.printStackTrace();
            quit();
        }
        System.out.println("Completed.");
    }

    /**
     * Gives a background color based off the foreground color to ensure text is legible, and that the image doesn't show up too dark
     * @param red The red value of the foreground color
     * @param green The green value of the foreground color
     * @param blue The blue value of the foreground color
     * @return The new background color
     */
    private int getBackground(int red, int green, int blue) {
        //These values can really be anything you want, as long as they are under 255 and
        //the second one on each line is less than the first. The values here work the best,
        //so I kept them.
        if(red > 36) red -= 35;
        if(green > 36) green -= 35;
        if(blue > 36) blue -= 35;
        return new Color(red, green, blue).getRGB();
    }

    /**
     * Main method for P2A class
     * @param args Arguments passed from command line (in this case, an image)
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
        System.exit(1); //Exit status 1 means error
    }

    /**
     * Creates a "computing" object for contributing to a new image
     */
    class ThreadedCompute extends Thread {
        int startX, endX, height, threadID, scale; //If you read the rest of the docs then this should be self-explanatory
        boolean[][] array; //2-dimensional array containing the one-hot values for a Letter
        float total; //The total number of pixels this Object must handle
        float progress = 0; //Tracks progress
        int percent = 0; //Sort of the same as the above but does a different task
        int tempPercent;
        Color[][] scaled; //2-dimensional array containing the Colors from the scaled original

        ThreadedCompute(int threadID, int startX, int endX, int height, boolean[][] array, int scale, Color[][] scaled) {
            this.threadID = threadID;
            this.startX = startX;
            this.endX = endX;
            this.height = height;
            this.array = array;
            total = (endX - startX) * height;
            this.scale = scale;
            this.scaled = scaled;
        }

        @Override
        public void run() {
            for(int x = startX; x < endX; x++) { //For each X...
                for(int y = 0; y < height; y++) { //... and Y
                    int background = getBackground(scaled[x][y].getRed(), scaled[x][y].getGreen(), scaled[x][y].getBlue()); //Get a new background color based of the foreground
                    int[][] col = Letters.getArray(array, scaled[x][y].getRGB(), background); //Get the letter array for the new sections
                    for(int a = 0; a < Letters.width; a++) { //For each "width" in the letter array
                        for(int b = 0; b < Letters.height; b++) { //For each "height" in the letter array
                            finalImage.saveImage.setRGB((Letters.width * x) + a, (Letters.height * y) + b, col[a][b]); //Tricky maths
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
                if(tempPercent != percent) { //This ensures we don't flood the screen with duplicate percentages
                    percent = (int) fp;
                    status.updateProgress(threadID, percent); //Alert the Progress object of a progress update
                }
            }
            System.out.println("Thread " + threadID + " has completed.");
        }
    }

    /**
     * For monitoring the length of time the program takes to execute (not benchmarks). Counts by seconds, minutes, hours, and days. Runs on a separate Thread.
     */
    class Timer extends Thread {
        int seconds = 0;
        int minutes = 0;
        int hours = 0;
        int days = 0;

        @Override
        public void run() {
            completed = false;
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
                Thread.sleep(0);
            } catch(Exception ex) {
                ex.printStackTrace();
            }
            System.out.println(days + " days, " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds");
        }
    }

    /**
     * Millisecond timer for doing benchmarks
     */
    class BenchTimer extends Thread {
        int time = 0;
        boolean fin = false; //Means finished in french
        @Override
        public void run() {
            while(!fin) { //While we are not finished, increase the timer
                try {
                    Thread.sleep(1);
                } catch(Exception ex) {
                    ex.printStackTrace();
                }
                time++;
            }
        }
    }

    /**
     * Gets progress updates from each computing thread, and prints progress to the screen
     */
    class Progress {
        int[] threadProgress; //Contains the values for each thread
        int tempProgress, progress;

        /**
         * Constructor for Progress
         * @param threads The number of threads
         */
        Progress(int threads) {
            threadProgress = new int[threads];
            tempProgress = 0;
            progress = 0;
        }

        /**
         * Update the overall progress from all the threads
         * @param id The thread ID that is reporting
         * @param newProgress The threads progress
         */
        void updateProgress(int id, int newProgress) {
            threadProgress[id] = newProgress;
            tempProgress = 0;
            for(int p : threadProgress) { //Add the values of each threads progress to the temporary progress
                tempProgress += p;
            }
            tempProgress /= threadProgress.length; //Divide by the number of threads to get the overall average
            if(tempProgress != progress) { //Ensures we don't print duplicates to the screen
                System.out.println(tempProgress + "%");
                progress = tempProgress;
            }
        }
    }

    /**
     * Pretty much useless, but required
     */
    class FinalImage {
        BufferedImage saveImage = new BufferedImage(width * Letters.width, height * Letters.height, BufferedImage.TYPE_INT_RGB); //Create a new BufferedImage
    }
}