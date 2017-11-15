package com.jmoore.pic2asciiandroid;

class Letters {

     static final int width = 6;
     static final int height = 8;

     static boolean[][]a = new boolean[width][height];
     static boolean[][]b = new boolean[width][height];
     static boolean[][]c = new boolean[width][height];
     static boolean[][]d = new boolean[width][height];
     static boolean[][]e = new boolean[width][height];
     static boolean[][]f = new boolean[width][height];
     static boolean[][]g = new boolean[width][height];
     static boolean[][]h = new boolean[width][height];
     static boolean[][]i = new boolean[width][height];
     static boolean[][]j = new boolean[width][height];
     static boolean[][]k = new boolean[width][height];
     static boolean[][]l = new boolean[width][height];
     static boolean[][]m = new boolean[width][height];
     static boolean[][]n = new boolean[width][height];
     static boolean[][]o = new boolean[width][height];
     static boolean[][]p = new boolean[width][height];
     static boolean[][]q = new boolean[width][height];
     static boolean[][]r = new boolean[width][height];
     static boolean[][]s = new boolean[width][height];
     static boolean[][]t = new boolean[width][height];
     static boolean[][]u = new boolean[width][height];
     static boolean[][]v = new boolean[width][height];
     static boolean[][]w = new boolean[width][height];
     static boolean[][]x = new boolean[width][height];
     static boolean[][]y = new boolean[width][height];
     static boolean[][]z = new boolean[width][height];
     static boolean[][]A = new boolean[width][height];
     static boolean[][]B = new boolean[width][height];
     static boolean[][]C = new boolean[width][height];
     static boolean[][]D = new boolean[width][height];
     static boolean[][]E = new boolean[width][height];
     static boolean[][]F = new boolean[width][height];
     static boolean[][]G = new boolean[width][height];
     static boolean[][]H = new boolean[width][height];
     static boolean[][]I = new boolean[width][height];
     static boolean[][]J = new boolean[width][height];
     static boolean[][]K = new boolean[width][height];
     static boolean[][]L = new boolean[width][height];
     static boolean[][]M = new boolean[width][height];
     static boolean[][]N = new boolean[width][height];
     static boolean[][]O = new boolean[width][height];
     static boolean[][]P = new boolean[width][height];
     static boolean[][]Q = new boolean[width][height];
     static boolean[][]R = new boolean[width][height];
     static boolean[][]S = new boolean[width][height];
     static boolean[][]T = new boolean[width][height];
     static boolean[][]U = new boolean[width][height];
     static boolean[][]V = new boolean[width][height];
     static boolean[][]W = new boolean[width][height];
     static boolean[][]X = new boolean[width][height];
     static boolean[][]Y = new boolean[width][height];
     static boolean[][]Z = new boolean[width][height];
     static boolean[][]num_0 = new boolean[width][height];
     static boolean[][]num_1 = new boolean[width][height];
     static boolean[][]num_2 = new boolean[width][height];
     static boolean[][]num_3 = new boolean[width][height];
     static boolean[][]num_4 = new boolean[width][height];
     static boolean[][]num_5 = new boolean[width][height];
     static boolean[][]num_6 = new boolean[width][height];
     static boolean[][]num_7 = new boolean[width][height];
     static boolean[][]num_8 = new boolean[width][height];
     static boolean[][]num_9 = new boolean[width][height];
     static boolean[][]period = new boolean[width][height];
     static boolean[][]comma = new boolean[width][height];
     static boolean[][]doubleQuotes = new boolean[width][height];
     static boolean[][]singleQuotes = new boolean[width][height];
     static boolean[][]apostrophe = new boolean[width][height];
     static boolean[][]questionMark = new boolean[width][height];
     static boolean[][]exclamationMark = new boolean[width][height];
     static boolean[][]at = new boolean[width][height];
     static boolean[][]underscore = new boolean[width][height];
     static boolean[][]asterisk = new boolean[width][height];
     static boolean[][]hash = new boolean[width][height];
     static boolean[][]dollar = new boolean[width][height];
     static boolean[][]percent = new boolean[width][height];
     static boolean[][]ampersand = new boolean[width][height];
     static boolean[][]leftBracket = new boolean[width][height];
     static boolean[][]rightBracket = new boolean[width][height];
     static boolean[][]plus = new boolean[width][height];
     static boolean[][]minus = new boolean[width][height];
     static boolean[][]forwardSlash = new boolean[width][height];
     static boolean[][]backwardSlash = new boolean[width][height];
     static boolean[][]colon = new boolean[width][height];
     static boolean[][]semiColon = new boolean[width][height];
     static boolean[][]leftArrow = new boolean[width][height];
     static boolean[][]rightArrow = new boolean[width][height];
     static boolean[][]equals = new boolean[width][height];
     static boolean[][]leftSquareBracket = new boolean[width][height];
     static boolean[][]rightSquareBracket = new boolean[width][height];
     static boolean[][]power = new boolean[width][height];
     static boolean[][]leftBrace = new boolean[width][height];
     static boolean[][]rightBrace = new boolean[width][height];
     static boolean[][]pipe = new boolean[width][height];
     static boolean[][]tilda = new boolean[width][height];

    /**
     * Give a character array with the correct colors
     * @param character The character array to colorize
     * @param color The foreground color (the actual text)
     * @param background The background color (behind the text)
     * @return The colorized character array
     */
    static int[][] getArray(boolean[][] character, int color, int background) {
        int[][] colors = new int[width][height];
        for(int x = 0; x < width; x++) {
            for(int y = 0; y < height; y++) {
                if(character[x][y]) colors[x][y] = color;
                else colors[x][y] = background;
            }
        }
        return colors;
    }

    /**
     * Set all the character arrays
     */
    void setAll() {
        //A
        A[0][0] = false; A[1][0] = true; A[2][0] = true; A[3][0] = true; A[4][0] = false; A[5][0] = false;
        A[0][1] = true; A[1][1] = false; A[2][1] = false; A[3][1] = false; A[4][1] = true; A[5][1] = false;
        A[0][2] = true; A[1][2] = false; A[2][2] = false; A[3][2] = false; A[4][2] = true; A[5][2] = false;
        A[0][3] = true; A[1][3] = true; A[2][3] = true; A[3][3] = true; A[4][3] = true; A[5][3] = false;
        A[0][4] = true; A[1][4] = false; A[2][4] = false; A[3][4] = false; A[4][4] = true; A[5][4] = false;
        A[0][5] = true; A[1][5] = false; A[2][5] = false; A[3][5] = false; A[4][5] = true; A[5][5] = false;
        A[0][6] = true; A[1][6] = false; A[2][6] = false; A[3][6] = false; A[4][6] = true; A[5][6] = false;
        A[0][7] = false; A[1][7] = false; A[2][7] = false; A[3][7] = false; A[4][7] = false; A[5][7] = false;
        //B
        B[0][0] = true; B[1][0] = true; B[2][0] = true; B[3][0] = true; B[4][0] = false; B[5][0] = false;
        B[0][1] = true; B[1][1] = false; B[2][1] = false; B[3][1] = false; B[4][1] = true; B[5][1] = false;
        B[0][2] = true; B[1][2] = false; B[2][2] = false; B[3][2] = false; B[4][2] = true; B[5][2] = false;
        B[0][3] = true; B[1][3] = true; B[2][3] = true; B[3][3] = true; B[4][3] = false; B[5][3] = false;
        B[0][4] = true; B[1][4] = false; B[2][4] = false; B[3][4] = false; B[4][4] = true; B[5][4] = false;
        B[0][5] = true; B[1][5] = false; B[2][5] = false; B[3][5] = false; B[4][5] = true; B[5][5] = false;
        B[0][6] = true; B[1][6] = true; B[2][6] = true; B[3][6] = true; B[4][6] = false; B[5][6] = false;
        B[0][7] = false; B[1][7] = false; B[2][7] = false; B[3][7] = false; B[4][7] = false; B[5][7] = false;
        //C
        C[0][0] = false; C[1][0] = true; C[2][0] = true; C[3][0] = true; C[4][0] = false; C[5][0] = false;
        C[0][1] = true; C[1][1] = false; C[2][1] = false; C[3][1] = false; C[4][1] = true; C[5][1] = false;
        C[0][2] = true; C[1][2] = false; C[2][2] = false; C[3][2] = false; C[4][2] = false; C[5][2] = false;
        C[0][3] = true; C[1][3] = false; C[2][3] = false; C[3][3] = false; C[4][3] = false; C[5][3] = false;
        C[0][4] = true; C[1][4] = false; C[2][4] = false; C[3][4] = false; C[4][4] = false; C[5][4] = false;
        C[0][5] = true; C[1][5] = false; C[2][5] = false; C[3][5] = false; C[4][5] = true; C[5][5] = false;
        C[0][6] = false; C[1][6] = true; C[2][6] = true; C[3][6] = true; C[4][6] = false; C[5][6] = false;
        C[0][7] = false; C[1][7] = false; C[2][7] = false; C[3][7] = false; C[4][7] = false; C[5][7] = false;
        //D
        D[0][0] = true; D[1][0] = true; D[2][0] = true; D[3][0] = false; D[4][0] = false; D[5][0] = false;
        D[0][1] = true; D[1][1] = false; D[2][1] = false; D[3][1] = true; D[4][1] = false; D[5][1] = false;
        D[0][2] = true; D[1][2] = false; D[2][2] = false; D[3][2] = false; D[4][2] = true; D[5][2] = false;
        D[0][3] = true; D[1][3] = false; D[2][3] = false; D[3][3] = false; D[4][3] = true; D[5][3] = false;
        D[0][4] = true; D[1][4] = false; D[2][4] = false; D[3][4] = false; D[4][4] = true; D[5][4] = false;
        D[0][5] = true; D[1][5] = false; D[2][5] = false; D[3][5] = true; D[4][5] = false; D[5][5] = false;
        D[0][6] = true; D[1][6] = true; D[2][6] = true; D[3][6] = false; D[4][6] = false; D[5][6] = false;
        D[0][7] = false; D[1][7] = false; D[2][7] = false; D[3][7] = false; D[4][7] = false; D[5][7] = false;
        //E
        E[0][0] = true; E[1][0] = true; E[2][0] = true; E[3][0] = true; E[4][0] = true; E[5][0] = false;
        E[0][1] = true; E[1][1] = false; E[2][1] = false; E[3][1] = false; E[4][1] = false; E[5][1] = false;
        E[0][2] = true; E[1][2] = false; E[2][2] = false; E[3][2] = false; E[4][2] = false; E[5][2] = false;
        E[0][3] = true; E[1][3] = true; E[2][3] = true; E[3][3] = true; E[4][3] = false; E[5][3] = false;
        E[0][4] = true; E[1][4] = false; E[2][4] = false; E[3][4] = false; E[4][4] = false; E[5][4] = false;
        E[0][5] = true; E[1][5] = false; E[2][5] = false; E[3][5] = false; E[4][5] = false; E[5][5] = false;
        E[0][6] = true; E[1][6] = true; E[2][6] = true; E[3][6] = true; E[4][6] = true; E[5][6] = false;
        E[0][7] = false; E[1][7] = false; E[2][7] = false; E[3][7] = false; E[4][7] = false; E[5][7] = false;
        //F
        F[0][0] = true; F[1][0] = true; F[2][0] = true; F[3][0] = true; F[4][0] = true; F[5][0] = false;
        F[0][1] = true; F[1][1] = false; F[2][1] = false; F[3][1] = false; F[4][1] = false; F[5][1] = false;
        F[0][2] = true; F[1][2] = false; F[2][2] = false; F[3][2] = false; F[4][2] = false; F[5][2] = false;
        F[0][3] = true; F[1][3] = true; F[2][3] = true; F[3][3] = true; F[4][3] = false; F[5][3] = false;
        F[0][4] = true; F[1][4] = false; F[2][4] = false; F[3][4] = false; F[4][4] = false; F[5][4] = false;
        F[0][5] = true; F[1][5] = false; F[2][5] = false; F[3][5] = false; F[4][5] = false; F[5][5] = false;
        F[0][6] = true; F[1][6] = false; F[2][6] = false; F[3][6] = false; F[4][6] = false; F[5][6] = false;
        F[0][7] = false; F[1][7] = false; F[2][7] = false; F[3][7] = false; F[4][7] = false; F[5][7] = false;
        //G
        G[0][0] = false; G[1][0] = true; G[2][0] = true; G[3][0] = true; G[4][0] = false; G[5][0] = false;
        G[0][1] = true; G[1][1] = false; G[2][1] = false; G[3][1] = false; G[4][1] = true; G[5][1] = false;
        G[0][2] = true; G[1][2] = false; G[2][2] = false; G[3][2] = false; G[4][2] = false; G[5][2] = false;
        G[0][3] = true; G[1][3] = false; G[2][3] = true; G[3][3] = true; G[4][3] = true; G[5][3] = false;
        G[0][4] = true; G[1][4] = false; G[2][4] = false; G[3][4] = false; G[4][4] = true; G[5][4] = false;
        G[0][5] = true; G[1][5] = false; G[2][5] = false; G[3][5] = false; G[4][5] = true; G[5][5] = false;
        G[0][6] = false; G[1][6] = true; G[2][6] = true; G[3][6] = true; G[4][6] = true; G[5][6] = false;
        G[0][7] = false; G[1][7] = false; G[2][7] = false; G[3][7] = false; G[4][7] = false; G[5][7] = false;
        //H
        H[0][0] = true; H[1][0] = false; H[2][0] = false; H[3][0] = false; H[4][0] = true; H[5][0] = false;
        H[0][1] = true; H[1][1] = false; H[2][1] = false; H[3][1] = false; H[4][1] = true; H[5][1] = false;
        H[0][2] = true; H[1][2] = false; H[2][2] = false; H[3][2] = false; H[4][2] = true; H[5][2] = false;
        H[0][3] = true; H[1][3] = true; H[2][3] = true; H[3][3] = true; H[4][3] = true; H[5][3] = false;
        H[0][4] = true; H[1][4] = false; H[2][4] = false; H[3][4] = false; H[4][4] = true; H[5][4] = false;
        H[0][5] = true; H[1][5] = false; H[2][5] = false; H[3][5] = false; H[4][5] = true; H[5][5] = false;
        H[0][6] = true; H[1][6] = false; H[2][6] = false; H[3][6] = false; H[4][6] = true; H[5][6] = false;
        H[0][7] = false; H[1][7] = false; H[2][7] = false; H[3][7] = false; H[4][7] = false; H[5][7] = false;
        //I
        I[0][0] = false; I[1][0] = true; I[2][0] = true; I[3][0] = true; I[4][0] = false; I[5][0] = false;
        I[0][1] = false; I[1][1] = false; I[2][1] = true; I[3][1] = false; I[4][1] = false; I[5][1] = false;
        I[0][2] = false; I[1][2] = false; I[2][2] = true; I[3][2] = false; I[4][2] = false; I[5][2] = false;
        I[0][3] = false; I[1][3] = false; I[2][3] = true; I[3][3] = false; I[4][3] = false; I[5][3] = false;
        I[0][4] = false; I[1][4] = false; I[2][4] = true; I[3][4] = false; I[4][4] = false; I[5][4] = false;
        I[0][5] = false; I[1][5] = false; I[2][5] = true; I[3][5] = false; I[4][5] = false; I[5][5] = false;
        I[0][6] = false; I[1][6] = true; I[2][6] = true; I[3][6] = true; I[4][6] = false; I[5][6] = false;
        I[0][7] = false; I[1][7] = false; I[2][7] = false; I[3][7] = false; I[4][7] = false; I[5][7] = false;
        //J
        J[0][0] = false; J[1][0] = false; J[2][0] = true; J[3][0] = true; J[4][0] = true; J[5][0] = false;
        J[0][1] = false; J[1][1] = false; J[2][1] = false; J[3][1] = true; J[4][1] = false; J[5][1] = false;
        J[0][2] = false; J[1][2] = false; J[2][2] = false; J[3][2] = true; J[4][2] = false; J[5][2] = false;
        J[0][3] = false; J[1][3] = false; J[2][3] = false; J[3][3] = true; J[4][3] = false; J[5][3] = false;
        J[0][4] = false; J[1][4] = false; J[2][4] = false; J[3][4] = true; J[4][4] = false; J[5][4] = false;
        J[0][5] = true; J[1][5] = false; J[2][5] = false; J[3][5] = true; J[4][5] = false; J[5][5] = false;
        J[0][6] = false; J[1][6] = true; J[2][6] = true; J[3][6] = false; J[4][6] = false; J[5][6] = false;
        J[0][7] = false; J[1][7] = false; J[2][7] = false; J[3][7] = false; J[4][7] = false; J[5][7] = false;
        //K
        K[0][0] = true; K[1][0] = false; K[2][0] = false; K[3][0] = false; K[4][0] = true; K[5][0] = false;
        K[0][1] = true; K[1][1] = false; K[2][1] = false; K[3][1] = true; K[4][1] = false; K[5][1] = false;
        K[0][2] = true; K[1][2] = false; K[2][2] = true; K[3][2] = false; K[4][2] = false; K[5][2] = false;
        K[0][3] = true; K[1][3] = true; K[2][3] = false; K[3][3] = false; K[4][3] = false; K[5][3] = false;
        K[0][4] = true; K[1][4] = false; K[2][4] = true; K[3][4] = false; K[4][4] = false; K[5][4] = false;
        K[0][5] = true; K[1][5] = false; K[2][5] = false; K[3][5] = true; K[4][5] = false; K[5][5] = false;
        K[0][6] = true; K[1][6] = false; K[2][6] = false; K[3][6] = false; K[4][6] = true; K[5][6] = false;
        K[0][7] = false; K[1][7] = false; K[2][7] = false; K[3][7] = false; K[4][7] = false; K[5][7] = false;
        //L
        L[0][0] = true; L[1][0] = false; L[2][0] = false; L[3][0] = false; L[4][0] = false; L[5][0] = false;
        L[0][1] = true; L[1][1] = false; L[2][1] = false; L[3][1] = false; L[4][1] = false; L[5][1] = false;
        L[0][2] = true; L[1][2] = false; L[2][2] = false; L[3][2] = false; L[4][2] = false; L[5][2] = false;
        L[0][3] = true; L[1][3] = false; L[2][3] = false; L[3][3] = false; L[4][3] = false; L[5][3] = false;
        L[0][4] = true; L[1][4] = false; L[2][4] = false; L[3][4] = false; L[4][4] = false; L[5][4] = false;
        L[0][5] = true; L[1][5] = false; L[2][5] = false; L[3][5] = false; L[4][5] = false; L[5][5] = false;
        L[0][6] = true; L[1][6] = true; L[2][6] = true; L[3][6] = true; L[4][6] = true; L[5][6] = false;
        L[0][7] = false; L[1][7] = false; L[2][7] = false; L[3][7] = false; L[4][7] = false; L[5][7] = false;
        //M
        M[0][0] = true; M[1][0] = false; M[2][0] = false; M[3][0] = false; M[4][0] = true; M[5][0] = false;
        M[0][1] = true; M[1][1] = true; M[2][1] = false; M[3][1] = true; M[4][1] = true; M[5][1] = false;
        M[0][2] = true; M[1][2] = false; M[2][2] = true; M[3][2] = false; M[4][2] = true; M[5][2] = false;
        M[0][3] = true; M[1][3] = false; M[2][3] = true; M[3][3] = false; M[4][3] = true; M[5][3] = false;
        M[0][4] = true; M[1][4] = false; M[2][4] = false; M[3][4] = false; M[4][4] = true; M[5][4] = false;
        M[0][5] = true; M[1][5] = false; M[2][5] = false; M[3][5] = false; M[4][5] = true; M[5][5] = false;
        M[0][6] = true; M[1][6] = false; M[2][6] = false; M[3][6] = false; M[4][6] = true; M[5][6] = false;
        M[0][7] = false; M[1][7] = false; M[2][7] = false; M[3][7] = false; M[4][7] = false; M[5][7] = false;
        //N
        N[0][0] = true; N[1][0] = false; N[2][0] = false; N[3][0] = false; N[4][0] = true; N[5][0] = false;
        N[0][1] = true; N[1][1] = false; N[2][1] = false; N[3][1] = false; N[4][1] = true; N[5][1] = false;
        N[0][2] = true; N[1][2] = true; N[2][2] = false; N[3][2] = false; N[4][2] = true; N[5][2] = false;
        N[0][3] = true; N[1][3] = false; N[2][3] = true; N[3][3] = false; N[4][3] = true; N[5][3] = false;
        N[0][4] = true; N[1][4] = false; N[2][4] = false; N[3][4] = true; N[4][4] = true; N[5][4] = false;
        N[0][5] = true; N[1][5] = false; N[2][5] = false; N[3][5] = false; N[4][5] = true; N[5][5] = false;
        N[0][6] = true; N[1][6] = false; N[2][6] = false; N[3][6] = false; N[4][6] = true; N[5][6] = false;
        N[0][7] = false; N[1][7] = false; N[2][7] = false; N[3][7] = false; N[4][7] = false; N[5][7] = false;
        //O
        O[0][0] = false; O[1][0] = true; O[2][0] = true; O[3][0] = true; O[4][0] = false; O[5][0] = false;
        O[0][1] = true; O[1][1] = false; O[2][1] = false; O[3][1] = false; O[4][1] = true; O[5][1] = false;
        O[0][2] = true; O[1][2] = false; O[2][2] = false; O[3][2] = false; O[4][2] = true; O[5][2] = false;
        O[0][3] = true; O[1][3] = false; O[2][3] = false; O[3][3] = false; O[4][3] = true; O[5][3] = false;
        O[0][4] = true; O[1][4] = false; O[2][4] = false; O[3][4] = false; O[4][4] = true; O[5][4] = false;
        O[0][5] = true; O[1][5] = false; O[2][5] = false; O[3][5] = false; O[4][5] = true; O[5][5] = false;
        O[0][6] = false; O[1][6] = true; O[2][6] = true; O[3][6] = true; O[4][6] = false; O[5][6] = false;
        O[0][7] = false; O[1][7] = false; O[2][7] = false; O[3][7] = false; O[4][7] = false; O[5][7] = false;
        //P
        P[0][0] = true; P[1][0] = true; P[2][0] = true; P[3][0] = true; P[4][0] = false; P[5][0] = false;
        P[0][1] = true; P[1][1] = false; P[2][1] = false; P[3][1] = false; P[4][1] = true; P[5][1] = false;
        P[0][2] = true; P[1][2] = false; P[2][2] = false; P[3][2] = false; P[4][2] = true; P[5][2] = false;
        P[0][3] = true; P[1][3] = true; P[2][3] = true; P[3][3] = true; P[4][3] = false; P[5][3] = false;
        P[0][4] = true; P[1][4] = false; P[2][4] = false; P[3][4] = false; P[4][4] = false; P[5][4] = false;
        P[0][5] = true; P[1][5] = false; P[2][5] = false; P[3][5] = false; P[4][5] = false; P[5][5] = false;
        P[0][6] = true; P[1][6] = false; P[2][6] = false; P[3][6] = false; P[4][6] = false; P[5][6] = false;
        P[0][7] = false; P[1][7] = false; P[2][7] = false; P[3][7] = false; P[4][7] = false; P[5][7] = false;
        //Q
        Q[0][0] = false; Q[1][0] = true; Q[2][0] = true; Q[3][0] = true; Q[4][0] = false; Q[5][0] = false;
        Q[0][1] = true; Q[1][1] = false; Q[2][1] = false; Q[3][1] = false; Q[4][1] = true; Q[5][1] = false;
        Q[0][2] = true; Q[1][2] = false; Q[2][2] = false; Q[3][2] = false; Q[4][2] = true; Q[5][2] = false;
        Q[0][3] = true; Q[1][3] = false; Q[2][3] = false; Q[3][3] = false; Q[4][3] = true; Q[5][3] = false;
        Q[0][4] = true; Q[1][4] = false; Q[2][4] = true; Q[3][4] = false; Q[4][4] = true; Q[5][4] = false;
        Q[0][5] = true; Q[1][5] = false; Q[2][5] = false; Q[3][5] = true; Q[4][5] = false; Q[5][5] = false;
        Q[0][6] = false; Q[1][6] = true; Q[2][6] = true; Q[3][6] = false; Q[4][6] = true; Q[5][6] = false;
        Q[0][7] = false; Q[1][7] = false; Q[2][7] = false; Q[3][7] = false; Q[4][7] = false; Q[5][7] = false;
        //R
        R[0][0] = true; R[1][0] = true; R[2][0] = true; R[3][0] = true; R[4][0] = false; R[5][0] = false;
        R[0][1] = true; R[1][1] = false; R[2][1] = false; R[3][1] = false; R[4][1] = true; R[5][1] = false;
        R[0][2] = true; R[1][2] = false; R[2][2] = false; R[3][2] = false; R[4][2] = true; R[5][2] = false;
        R[0][3] = true; R[1][3] = true; R[2][3] = true; R[3][3] = true; R[4][3] = false; R[5][3] = false;
        R[0][4] = true; R[1][4] = false; R[2][4] = true; R[3][4] = false; R[4][4] = false; R[5][4] = false;
        R[0][5] = true; R[1][5] = false; R[2][5] = false; R[3][5] = true; R[4][5] = false; R[5][5] = false;
        R[0][6] = true; R[1][6] = false; R[2][6] = false; R[3][6] = false; R[4][6] = true; R[5][6] = false;
        R[0][7] = false; R[1][7] = false; R[2][7] = false; R[3][7] = false; R[4][7] = false; R[5][7] = false;
        //S
        S[0][0] = false; S[1][0] = true; S[2][0] = true; S[3][0] = true; S[4][0] = false; S[5][0] = false;
        S[0][1] = true; S[1][1] = false; S[2][1] = false; S[3][1] = false; S[4][1] = true; S[5][1] = false;
        S[0][2] = true; S[1][2] = false; S[2][2] = false; S[3][2] = false; S[4][2] = false; S[5][2] = false;
        S[0][3] = false; S[1][3] = true; S[2][3] = true; S[3][3] = true; S[4][3] = false; S[5][3] = false;
        S[0][4] = false; S[1][4] = false; S[2][4] = false; S[3][4] = false; S[4][4] = true; S[5][4] = false;
        S[0][5] = true; S[1][5] = false; S[2][5] = false; S[3][5] = false; S[4][5] = true; S[5][5] = false;
        S[0][6] = false; S[1][6] = true; S[2][6] = true; S[3][6] = true; S[4][6] = false; S[5][6] = false;
        S[0][7] = false; S[1][7] = false; S[2][7] = false; S[3][7] = false; S[4][7] = false; S[5][7] = false;
        //T
        T[0][0] = true; T[1][0] = true; T[2][0] = true; T[3][0] = true; T[4][0] = true; T[5][0] = false;
        T[0][1] = false; T[1][1] = false; T[2][1] = true; T[3][1] = false; T[4][1] = false; T[5][1] = false;
        T[0][2] = false; T[1][2] = false; T[2][2] = true; T[3][2] = false; T[4][2] = false; T[5][2] = false;
        T[0][3] = false; T[1][3] = false; T[2][3] = true; T[3][3] = false; T[4][3] = false; T[5][3] = false;
        T[0][4] = false; T[1][4] = false; T[2][4] = true; T[3][4] = false; T[4][4] = false; T[5][4] = false;
        T[0][5] = false; T[1][5] = false; T[2][5] = true; T[3][5] = false; T[4][5] = false; T[5][5] = false;
        T[0][6] = false; T[1][6] = false; T[2][6] = true; T[3][6] = false; T[4][6] = false; T[5][6] = false;
        T[0][7] = false; T[1][7] = false; T[2][7] = false; T[3][7] = false; T[4][7] = false; T[5][7] = false;
        //U
        U[0][0] = true; U[1][0] = false; U[2][0] = false; U[3][0] = false; U[4][0] = true; U[5][0] = false;
        U[0][1] = true; U[1][1] = false; U[2][1] = false; U[3][1] = false; U[4][1] = true; U[5][1] = false;
        U[0][2] = true; U[1][2] = false; U[2][2] = false; U[3][2] = false; U[4][2] = true; U[5][2] = false;
        U[0][3] = true; U[1][3] = false; U[2][3] = false; U[3][3] = false; U[4][3] = true; U[5][3] = false;
        U[0][4] = true; U[1][4] = false; U[2][4] = false; U[3][4] = false; U[4][4] = true; U[5][4] = false;
        U[0][5] = true; U[1][5] = false; U[2][5] = false; U[3][5] = false; U[4][5] = true; U[5][5] = false;
        U[0][6] = false; U[1][6] = true; U[2][6] = true; U[3][6] = true; U[4][6] = false; U[5][6] = false;
        U[0][7] = false; U[1][7] = false; U[2][7] = false; U[3][7] = false; U[4][7] = false; U[5][7] = false;
        //V
        V[0][0] = true; V[1][0] = false; V[2][0] = false; V[3][0] = false; V[4][0] = true; V[5][0] = false;
        V[0][1] = true; V[1][1] = false; V[2][1] = false; V[3][1] = false; V[4][1] = true; V[5][1] = false;
        V[0][2] = true; V[1][2] = false; V[2][2] = false; V[3][2] = false; V[4][2] = true; V[5][2] = false;
        V[0][3] = true; V[1][3] = false; V[2][3] = false; V[3][3] = false; V[4][3] = true; V[5][3] = false;
        V[0][4] = true; V[1][4] = false; V[2][4] = false; V[3][4] = false; V[4][4] = true; V[5][4] = false;
        V[0][5] = false; V[1][5] = true; V[2][5] = false; V[3][5] = true; V[4][5] = false; V[5][5] = false;
        V[0][6] = false; V[1][6] = false; V[2][6] = true; V[3][6] = false; V[4][6] = false; V[5][6] = false;
        V[0][7] = false; V[1][7] = false; V[2][7] = false; V[3][7] = false; V[4][7] = false; V[5][7] = false;
        //W
        W[0][0] = true; W[1][0] = false; W[2][0] = false; W[3][0] = false; W[4][0] = true; W[5][0] = false;
        W[0][1] = true; W[1][1] = false; W[2][1] = false; W[3][1] = false; W[4][1] = true; W[5][1] = false;
        W[0][2] = true; W[1][2] = false; W[2][2] = false; W[3][2] = false; W[4][2] = true; W[5][2] = false;
        W[0][3] = true; W[1][3] = false; W[2][3] = true; W[3][3] = false; W[4][3] = true; W[5][3] = false;
        W[0][4] = true; W[1][4] = false; W[2][4] = true; W[3][4] = false; W[4][4] = true; W[5][4] = false;
        W[0][5] = true; W[1][5] = true; W[2][5] = false; W[3][5] = true; W[4][5] = true; W[5][5] = false;
        W[0][6] = true; W[1][6] = false; W[2][6] = false; W[3][6] = false; W[4][6] = true; W[5][6] = false;
        W[0][7] = false; W[1][7] = false; W[2][7] = false; W[3][7] = false; W[4][7] = false; W[5][7] = false;
        //X
        X[0][0] = true; X[1][0] = false; X[2][0] = false; X[3][0] = false; X[4][0] = true; X[5][0] = false;
        X[0][1] = true; X[1][1] = false; X[2][1] = false; X[3][1] = false; X[4][1] = true; X[5][1] = false;
        X[0][2] = false; X[1][2] = true; X[2][2] = false; X[3][2] = true; X[4][2] = false; X[5][2] = false;
        X[0][3] = false; X[1][3] = false; X[2][3] = true; X[3][3] = false; X[4][3] = false; X[5][3] = false;
        X[0][4] = false; X[1][4] = true; X[2][4] = false; X[3][4] = true; X[4][4] = false; X[5][4] = false;
        X[0][5] = true; X[1][5] = false; X[2][5] = false; X[3][5] = false; X[4][5] = true; X[5][5] = false;
        X[0][6] = true; X[1][6] = false; X[2][6] = false; X[3][6] = false; X[4][6] = true; X[5][6] = false;
        X[0][7] = false; X[1][7] = false; X[2][7] = false; X[3][7] = false; X[4][7] = false; X[5][7] = false;
        //Y
        Y[0][0] = true; Y[1][0] = false; Y[2][0] = false; Y[3][0] = false; Y[4][0] = true; Y[5][0] = false;
        Y[0][1] = true; Y[1][1] = false; Y[2][1] = false; Y[3][1] = false; Y[4][1] = true; Y[5][1] = false;
        Y[0][2] = false; Y[1][2] = true; Y[2][2] = false; Y[3][2] = true; Y[4][2] = false; Y[5][2] = false;
        Y[0][3] = false; Y[1][3] = false; Y[2][3] = true; Y[3][3] = false; Y[4][3] = false; Y[5][3] = false;
        Y[0][4] = false; Y[1][4] = false; Y[2][4] = true; Y[3][4] = false; Y[4][4] = false; Y[5][4] = false;
        Y[0][5] = false; Y[1][5] = false; Y[2][5] = true; Y[3][5] = false; Y[4][5] = false; Y[5][5] = false;
        Y[0][6] = false; Y[1][6] = false; Y[2][6] = true; Y[3][6] = false; Y[4][6] = false; Y[5][6] = false;
        Y[0][7] = false; Y[1][7] = false; Y[2][7] = false; Y[3][7] = false; Y[4][7] = false; Y[5][7] = false;
        //Z
        Z[0][0] = true; Z[1][0] = true; Z[2][0] = true; Z[3][0] = true; Z[4][0] = true; Z[5][0] = false;
        Z[0][1] = false; Z[1][1] = false; Z[2][1] = false; Z[3][1] = false; Z[4][1] = true; Z[5][1] = false;
        Z[0][2] = false; Z[1][2] = false; Z[2][2] = false; Z[3][2] = true; Z[4][2] = false; Z[5][2] = false;
        Z[0][3] = false; Z[1][3] = false; Z[2][3] = true; Z[3][3] = false; Z[4][3] = false; Z[5][3] = false;
        Z[0][4] = false; Z[1][4] = true; Z[2][4] = false; Z[3][4] = false; Z[4][4] = false; Z[5][4] = false;
        Z[0][5] = true; Z[1][5] = false; Z[2][5] = false; Z[3][5] = false; Z[4][5] = false; Z[5][5] = false;
        Z[0][6] = true; Z[1][6] = true; Z[2][6] = true; Z[3][6] = true; Z[4][6] = true; Z[5][6] = false;
        Z[0][7] = false; Z[1][7] = false; Z[2][7] = false; Z[3][7] = false; Z[4][7] = false; Z[5][7] = false;
        
        //a
        a[0][0] = false; a[1][0] = false; a[2][0] = false; a[3][0] = false; a[4][0] = false; a[5][0] = false;
        a[0][1] = false; a[1][1] = false; a[2][1] = false; a[3][1] = false; a[4][1] = false; a[5][1] = false;
        a[0][2] = false; a[1][2] = true; a[2][2] = true; a[3][2] = true; a[4][2] = false; a[5][2] = false;
        a[0][3] = false; a[1][3] = false; a[2][3] = false; a[3][3] = false; a[4][3] = true; a[5][3] = false;
        a[0][4] = false; a[1][4] = true; a[2][4] = true; a[3][4] = true; a[4][4] = true; a[5][4] = false;
        a[0][5] = true; a[1][5] = false; a[2][5] = false; a[3][5] = false; a[4][5] = true; a[5][5] = false;
        a[0][6] = false; a[1][6] = true; a[2][6] = true; a[3][6] = true; a[4][6] = true; a[5][6] = false;
        a[0][7] = false; a[1][7] = false; a[2][7] = false; a[3][7] = false; a[4][7] = false; a[5][7] = false;
        
        //b
        b[0][0] = true; b[1][0] = false; b[2][0] = false; b[3][0] = false; b[4][0] = false; b[5][0] = false;
        b[0][1] = true; b[1][1] = false; b[2][1] = false; b[3][1] = false; b[4][1] = false; b[5][1] = false;
        b[0][2] = true; b[1][2] = false; b[2][2] = true; b[3][2] = true; b[4][2] = false; b[5][2] = false;
        b[0][3] = true; b[1][3] = true; b[2][3] = false; b[3][3] = false; b[4][3] = true; b[5][3] = false;
        b[0][4] = true; b[1][4] = false; b[2][4] = false; b[3][4] = false; b[4][4] = true; b[5][4] = false;
        b[0][5] = true; b[1][5] = false; b[2][5] = false; b[3][5] = false; b[4][5] = true; b[5][5] = false;
        b[0][6] = false; b[1][6] = true; b[2][6] = true; b[3][6] = true; b[4][6] = false; b[5][6] = false;
        b[0][7] = false; b[1][7] = false; b[2][7] = false; b[3][7] = false; b[4][7] = false; b[5][7] = false;
        //c
        c[0][0] = false; c[1][0] = false; c[2][0] = false; c[3][0] = false; c[4][0] = false; c[5][0] = false;
        c[0][1] = false; c[1][1] = false; c[2][1] = false; c[3][1] = false; c[4][1] = false; c[5][1] = false;
        c[0][2] = false; c[1][2] = true; c[2][2] = true; c[3][2] = true; c[4][2] = false; c[5][2] = false;
        c[0][3] = true; c[1][3] = false; c[2][3] = false; c[3][3] = false; c[4][3] = false; c[5][3] = false;
        c[0][4] = true; c[1][4] = false; c[2][4] = false; c[3][4] = false; c[4][4] = false; c[5][4] = false;
        c[0][5] = true; c[1][5] = false; c[2][5] = false; c[3][5] = false; c[4][5] = true; c[5][5] = false;
        c[0][6] = false; c[1][6] = true; c[2][6] = true; c[3][6] = true; c[4][6] = false; c[5][6] = false;
        c[0][7] = false; c[1][7] = false; c[2][7] = false; c[3][7] = false; c[4][7] = false; c[5][7] = false;
        //d
        d[0][0] = false; d[1][0] = false; d[2][0] = false; d[3][0] = false; d[4][0] = true; d[5][0] = false;
        d[0][1] = false; d[1][1] = false; d[2][1] = false; d[3][1] = false; d[4][1] = true; d[5][1] = false;
        d[0][2] = false; d[1][2] = true; d[2][2] = true; d[3][2] = false; d[4][2] = true; d[5][2] = false;
        d[0][3] = true; d[1][3] = false; d[2][3] = false; d[3][3] = true; d[4][3] = true; d[5][3] = false;
        d[0][4] = true; d[1][4] = false; d[2][4] = false; d[3][4] = false; d[4][4] = true; d[5][4] = false;
        d[0][5] = true; d[1][5] = false; d[2][5] = false; d[3][5] = false; d[4][5] = true; d[5][5] = false;
        d[0][6] = false; d[1][6] = true; d[2][6] = true; d[3][6] = true; d[4][6] = true; d[5][6] = false;
        d[0][7] = false; d[1][7] = false; d[2][7] = false; d[3][7] = false; d[4][7] = false; d[5][7] = false;
        //e
        e[0][0] = false; e[1][0] = false; e[2][0] = false; e[3][0] = false; e[4][0] = false; e[5][0] = false;
        e[0][1] = false; e[1][1] = false; e[2][1] = false; e[3][1] = false; e[4][1] = false; e[5][1] = false;
        e[0][2] = false; e[1][2] = true; e[2][2] = true; e[3][2] = true; e[4][2] = false; e[5][2] = false;
        e[0][3] = true; e[1][3] = false; e[2][3] = false; e[3][3] = false; e[4][3] = true; e[5][3] = false;
        e[0][4] = true; e[1][4] = true; e[2][4] = true; e[3][4] = true; e[4][4] = true; e[5][4] = false;
        e[0][5] = true; e[1][5] = false; e[2][5] = false; e[3][5] = false; e[4][5] = false; e[5][5] = false;
        e[0][6] = false; e[1][6] = true; e[2][6] = true; e[3][6] = true; e[4][6] = false; e[5][6] = false;
        e[0][7] = false; e[1][7] = false; e[2][7] = false; e[3][7] = false; e[4][7] = false; e[5][7] = false;
        //f
        f[0][0] = false; f[1][0] = false; f[2][0] = false; f[3][0] = true; f[4][0] = false; f[5][0] = false;
        f[0][1] = false; f[1][1] = false; f[2][1] = true; f[3][1] = false; f[4][1] = true; f[5][1] = false;
        f[0][2] = false; f[1][2] = false; f[2][2] = true; f[3][2] = false; f[4][2] = false; f[5][2] = false;
        f[0][3] = false; f[1][3] = true; f[2][3] = true; f[3][3] = true; f[4][3] = false; f[5][3] = false;
        f[0][4] = false; f[1][4] = false; f[2][4] = true; f[3][4] = false; f[4][4] = false; f[5][4] = false;
        f[0][5] = false; f[1][5] = false; f[2][5] = true; f[3][5] = false; f[4][5] = false; f[5][5] = false;
        f[0][6] = false; f[1][6] = false; f[2][6] = true; f[3][6] = false; f[4][6] = false; f[5][6] = false;
        f[0][7] = false; f[1][7] = false; f[2][7] = false; f[3][7] = false; f[4][7] = false; f[5][7] = false;
        //g
        g[0][0] = false; g[1][0] = false; g[2][0] = false; g[3][0] = false; g[4][0] = false; g[5][0] = false;
        g[0][1] = false; g[1][1] = false; g[2][1] = false; g[3][1] = false; g[4][1] = false; g[5][1] = false;
        g[0][2] = false; g[1][2] = true; g[2][2] = true; g[3][2] = true; g[4][2] = true; g[5][2] = false;
        g[0][3] = true; g[1][3] = false; g[2][3] = false; g[3][3] = false; g[4][3] = true; g[5][3] = false;
        g[0][4] = false; g[1][4] = true; g[2][4] = true; g[3][4] = true; g[4][4] = true; g[5][4] = false;
        g[0][5] = false; g[1][5] = false; g[2][5] = false; g[3][5] = false; g[4][5] = true; g[5][5] = false;
        g[0][6] = false; g[1][6] = true; g[2][6] = true; g[3][6] = true; g[4][6] = false; g[5][6] = false;
        g[0][7] = false; g[1][7] = false; g[2][7] = false; g[3][7] = false; g[4][7] = false; g[5][7] = false;
        //h
        h[0][0] = true; h[1][0] = false; h[2][0] = false; h[3][0] = false; h[4][0] = false; h[5][0] = false;
        h[0][1] = true; h[1][1] = false; h[2][1] = false; h[3][1] = false; h[4][1] = false; h[5][1] = false;
        h[0][2] = true; h[1][2] = false; h[2][2] = true; h[3][2] = true; h[4][2] = false; h[5][2] = false;
        h[0][3] = true; h[1][3] = true; h[2][3] = false; h[3][3] = false; h[4][3] = true; h[5][3] = false;
        h[0][4] = true; h[1][4] = false; h[2][4] = false; h[3][4] = false; h[4][4] = true; h[5][4] = false;
        h[0][5] = true; h[1][5] = false; h[2][5] = false; h[3][5] = false; h[4][5] = true; h[5][5] = false;
        h[0][6] = true; h[1][6] = false; h[2][6] = false; h[3][6] = false; h[4][6] = true; h[5][6] = false;
        h[0][7] = false; h[1][7] = false; h[2][7] = false; h[3][7] = false; h[4][7] = false; h[5][7] = false;
        //i
        i[0][0] = false; i[1][0] = false; i[2][0] = true; i[3][0] = false; i[4][0] = false; i[5][0] = false;
        i[0][1] = false; i[1][1] = false; i[2][1] = false; i[3][1] = false; i[4][1] = false; i[5][1] = false;
        i[0][2] = false; i[1][2] = true; i[2][2] = true; i[3][2] = false; i[4][2] = false; i[5][2] = false;
        i[0][3] = false; i[1][3] = false; i[2][3] = true; i[3][3] = false; i[4][3] = false; i[5][3] = false;
        i[0][4] = false; i[1][4] = false; i[2][4] = true; i[3][4] = false; i[4][4] = false; i[5][4] = false;
        i[0][5] = false; i[1][5] = false; i[2][5] = true; i[3][5] = false; i[4][5] = false; i[5][5] = false;
        i[0][6] = false; i[1][6] = true; i[2][6] = true; i[3][6] = true; i[4][6] = false; i[5][6] = false;
        i[0][7] = false; i[1][7] = false; i[2][7] = false; i[3][7] = false; i[4][7] = false; i[5][7] = false;
        //j
        j[0][0] = false; j[1][0] = false; j[2][0] = false; j[3][0] = true; j[4][0] = false; j[5][0] = false;
        j[0][1] = false; j[1][1] = false; j[2][1] = false; j[3][1] = false; j[4][1] = false; j[5][1] = false;
        j[0][2] = false; j[1][2] = false; j[2][2] = false; j[3][2] = true; j[4][2] = false; j[5][2] = false;
        j[0][3] = false; j[1][3] = false; j[2][3] = false; j[3][3] = true; j[4][3] = false; j[5][3] = false;
        j[0][4] = false; j[1][4] = false; j[2][4] = false; j[3][4] = true; j[4][4] = false; j[5][4] = false;
        j[0][5] = true; j[1][5] = false; j[2][5] = false; j[3][5] = true; j[4][5] = false; j[5][5] = false;
        j[0][6] = false; j[1][6] = true; j[2][6] = true; j[3][6] = false; j[4][6] = false; j[5][6] = false;
        j[0][7] = false; j[1][7] = false; j[2][7] = false; j[3][7] = false; j[4][7] = false; j[5][7] = false;
        //k
        k[0][0] = false; k[1][0] = true; k[2][0] = false; k[3][0] = false; k[4][0] = false; k[5][0] = false;
        k[0][1] = false; k[1][1] = true; k[2][1] = false; k[3][1] = false; k[4][1] = false; k[5][1] = false;
        k[0][2] = false; k[1][2] = true; k[2][2] = false; k[3][2] = false; k[4][2] = true; k[5][2] = false;
        k[0][3] = false; k[1][3] = true; k[2][3] = false; k[3][3] = true; k[4][3] = false; k[5][3] = false;
        k[0][4] = false; k[1][4] = true; k[2][4] = true; k[3][4] = false; k[4][4] = false; k[5][4] = false;
        k[0][5] = false; k[1][5] = true; k[2][5] = false; k[3][5] = true; k[4][5] = false; k[5][5] = false;
        k[0][6] = false; k[1][6] = true; k[2][6] = false; k[3][6] = false; k[4][6] = true; k[5][6] = false;
        k[0][7] = false; k[1][7] = false; k[2][7] = false; k[3][7] = false; k[4][7] = false; k[5][7] = false;
        //l
        l[0][0] = false; l[1][0] = true; l[2][0] = true; l[3][0] = false; l[4][0] = false; l[5][0] = false;
        l[0][1] = false; l[1][1] = false; l[2][1] = true; l[3][1] = false; l[4][1] = false; l[5][1] = false;
        l[0][2] = false; l[1][2] = false; l[2][2] = true; l[3][2] = false; l[4][2] = false; l[5][2] = false;
        l[0][3] = false; l[1][3] = false; l[2][3] = true; l[3][3] = false; l[4][3] = false; l[5][3] = false;
        l[0][4] = false; l[1][4] = false; l[2][4] = true; l[3][4] = false; l[4][4] = false; l[5][4] = false;
        l[0][5] = false; l[1][5] = false; l[2][5] = true; l[3][5] = false; l[4][5] = false; l[5][5] = false;
        l[0][6] = false; l[1][6] = true; l[2][6] = true; l[3][6] = true; l[4][6] = false; l[5][6] = false;
        l[0][7] = false; l[1][7] = false; l[2][7] = false; l[3][7] = false; l[4][7] = false; l[5][7] = false;
        //m
        m[0][0] = false; m[1][0] = false; m[2][0] = false; m[3][0] = false; m[4][0] = false; m[5][0] = false;
        m[0][1] = false; m[1][1] = false; m[2][1] = false; m[3][1] = false; m[4][1] = false; m[5][1] = false;
        m[0][2] = true; m[1][2] = true; m[2][2] = false; m[3][2] = true; m[4][2] = false; m[5][2] = false;
        m[0][3] = true; m[1][3] = false; m[2][3] = true; m[3][3] = false; m[4][3] = true; m[5][3] = false;
        m[0][4] = true; m[1][4] = false; m[2][4] = true; m[3][4] = false; m[4][4] = true; m[5][4] = false;
        m[0][5] = true; m[1][5] = false; m[2][5] = true; m[3][5] = false; m[4][5] = true; m[5][5] = false;
        m[0][6] = true; m[1][6] = false; m[2][6] = true; m[3][6] = false; m[4][6] = true; m[5][6] = false;
        m[0][7] = false; m[1][7] = false; m[2][7] = false; m[3][7] = false; m[4][7] = false; m[5][7] = false;
        //n
        n[0][0] = false; n[1][0] = false; n[2][0] = false; n[3][0] = false; n[4][0] = false; n[5][0] = false;
        n[0][1] = false; n[1][1] = false; n[2][1] = false; n[3][1] = false; n[4][1] = false; n[5][1] = false;
        n[0][2] = true; n[1][2] = false; n[2][2] = true; n[3][2] = true; n[4][2] = false; n[5][2] = false;
        n[0][3] = true; n[1][3] = true; n[2][3] = false; n[3][3] = false; n[4][3] = true; n[5][3] = false;
        n[0][4] = true; n[1][4] = false; n[2][4] = false; n[3][4] = false; n[4][4] = true; n[5][4] = false;
        n[0][5] = true; n[1][5] = false; n[2][5] = false; n[3][5] = false; n[4][5] = true; n[5][5] = false;
        n[0][6] = true; n[1][6] = false; n[2][6] = false; n[3][6] = false; n[4][6] = true; n[5][6] = false;
        n[0][7] = false; n[1][7] = false; n[2][7] = false; n[3][7] = false; n[4][7] = false; n[5][7] = false;
        //o
        o[0][0] = false; o[1][0] = false; o[2][0] = false; o[3][0] = false; o[4][0] = false; o[5][0] = false;
        o[0][1] = false; o[1][1] = false; o[2][1] = false; o[3][1] = false; o[4][1] = false; o[5][1] = false;
        o[0][2] = false; o[1][2] = true; o[2][2] = true; o[3][2] = true; o[4][2] = false; o[5][2] = false;
        o[0][3] = true; o[1][3] = false; o[2][3] = false; o[3][3] = false; o[4][3] = true; o[5][3] = false;
        o[0][4] = true; o[1][4] = false; o[2][4] = false; o[3][4] = false; o[4][4] = true; o[5][4] = false;
        o[0][5] = true; o[1][5] = false; o[2][5] = false; o[3][5] = false; o[4][5] = true; o[5][5] = false;
        o[0][6] = false; o[1][6] = true; o[2][6] = true; o[3][6] = true; o[4][6] = false; o[5][6] = false;
        o[0][7] = false; o[1][7] = false; o[2][7] = false; o[3][7] = false; o[4][7] = false; o[5][7] = false;
        //p
        p[0][0] = false; p[1][0] = false; p[2][0] = false; p[3][0] = false; p[4][0] = false; p[5][0] = false;
        p[0][1] = false; p[1][1] = false; p[2][1] = false; p[3][1] = false; p[4][1] = false; p[5][1] = false;
        p[0][2] = true; p[1][2] = true; p[2][2] = true; p[3][2] = true; p[4][2] = false; p[5][2] = false;
        p[0][3] = true; p[1][3] = false; p[2][3] = false; p[3][3] = false; p[4][3] = true; p[5][3] = false;
        p[0][4] = true; p[1][4] = true; p[2][4] = true; p[3][4] = true; p[4][4] = false; p[5][4] = false;
        p[0][5] = true; p[1][5] = false; p[2][5] = false; p[3][5] = false; p[4][5] = false; p[5][5] = false;
        p[0][6] = true; p[1][6] = false; p[2][6] = false; p[3][6] = false; p[4][6] = false; p[5][6] = false;
        p[0][7] = false; p[1][7] = false; p[2][7] = false; p[3][7] = false; p[4][7] = false; p[5][7] = false;
        //q
        q[0][0] = false; q[1][0] = false; q[2][0] = false; q[3][0] = false; q[4][0] = false; q[5][0] = false;
        q[0][1] = false; q[1][1] = false; q[2][1] = false; q[3][1] = false; q[4][1] = false; q[5][1] = false;
        q[0][2] = false; q[1][2] = true; q[2][2] = true; q[3][2] = true; q[4][2] = true; q[5][2] = false;
        q[0][3] = true; q[1][3] = false; q[2][3] = false; q[3][3] = false; q[4][3] = true; q[5][3] = false;
        q[0][4] = false; q[1][4] = true; q[2][4] = true; q[3][4] = true; q[4][4] = true; q[5][4] = false;
        q[0][5] = false; q[1][5] = false; q[2][5] = false; q[3][5] = false; q[4][5] = true; q[5][5] = false;
        q[0][6] = false; q[1][6] = false; q[2][6] = false; q[3][6] = false; q[4][6] = true; q[5][6] = false;
        q[0][7] = false; q[1][7] = false; q[2][7] = false; q[3][7] = false; q[4][7] = false; q[5][7] = false;
        //r
        r[0][0] = false; r[1][0] = false; r[2][0] = false; r[3][0] = false; r[4][0] = false; r[5][0] = false;
        r[0][1] = false; r[1][1] = false; r[2][1] = false; r[3][1] = false; r[4][1] = false; r[5][1] = false;
        r[0][2] = false; r[1][2] = true; r[2][2] = false; r[3][2] = true; r[4][2] = true; r[5][2] = false;
        r[0][3] = false; r[1][3] = true; r[2][3] = true; r[3][3] = false; r[4][3] = false; r[5][3] = false;
        r[0][4] = false; r[1][4] = true; r[2][4] = false; r[3][4] = false; r[4][4] = false; r[5][4] = false;
        r[0][5] = false; r[1][5] = true; r[2][5] = false; r[3][5] = false; r[4][5] = false; r[5][5] = false;
        r[0][6] = false; r[1][6] = true; r[2][6] = false; r[3][6] = false; r[4][6] = false; r[5][6] = false;
        r[0][7] = false; r[1][7] = false; r[2][7] = false; r[3][7] = false; r[4][7] = false; r[5][7] = false;
        //s
        s[0][0] = false; s[1][0] = false; s[2][0] = false; s[3][0] = false; s[4][0] = false; s[5][0] = false;
        s[0][1] = false; s[1][1] = false; s[2][1] = false; s[3][1] = false; s[4][1] = false; s[5][1] = false;
        s[0][2] = false; s[1][2] = true; s[2][2] = true; s[3][2] = true; s[4][2] = true; s[5][2] = false;
        s[0][3] = true; s[1][3] = false; s[2][3] = false; s[3][3] = false; s[4][3] = false; s[5][3] = false;
        s[0][4] = false; s[1][4] = true; s[2][4] = true; s[3][4] = true; s[4][4] = false; s[5][4] = false;
        s[0][5] = false; s[1][5] = false; s[2][5] = false; s[3][5] = false; s[4][5] = true; s[5][5] = false;
        s[0][6] = true; s[1][6] = true; s[2][6] = true; s[3][6] = true; s[4][6] = false; s[5][6] = false;
        s[0][7] = false; s[1][7] = false; s[2][7] = false; s[3][7] = false; s[4][7] = false; s[5][7] = false;
        //t
        t[0][0] = false; t[1][0] = false; t[2][0] = false; t[3][0] = false; t[4][0] = false; t[5][0] = false;
        t[0][1] = false; t[1][1] = false; t[2][1] = true; t[3][1] = false; t[4][1] = false; t[5][1] = false;
        t[0][2] = false; t[1][2] = true; t[2][2] = true; t[3][2] = true; t[4][2] = false; t[5][2] = false;
        t[0][3] = false; t[1][3] = false; t[2][3] = true; t[3][3] = false; t[4][3] = false; t[5][3] = false;
        t[0][4] = false; t[1][4] = false; t[2][4] = true; t[3][4] = false; t[4][4] = false; t[5][4] = false;
        t[0][5] = false; t[1][5] = false; t[2][5] = true; t[3][5] = false; t[4][5] = true; t[5][5] = false;
        t[0][6] = false; t[1][6] = false; t[2][6] = false; t[3][6] = true; t[4][6] = false; t[5][6] = false;
        t[0][7] = false; t[1][7] = false; t[2][7] = false; t[3][7] = false; t[4][7] = false; t[5][7] = false;
        //u
        u[0][0] = false; u[1][0] = false; u[2][0] = false; u[3][0] = false; u[4][0] = false; u[5][0] = false;
        u[0][1] = false; u[1][1] = false; u[2][1] = false; u[3][1] = false; u[4][1] = false; u[5][1] = false;
        u[0][2] = true; u[1][2] = false; u[2][2] = false; u[3][2] = false; u[4][2] = true; u[5][2] = false;
        u[0][3] = true; u[1][3] = false; u[2][3] = false; u[3][3] = false; u[4][3] = true; u[5][3] = false;
        u[0][4] = true; u[1][4] = false; u[2][4] = false; u[3][4] = false; u[4][4] = true; u[5][4] = false;
        u[0][5] = true; u[1][5] = false; u[2][5] = false; u[3][5] = true; u[4][5] = true; u[5][5] = false;
        u[0][6] = false; u[1][6] = true; u[2][6] = true; u[3][6] = false; u[4][6] = true; u[5][6] = false;
        u[0][7] = false; u[1][7] = false; u[2][7] = false; u[3][7] = false; u[4][7] = false; u[5][7] = false;
        //v
        v[0][0] = false; v[1][0] = false; v[2][0] = false; v[3][0] = false; v[4][0] = false; v[5][0] = false;
        v[0][1] = false; v[1][1] = false; v[2][1] = false; v[3][1] = false; v[4][1] = false; v[5][1] = false;
        v[0][2] = true; v[1][2] = false; v[2][2] = false; v[3][2] = false; v[4][2] = true; v[5][2] = false;
        v[0][3] = true; v[1][3] = false; v[2][3] = false; v[3][3] = false; v[4][3] = true; v[5][3] = false;
        v[0][4] = true; v[1][4] = false; v[2][4] = false; v[3][4] = false; v[4][4] = true; v[5][4] = false;
        v[0][5] = false; v[1][5] = true; v[2][5] = false; v[3][5] = true; v[4][5] = false; v[5][5] = false;
        v[0][6] = false; v[1][6] = false; v[2][6] = true; v[3][6] = false; v[4][6] = false; v[5][6] = false;
        v[0][7] = false; v[1][7] = false; v[2][7] = false; v[3][7] = false; v[4][7] = false; v[5][7] = false;
        //w
        w[0][0] = false; w[1][0] = false; w[2][0] = false; w[3][0] = false; w[4][0] = false; w[5][0] = false;
        w[0][1] = false; w[1][1] = false; w[2][1] = false; w[3][1] = false; w[4][1] = false; w[5][1] = false;
        w[0][2] = true; w[1][2] = false; w[2][2] = false; w[3][2] = false; w[4][2] = true; w[5][2] = false;
        w[0][3] = true; w[1][3] = false; w[2][3] = false; w[3][3] = false; w[4][3] = true; w[5][3] = false;
        w[0][4] = true; w[1][4] = false; w[2][4] = true; w[3][4] = false; w[4][4] = true; w[5][4] = false;
        w[0][5] = true; w[1][5] = false; w[2][5] = true; w[3][5] = false; w[4][5] = true; w[5][5] = false;
        w[0][6] = false; w[1][6] = true; w[2][6] = false; w[3][6] = true; w[4][6] = false; w[5][6] = false;
        w[0][7] = false; w[1][7] = false; w[2][7] = false; w[3][7] = false; w[4][7] = false; w[5][7] = false;
        //x
        x[0][0] = false; x[1][0] = false; x[2][0] = false; x[3][0] = false; x[4][0] = false; x[5][0] = false;
        x[0][1] = false; x[1][1] = false; x[2][1] = false; x[3][1] = false; x[4][1] = false; x[5][1] = false;
        x[0][2] = true; x[1][2] = true; x[2][2] = false; x[3][2] = false; x[4][2] = true; x[5][2] = false;
        x[0][3] = false; x[1][3] = false; x[2][3] = true; x[3][3] = true; x[4][3] = false; x[5][3] = false;
        x[0][4] = false; x[1][4] = false; x[2][4] = true; x[3][4] = false; x[4][4] = false; x[5][4] = false;
        x[0][5] = false; x[1][5] = true; x[2][5] = true; x[3][5] = false; x[4][5] = false; x[5][5] = false;
        x[0][6] = true; x[1][6] = false; x[2][6] = false; x[3][6] = true; x[4][6] = true; x[5][6] = false;
        x[0][7] = false; x[1][7] = false; x[2][7] = false; x[3][7] = false; x[4][7] = false; x[5][7] = false;
        //y
        y[0][0] = false; y[1][0] = false; y[2][0] = false; y[3][0] = false; y[4][0] = false; y[5][0] = false;
        y[0][1] = false; y[1][1] = false; y[2][1] = false; y[3][1] = false; y[4][1] = false; y[5][1] = false;
        y[0][2] = true; y[1][2] = false; y[2][2] = false; y[3][2] = false; y[4][2] = true; y[5][2] = false;
        y[0][3] = false; y[1][3] = true; y[2][3] = false; y[3][3] = false; y[4][3] = true; y[5][3] = false;
        y[0][4] = false; y[1][4] = false; y[2][4] = true; y[3][4] = true; y[4][4] = false; y[5][4] = false;
        y[0][5] = false; y[1][5] = false; y[2][5] = true; y[3][5] = false; y[4][5] = false; y[5][5] = false;
        y[0][6] = true; y[1][6] = true; y[2][6] = false; y[3][6] = false; y[4][6] = false; y[5][6] = false;
        y[0][7] = false; y[1][7] = false; y[2][7] = false; y[3][7] = false; y[4][7] = false; y[5][7] = false;
        //z
        z[0][0] = false; z[1][0] = false; z[2][0] = false; z[3][0] = false; z[4][0] = false; z[5][0] = false;
        z[0][1] = false; z[1][1] = false; z[2][1] = false; z[3][1] = false; z[4][1] = false; z[5][1] = false;
        z[0][2] = true; z[1][2] = true; z[2][2] = true; z[3][2] = true; z[4][2] = true; z[5][2] = false;
        z[0][3] = false; z[1][3] = false; z[2][3] = false; z[3][3] = true; z[4][3] = false; z[5][3] = false;
        z[0][4] = false; z[1][4] = false; z[2][4] = true; z[3][4] = false; z[4][4] = false; z[5][4] = false;
        z[0][5] = false; z[1][5] = true; z[2][5] = false; z[3][5] = false; z[4][5] = false; z[5][5] = false;
        z[0][6] = true; z[1][6] = true; z[2][6] = true; z[3][6] = true; z[4][6] = true; z[5][6] = false;
        z[0][7] = false; z[1][7] = false; z[2][7] = false; z[3][7] = false; z[4][7] = false; z[5][7] = false;

        //num_0
        num_0[0][0] = false; num_0[1][0] = true; num_0[2][0] = true; num_0[3][0] = true; num_0[4][0] = false; num_0[5][0] = false;
        num_0[0][1] = true; num_0[1][1] = false; num_0[2][1] = false; num_0[3][1] = false; num_0[4][1] = true; num_0[5][1] = false;
        num_0[0][2] = true; num_0[1][2] = false; num_0[2][2] = false; num_0[3][2] = true; num_0[4][2] = true; num_0[5][2] = false;
        num_0[0][3] = true; num_0[1][3] = false; num_0[2][3] = true; num_0[3][3] = false; num_0[4][3] = true; num_0[5][3] = false;
        num_0[0][4] = true; num_0[1][4] = true; num_0[2][4] = false; num_0[3][4] = false; num_0[4][4] = true; num_0[5][4] = false;
        num_0[0][5] = true; num_0[1][5] = false; num_0[2][5] = false; num_0[3][5] = false; num_0[4][5] = true; num_0[5][5] = false;
        num_0[0][6] = false; num_0[1][6] = true; num_0[2][6] = true; num_0[3][6] = true; num_0[4][6] = false; num_0[5][6] = false;
        num_0[0][7] = false; num_0[1][7] = false; num_0[2][7] = false; num_0[3][7] = false; num_0[4][7] = false; num_0[5][7] = false;
        //num_1
        num_1[0][0] = false; num_1[1][0] = false; num_1[2][0] = true; num_1[3][0] = false; num_1[4][0] = false; num_1[5][0] = false;
        num_1[0][1] = false; num_1[1][1] = true; num_1[2][1] = true; num_1[3][1] = false; num_1[4][1] = false; num_1[5][1] = false;
        num_1[0][2] = false; num_1[1][2] = false; num_1[2][2] = true; num_1[3][2] = false; num_1[4][2] = false; num_1[5][2] = false;
        num_1[0][3] = false; num_1[1][3] = false; num_1[2][3] = true; num_1[3][3] = false; num_1[4][3] = false; num_1[5][3] = false;
        num_1[0][4] = false; num_1[1][4] = false; num_1[2][4] = true; num_1[3][4] = false; num_1[4][4] = false; num_1[5][4] = false;
        num_1[0][5] = false; num_1[1][5] = false; num_1[2][5] = true; num_1[3][5] = false; num_1[4][5] = false; num_1[5][5] = false;
        num_1[0][6] = false; num_1[1][6] = true; num_1[2][6] = true; num_1[3][6] = true; num_1[4][6] = false; num_1[5][6] = false;
        num_1[0][7] = false; num_1[1][7] = false; num_1[2][7] = false; num_1[3][7] = false; num_1[4][7] = false; num_1[5][7] = false;
        //num_2
        num_2[0][0] = false; num_2[1][0] = true; num_2[2][0] = true; num_2[3][0] = true; num_2[4][0] = false; num_2[5][0] = false;
        num_2[0][1] = true; num_2[1][1] = false; num_2[2][1] = false; num_2[3][1] = false; num_2[4][1] = true; num_2[5][1] = false;
        num_2[0][2] = false; num_2[1][2] = false; num_2[2][2] = false; num_2[3][2] = false; num_2[4][2] = true; num_2[5][2] = false;
        num_2[0][3] = false; num_2[1][3] = false; num_2[2][3] = false; num_2[3][3] = true; num_2[4][3] = false; num_2[5][3] = false;
        num_2[0][4] = false; num_2[1][4] = false; num_2[2][4] = true; num_2[3][4] = false; num_2[4][4] = false; num_2[5][4] = false;
        num_2[0][5] = false; num_2[1][5] = true; num_2[2][5] = false; num_2[3][5] = false; num_2[4][5] = false; num_2[5][5] = false;
        num_2[0][6] = true; num_2[1][6] = true; num_2[2][6] = true; num_2[3][6] = true; num_2[4][6] = true; num_2[5][6] = false;
        num_2[0][7] = false; num_2[1][7] = false; num_2[2][7] = false; num_2[3][7] = false; num_2[4][7] = false; num_2[5][7] = false;
        //num_3
        num_3[0][0] = true; num_3[1][0] = true; num_3[2][0] = true; num_3[3][0] = true; num_3[4][0] = true; num_3[5][0] = false;
        num_3[0][1] = false; num_3[1][1] = false; num_3[2][1] = false; num_3[3][1] = true; num_3[4][1] = false; num_3[5][1] = false;
        num_3[0][2] = false; num_3[1][2] = false; num_3[2][2] = true; num_3[3][2] = false; num_3[4][2] = false; num_3[5][2] = false;
        num_3[0][3] = false; num_3[1][3] = false; num_3[2][3] = false; num_3[3][3] = true; num_3[4][3] = false; num_3[5][3] = false;
        num_3[0][4] = false; num_3[1][4] = false; num_3[2][4] = false; num_3[3][4] = false; num_3[4][4] = true; num_3[5][4] = false;
        num_3[0][5] = true; num_3[1][5] = false; num_3[2][5] = false; num_3[3][5] = false; num_3[4][5] = true; num_3[5][5] = false;
        num_3[0][6] = false; num_3[1][6] = true; num_3[2][6] = true; num_3[3][6] = true; num_3[4][6] = false; num_3[5][6] = false;
        num_3[0][7] = false; num_3[1][7] = false; num_3[2][7] = false; num_3[3][7] = false; num_3[4][7] = false; num_3[5][7] = false;
        //num_4
        num_4[0][0] = false; num_4[1][0] = false; num_4[2][0] = false; num_4[3][0] = true; num_4[4][0] = false; num_4[5][0] = false;
        num_4[0][1] = false; num_4[1][1] = false; num_4[2][1] = true; num_4[3][1] = true; num_4[4][1] = false; num_4[5][1] = false;
        num_4[0][2] = false; num_4[1][2] = true; num_4[2][2] = false; num_4[3][2] = true; num_4[4][2] = false; num_4[5][2] = false;
        num_4[0][3] = true; num_4[1][3] = false; num_4[2][3] = false; num_4[3][3] = true; num_4[4][3] = false; num_4[5][3] = false;
        num_4[0][4] = true; num_4[1][4] = true; num_4[2][4] = true; num_4[3][4] = true; num_4[4][4] = false; num_4[5][4] = false;
        num_4[0][5] = false; num_4[1][5] = false; num_4[2][5] = false; num_4[3][5] = true; num_4[4][5] = true; num_4[5][5] = false;
        num_4[0][6] = false; num_4[1][6] = false; num_4[2][6] = false; num_4[3][6] = true; num_4[4][6] = false; num_4[5][6] = false;
        num_4[0][7] = false; num_4[1][7] = false; num_4[2][7] = false; num_4[3][7] = false; num_4[4][7] = false; num_4[5][7] = false;
        //num_5
        num_5[0][0] = true; num_5[1][0] = true; num_5[2][0] = true; num_5[3][0] = true; num_5[4][0] = true; num_5[5][0] = false;
        num_5[0][1] = true; num_5[1][1] = false; num_5[2][1] = false; num_5[3][1] = false; num_5[4][1] = false; num_5[5][1] = false;
        num_5[0][2] = true; num_5[1][2] = true; num_5[2][2] = true; num_5[3][2] = true; num_5[4][2] = false; num_5[5][2] = false;
        num_5[0][3] = false; num_5[1][3] = false; num_5[2][3] = false; num_5[3][3] = false; num_5[4][3] = true; num_5[5][3] = false;
        num_5[0][4] = false; num_5[1][4] = false; num_5[2][4] = false; num_5[3][4] = false; num_5[4][4] = true; num_5[5][4] = false;
        num_5[0][5] = true; num_5[1][5] = false; num_5[2][5] = false; num_5[3][5] = false; num_5[4][5] = true; num_5[5][5] = false;
        num_5[0][6] = false; num_5[1][6] = true; num_5[2][6] = true; num_5[3][6] = true; num_5[4][6] = false; num_5[5][6] = false;
        num_5[0][7] = false; num_5[1][7] = false; num_5[2][7] = false; num_5[3][7] = false; num_5[4][7] = false; num_5[5][7] = false;
        //num_6
        num_6[0][0] = false; num_6[1][0] = false; num_6[2][0] = true; num_6[3][0] = true; num_6[4][0] = false; num_6[5][0] = false;
        num_6[0][1] = false; num_6[1][1] = true; num_6[2][1] = false; num_6[3][1] = false; num_6[4][1] = false; num_6[5][1] = false;
        num_6[0][2] = true; num_6[1][2] = false; num_6[2][2] = false; num_6[3][2] = false; num_6[4][2] = false; num_6[5][2] = false;
        num_6[0][3] = true; num_6[1][3] = true; num_6[2][3] = true; num_6[3][3] = true; num_6[4][3] = false; num_6[5][3] = false;
        num_6[0][4] = true; num_6[1][4] = false; num_6[2][4] = false; num_6[3][4] = false; num_6[4][4] = true; num_6[5][4] = false;
        num_6[0][5] = true; num_6[1][5] = false; num_6[2][5] = false; num_6[3][5] = false; num_6[4][5] = true; num_6[5][5] = false;
        num_6[0][6] = false; num_6[1][6] = true; num_6[2][6] = true; num_6[3][6] = true; num_6[4][6] = false; num_6[5][6] = false;
        num_6[0][7] = false; num_6[1][7] = false; num_6[2][7] = false; num_6[3][7] = false; num_6[4][7] = false; num_6[5][7] = false;
        //num_7
        num_7[0][0] = true; num_7[1][0] = true; num_7[2][0] = true; num_7[3][0] = true; num_7[4][0] = true; num_7[5][0] = false;
        num_7[0][1] = false; num_7[1][1] = false; num_7[2][1] = false; num_7[3][1] = false; num_7[4][1] = true; num_7[5][1] = false;
        num_7[0][2] = false; num_7[1][2] = false; num_7[2][2] = false; num_7[3][2] = true; num_7[4][2] = false; num_7[5][2] = false;
        num_7[0][3] = false; num_7[1][3] = false; num_7[2][3] = true; num_7[3][3] = false; num_7[4][3] = false; num_7[5][3] = false;
        num_7[0][4] = false; num_7[1][4] = false; num_7[2][4] = true; num_7[3][4] = false; num_7[4][4] = false; num_7[5][4] = false;
        num_7[0][5] = false; num_7[1][5] = false; num_7[2][5] = true; num_7[3][5] = false; num_7[4][5] = false; num_7[5][5] = false;
        num_7[0][6] = false; num_7[1][6] = false; num_7[2][6] = true; num_7[3][6] = false; num_7[4][6] = false; num_7[5][6] = false;
        num_7[0][7] = false; num_7[1][7] = false; num_7[2][7] = false; num_7[3][7] = false; num_7[4][7] = false; num_7[5][7] = false;
        //num_8
        num_8[0][0] = false; num_8[1][0] = true; num_8[2][0] = true; num_8[3][0] = true; num_8[4][0] = false; num_8[5][0] = false;
        num_8[0][1] = true; num_8[1][1] = false; num_8[2][1] = false; num_8[3][1] = false; num_8[4][1] = true; num_8[5][1] = false;
        num_8[0][2] = true; num_8[1][2] = false; num_8[2][2] = false; num_8[3][2] = false; num_8[4][2] = true; num_8[5][2] = false;
        num_8[0][3] = false; num_8[1][3] = true; num_8[2][3] = true; num_8[3][3] = true; num_8[4][3] = false; num_8[5][3] = false;
        num_8[0][4] = true; num_8[1][4] = false; num_8[2][4] = false; num_8[3][4] = false; num_8[4][4] = true; num_8[5][4] = false;
        num_8[0][5] = true; num_8[1][5] = false; num_8[2][5] = false; num_8[3][5] = false; num_8[4][5] = true; num_8[5][5] = false;
        num_8[0][6] = false; num_8[1][6] = true; num_8[2][6] = true; num_8[3][6] = true; num_8[4][6] = false; num_8[5][6] = false;
        num_8[0][7] = false; num_8[1][7] = false; num_8[2][7] = false; num_8[3][7] = false; num_8[4][7] = false; num_8[5][7] = false;
        //num_9
        num_9[0][0] = false; num_9[1][0] = true; num_9[2][0] = true; num_9[3][0] = true; num_9[4][0] = false; num_9[5][0] = false;
        num_9[0][1] = true; num_9[1][1] = false; num_9[2][1] = false; num_9[3][1] = false; num_9[4][1] = true; num_9[5][1] = false;
        num_9[0][2] = true; num_9[1][2] = false; num_9[2][2] = false; num_9[3][2] = false; num_9[4][2] = true; num_9[5][2] = false;
        num_9[0][3] = false; num_9[1][3] = true; num_9[2][3] = true; num_9[3][3] = true; num_9[4][3] = true; num_9[5][3] = false;
        num_9[0][4] = false; num_9[1][4] = false; num_9[2][4] = false; num_9[3][4] = false; num_9[4][4] = true; num_9[5][4] = false;
        num_9[0][5] = false; num_9[1][5] = false; num_9[2][5] = false; num_9[3][5] = true; num_9[4][5] = false; num_9[5][5] = false;
        num_9[0][6] = false; num_9[1][6] = true; num_9[2][6] = true; num_9[3][6] = false; num_9[4][6] = false; num_9[5][6] = false;
        num_9[0][7] = false; num_9[1][7] = false; num_9[2][7] = false; num_9[3][7] = false; num_9[4][7] = false; num_9[5][7] = false;

        //.
        period[0][0] = false; period[1][0] = false; period[2][0] = false; period[3][0] = false; period[4][0] = false; period[5][0] = false;
        period[0][1] = false; period[1][1] = false; period[2][1] = false; period[3][1] = false; period[4][1] = false; period[5][1] = false;
        period[0][2] = false; period[1][2] = false; period[2][2] = false; period[3][2] = false; period[4][2] = false; period[5][2] = false;
        period[0][3] = false; period[1][3] = false; period[2][3] = false; period[3][3] = false; period[4][3] = false; period[5][3] = false;
        period[0][4] = false; period[1][4] = false; period[2][4] = false; period[3][4] = false; period[4][4] = false; period[5][4] = false;
        period[0][5] = false; period[1][5] = true; period[2][5] = true; period[3][5] = false; period[4][5] = false; period[5][5] = false;
        period[0][6] = false; period[1][6] = true; period[2][6] = true; period[3][6] = false; period[4][6] = false; period[5][6] = false;
        period[0][7] = false; period[1][7] = false; period[2][7] = false; period[3][7] = false; period[4][7] = false; period[5][7] = false;
        //,
        comma[0][0] = false; comma[1][0] = false; comma[2][0] = false; comma[3][0] = false; comma[4][0] = false; comma[5][0] = false;
        comma[0][1] = false; comma[1][1] = false; comma[2][1] = false; comma[3][1] = false; comma[4][1] = false; comma[5][1] = false;
        comma[0][2] = false; comma[1][2] = false; comma[2][2] = false; comma[3][2] = false; comma[4][2] = false; comma[5][2] = false;
        comma[0][3] = false; comma[1][3] = false; comma[2][3] = false; comma[3][3] = false; comma[4][3] = false; comma[5][3] = false;
        comma[0][4] = false; comma[1][4] = true; comma[2][4] = true; comma[3][4] = false; comma[4][4] = false; comma[5][4] = false;
        comma[0][5] = false; comma[1][5] = false; comma[2][5] = true; comma[3][5] = false; comma[4][5] = false; comma[5][5] = false;
        comma[0][6] = false; comma[1][6] = true; comma[2][6] = false; comma[3][6] = false; comma[4][6] = false; comma[5][6] = false;
        comma[0][7] = false; comma[1][7] = false; comma[2][7] = false; comma[3][7] = false; comma[4][7] = false; comma[5][7] = false;
        //"
        doubleQuotes[0][0] = false; doubleQuotes[1][0] = true; doubleQuotes[2][0] = false; doubleQuotes[3][0] = true; doubleQuotes[4][0] = false; doubleQuotes[5][0] = false;
        doubleQuotes[0][1] = false; doubleQuotes[1][1] = true; doubleQuotes[2][1] = false; doubleQuotes[3][1] = true; doubleQuotes[4][1] = false; doubleQuotes[5][1] = false;
        doubleQuotes[0][2] = false; doubleQuotes[1][2] = true; doubleQuotes[2][2] = false; doubleQuotes[3][2] = true; doubleQuotes[4][2] = false; doubleQuotes[5][2] = false;
        doubleQuotes[0][3] = false; doubleQuotes[1][3] = false; doubleQuotes[2][3] = false; doubleQuotes[3][3] = false; doubleQuotes[4][3] = false; doubleQuotes[5][3] = false;
        doubleQuotes[0][4] = false; doubleQuotes[1][4] = false; doubleQuotes[2][4] = false; doubleQuotes[3][4] = false; doubleQuotes[4][4] = false; doubleQuotes[5][4] = false;
        doubleQuotes[0][5] = false; doubleQuotes[1][5] = false; doubleQuotes[2][5] = false; doubleQuotes[3][5] = false; doubleQuotes[4][5] = false; doubleQuotes[5][5] = false;
        doubleQuotes[0][6] = false; doubleQuotes[1][6] = false; doubleQuotes[2][6] = false; doubleQuotes[3][6] = false; doubleQuotes[4][6] = false; doubleQuotes[5][6] = false;
        doubleQuotes[0][7] = false; doubleQuotes[1][7] = false; doubleQuotes[2][7] = false; doubleQuotes[3][7] = false; doubleQuotes[4][7] = false; doubleQuotes[5][7] = false;
        //'
        singleQuotes[0][0] = false; singleQuotes[1][0] = false; singleQuotes[2][0] = true; singleQuotes[3][0] = false; singleQuotes[4][0] = false; singleQuotes[5][0] = false;
        singleQuotes[0][1] = false; singleQuotes[1][1] = false; singleQuotes[2][1] = true; singleQuotes[3][1] = false; singleQuotes[4][1] = false; singleQuotes[5][1] = false;
        singleQuotes[0][2] = false; singleQuotes[1][2] = false; singleQuotes[2][2] = true; singleQuotes[3][2] = false; singleQuotes[4][2] = false; singleQuotes[5][2] = false;
        singleQuotes[0][3] = false; singleQuotes[1][3] = false; singleQuotes[2][3] = false; singleQuotes[3][3] = false; singleQuotes[4][3] = false; singleQuotes[5][3] = false;
        singleQuotes[0][4] = false; singleQuotes[1][4] = false; singleQuotes[2][4] = false; singleQuotes[3][4] = false; singleQuotes[4][4] = false; singleQuotes[5][4] = false;
        singleQuotes[0][5] = false; singleQuotes[1][5] = false; singleQuotes[2][5] = false; singleQuotes[3][5] = false; singleQuotes[4][5] = false; singleQuotes[5][5] = false;
        singleQuotes[0][6] = false; singleQuotes[1][6] = false; singleQuotes[2][6] = false; singleQuotes[3][6] = false; singleQuotes[4][6] = false; singleQuotes[5][6] = false;
        singleQuotes[0][7] = false; singleQuotes[1][7] = false; singleQuotes[2][7] = false; singleQuotes[3][7] = false; singleQuotes[4][7] = false; singleQuotes[5][7] = false;
        //`
        apostrophe[0][0] = false; apostrophe[1][0] = false; apostrophe[2][0] = true; apostrophe[3][0] = false; apostrophe[4][0] = false; apostrophe[5][0] = false;
        apostrophe[0][1] = false; apostrophe[1][1] = true; apostrophe[2][1] = false; apostrophe[3][1] = false; apostrophe[4][1] = false; apostrophe[5][1] = false;
        apostrophe[0][2] = false; apostrophe[1][2] = true; apostrophe[2][2] = true; apostrophe[3][2] = false; apostrophe[4][2] = false; apostrophe[5][2] = false;
        apostrophe[0][3] = false; apostrophe[1][3] = false; apostrophe[2][3] = false; apostrophe[3][3] = false; apostrophe[4][3] = false; apostrophe[5][3] = false;
        apostrophe[0][4] = false; apostrophe[1][4] = false; apostrophe[2][4] = false; apostrophe[3][4] = false; apostrophe[4][4] = false; apostrophe[5][4] = false;
        apostrophe[0][5] = false; apostrophe[1][5] = false; apostrophe[2][5] = false; apostrophe[3][5] = false; apostrophe[4][5] = false; apostrophe[5][5] = false;
        apostrophe[0][6] = false; apostrophe[1][6] = false; apostrophe[2][6] = false; apostrophe[3][6] = false; apostrophe[4][6] = false; apostrophe[5][6] = false;
        apostrophe[0][7] = false; apostrophe[1][7] = false; apostrophe[2][7] = false; apostrophe[3][7] = false; apostrophe[4][7] = false; apostrophe[5][7] = false;
        //?
        questionMark[0][0] = false; questionMark[1][0] = true; questionMark[2][0] = true; questionMark[3][0] = true; questionMark[4][0] = false; questionMark[5][0] = false;
        questionMark[0][1] = true; questionMark[1][1] = false; questionMark[2][1] = false; questionMark[3][1] = false; questionMark[4][1] = true; questionMark[5][1] = false;
        questionMark[0][2] = false; questionMark[1][2] = false; questionMark[2][2] = false; questionMark[3][2] = false; questionMark[4][2] = true; questionMark[5][2] = false;
        questionMark[0][3] = false; questionMark[1][3] = false; questionMark[2][3] = false; questionMark[3][3] = true; questionMark[4][3] = false; questionMark[5][3] = false;
        questionMark[0][4] = false; questionMark[1][4] = false; questionMark[2][4] = true; questionMark[3][4] = false; questionMark[4][4] = false; questionMark[5][4] = false;
        questionMark[0][5] = false; questionMark[1][5] = false; questionMark[2][5] = false; questionMark[3][5] = false; questionMark[4][5] = false; questionMark[5][5] = false;
        questionMark[0][6] = false; questionMark[1][6] = false; questionMark[2][6] = true; questionMark[3][6] = false; questionMark[4][6] = false; questionMark[5][6] = false;
        questionMark[0][7] = false; questionMark[1][7] = false; questionMark[2][7] = false; questionMark[3][7] = false; questionMark[4][7] = false; questionMark[5][7] = false;
        //!
        exclamationMark[0][0] = false; exclamationMark[1][0] = false; exclamationMark[2][0] = true; exclamationMark[3][0] = false; exclamationMark[4][0] = false; exclamationMark[5][0] = false;
        exclamationMark[0][1] = false; exclamationMark[1][1] = false; exclamationMark[2][1] = true; exclamationMark[3][1] = false; exclamationMark[4][1] = false; exclamationMark[5][1] = false;
        exclamationMark[0][2] = false; exclamationMark[1][2] = false; exclamationMark[2][2] = true; exclamationMark[3][2] = false; exclamationMark[4][2] = false; exclamationMark[5][2] = false;
        exclamationMark[0][3] = false; exclamationMark[1][3] = false; exclamationMark[2][3] = true; exclamationMark[3][3] = false; exclamationMark[4][3] = false; exclamationMark[5][3] = false;
        exclamationMark[0][4] = false; exclamationMark[1][4] = false; exclamationMark[2][4] = true; exclamationMark[3][4] = false; exclamationMark[4][4] = false; exclamationMark[5][4] = false;
        exclamationMark[0][5] = false; exclamationMark[1][5] = false; exclamationMark[2][5] = false; exclamationMark[3][5] = false; exclamationMark[4][5] = false; exclamationMark[5][5] = false;
        exclamationMark[0][6] = false; exclamationMark[1][6] = false; exclamationMark[2][6] = true; exclamationMark[3][6] = false; exclamationMark[4][6] = false; exclamationMark[5][6] = false;
        exclamationMark[0][7] = false; exclamationMark[1][7] = false; exclamationMark[2][7] = false; exclamationMark[3][7] = false; exclamationMark[4][7] = false; exclamationMark[5][7] = false;
        //@
        at[0][0] = false; at[1][0] = true; at[2][0] = true; at[3][0] = true; at[4][0] = false; at[5][0] = false;
        at[0][1] = true; at[1][1] = false; at[2][1] = false; at[3][1] = false; at[4][1] = true; at[5][1] = false;
        at[0][2] = false; at[1][2] = false; at[2][2] = false; at[3][2] = false; at[4][2] = true; at[5][2] = false;
        at[0][3] = false; at[1][3] = true; at[2][3] = false; at[3][3] = false; at[4][3] = true; at[5][3] = false;
        at[0][4] = true; at[1][4] = false; at[2][4] = true; at[3][4] = false; at[4][4] = true; at[5][4] = false;
        at[0][5] = true; at[1][5] = false; at[2][5] = true; at[3][5] = false; at[4][5] = true; at[5][5] = false;
        at[0][6] = false; at[1][6] = true; at[2][6] = true; at[3][6] = true; at[4][6] = false; at[5][6] = false;
        at[0][7] = false; at[1][7] = false; at[2][7] = false; at[3][7] = false; at[4][7] = false; at[5][7] = false;
        //_
        underscore[0][0] = false; underscore[1][0] = false; underscore[2][0] = false; underscore[3][0] = false; underscore[4][0] = false; underscore[5][0] = false;
        underscore[0][1] = false; underscore[1][1] = false; underscore[2][1] = false; underscore[3][1] = false; underscore[4][1] = false; underscore[5][1] = false;
        underscore[0][2] = false; underscore[1][2] = false; underscore[2][2] = false; underscore[3][2] = false; underscore[4][2] = false; underscore[5][2] = false;
        underscore[0][3] = false; underscore[1][3] = false; underscore[2][3] = false; underscore[3][3] = false; underscore[4][3] = false; underscore[5][3] = false;
        underscore[0][4] = false; underscore[1][4] = false; underscore[2][4] = false; underscore[3][4] = false; underscore[4][4] = false; underscore[5][4] = false;
        underscore[0][5] = false; underscore[1][5] = false; underscore[2][5] = false; underscore[3][5] = false; underscore[4][5] = false; underscore[5][5] = false;
        underscore[0][6] = true; underscore[1][6] = true; underscore[2][6] = true; underscore[3][6] = true; underscore[4][6] = true; underscore[5][6] = false;
        underscore[0][7] = false; underscore[1][7] = false; underscore[2][7] = false; underscore[3][7] = false; underscore[4][7] = false; underscore[5][7] = false;
        //*
        asterisk[0][0] = false; asterisk[1][0] = false; asterisk[2][0] = false; asterisk[3][0] = false; asterisk[4][0] = false; asterisk[5][0] = false;
        asterisk[0][1] = false; asterisk[1][1] = false; asterisk[2][1] = true; asterisk[3][1] = false; asterisk[4][1] = false; asterisk[5][1] = false;
        asterisk[0][2] = true; asterisk[1][2] = false; asterisk[2][2] = true; asterisk[3][2] = false; asterisk[4][2] = true; asterisk[5][2] = false;
        asterisk[0][3] = false; asterisk[1][3] = true; asterisk[2][3] = true; asterisk[3][3] = true; asterisk[4][3] = false; asterisk[5][3] = false;
        asterisk[0][4] = true; asterisk[1][4] = false; asterisk[2][4] = true; asterisk[3][4] = false; asterisk[4][4] = true; asterisk[5][4] = false;
        asterisk[0][5] = false; asterisk[1][5] = false; asterisk[2][5] = true; asterisk[3][5] = false; asterisk[4][5] = false; asterisk[5][5] = false;
        asterisk[0][6] = false; asterisk[1][6] = false; asterisk[2][6] = false; asterisk[3][6] = false; asterisk[4][6] = false; asterisk[5][6] = false;
        asterisk[0][7] = false; asterisk[1][7] = false; asterisk[2][7] = false; asterisk[3][7] = false; asterisk[4][7] = false; asterisk[5][7] = false;
        //#
        hash[0][0] = false; hash[1][0] = true; hash[2][0] = false; hash[3][0] = true; hash[4][0] = false; hash[5][0] = false;
        hash[0][1] = false; hash[1][1] = true; hash[2][1] = false; hash[3][1] = true; hash[4][1] = false; hash[5][1] = false;
        hash[0][2] = true; hash[1][2] = true; hash[2][2] = true; hash[3][2] = true; hash[4][2] = true; hash[5][2] = false;
        hash[0][3] = false; hash[1][3] = true; hash[2][3] = false; hash[3][3] = true; hash[4][3] = false; hash[5][3] = false;
        hash[0][4] = true; hash[1][4] = true; hash[2][4] = true; hash[3][4] = true; hash[4][4] = true; hash[5][4] = false;
        hash[0][5] = false; hash[1][5] = true; hash[2][5] = false; hash[3][5] = true; hash[4][5] = false; hash[5][5] = false;
        hash[0][6] = false; hash[1][6] = true; hash[2][6] = false; hash[3][6] = true; hash[4][6] = false; hash[5][6] = false;
        hash[0][7] = false; hash[1][7] = false; hash[2][7] = false; hash[3][7] = false; hash[4][7] = false; hash[5][7] = false;
        //$
        dollar[0][0] = false; dollar[1][0] = false; dollar[2][0] = true; dollar[3][0] = false; dollar[4][0] = false; dollar[5][0] = false;
        dollar[0][1] = false; dollar[1][1] = true; dollar[2][1] = true; dollar[3][1] = true; dollar[4][1] = true; dollar[5][1] = false;
        dollar[0][2] = true; dollar[1][2] = false; dollar[2][2] = true; dollar[3][2] = false; dollar[4][2] = false; dollar[5][2] = false;
        dollar[0][3] = false; dollar[1][3] = true; dollar[2][3] = true; dollar[3][3] = true; dollar[4][3] = false; dollar[5][3] = false;
        dollar[0][4] = false; dollar[1][4] = false; dollar[2][4] = true; dollar[3][4] = false; dollar[4][4] = true; dollar[5][4] = false;
        dollar[0][5] = true; dollar[1][5] = true; dollar[2][5] = true; dollar[3][5] = true; dollar[4][5] = false; dollar[5][5] = false;
        dollar[0][6] = false; dollar[1][6] = false; dollar[2][6] = true; dollar[3][6] = false; dollar[4][6] = false; dollar[5][6] = false;
        dollar[0][7] = false; dollar[1][7] = false; dollar[2][7] = false; dollar[3][7] = false; dollar[4][7] = false; dollar[5][7] = false;
        //%
        percent[0][0] = true; percent[1][0] = true; percent[2][0] = false; percent[3][0] = false; percent[4][0] = false; percent[5][0] = false;
        percent[0][1] = true; percent[1][1] = true; percent[2][1] = false; percent[3][1] = false; percent[4][1] = true; percent[5][1] = false;
        percent[0][2] = false; percent[1][2] = false; percent[2][2] = false; percent[3][2] = true; percent[4][2] = false; percent[5][2] = false;
        percent[0][3] = false; percent[1][3] = false; percent[2][3] = true; percent[3][3] = false; percent[4][3] = false; percent[5][3] = false;
        percent[0][4] = false; percent[1][4] = true; percent[2][4] = false; percent[3][4] = false; percent[4][4] = false; percent[5][4] = false;
        percent[0][5] = true; percent[1][5] = false; percent[2][5] = false; percent[3][5] = true; percent[4][5] = true; percent[5][5] = false;
        percent[0][6] = false; percent[1][6] = false; percent[2][6] = false; percent[3][6] = true; percent[4][6] = true; percent[5][6] = false;
        percent[0][7] = false; percent[1][7] = false; percent[2][7] = false; percent[3][7] = false; percent[4][7] = false; percent[5][7] = false;
        //&
        ampersand[0][0] = false; ampersand[1][0] = true; ampersand[2][0] = true; ampersand[3][0] = false; ampersand[4][0] = false; ampersand[5][0] = false;
        ampersand[0][1] = true; ampersand[1][1] = false; ampersand[2][1] = false; ampersand[3][1] = true; ampersand[4][1] = false; ampersand[5][1] = false;
        ampersand[0][2] = true; ampersand[1][2] = false; ampersand[2][2] = true; ampersand[3][2] = false; ampersand[4][2] = false; ampersand[5][2] = false;
        ampersand[0][3] = false; ampersand[1][3] = true; ampersand[2][3] = false; ampersand[3][3] = false; ampersand[4][3] = false; ampersand[5][3] = false;
        ampersand[0][4] = true; ampersand[1][4] = false; ampersand[2][4] = true; ampersand[3][4] = false; ampersand[4][4] = true; ampersand[5][4] = false;
        ampersand[0][5] = true; ampersand[1][5] = false; ampersand[2][5] = false; ampersand[3][5] = true; ampersand[4][5] = false; ampersand[5][5] = false;
        ampersand[0][6] = false; ampersand[1][6] = true; ampersand[2][6] = true; ampersand[3][6] = false; ampersand[4][6] = true; ampersand[5][6] = false;
        ampersand[0][7] = false; ampersand[1][7] = false; ampersand[2][7] = false; ampersand[3][7] = false; ampersand[4][7] = false; ampersand[5][7] = false;
        //(
        leftBracket[0][0] = false; leftBracket[1][0] = false; leftBracket[2][0] = false; leftBracket[3][0] = true; leftBracket[4][0] = false; leftBracket[5][0] = false;
        leftBracket[0][1] = false; leftBracket[1][1] = false; leftBracket[2][1] = true; leftBracket[3][1] = false; leftBracket[4][1] = false; leftBracket[5][1] = false;
        leftBracket[0][2] = false; leftBracket[1][2] = true; leftBracket[2][2] = false; leftBracket[3][2] = false; leftBracket[4][2] = false; leftBracket[5][2] = false;
        leftBracket[0][3] = false; leftBracket[1][3] = true; leftBracket[2][3] = false; leftBracket[3][3] = false; leftBracket[4][3] = false; leftBracket[5][3] = false;
        leftBracket[0][4] = false; leftBracket[1][4] = true; leftBracket[2][4] = false; leftBracket[3][4] = false; leftBracket[4][4] = false; leftBracket[5][4] = false;
        leftBracket[0][5] = false; leftBracket[1][5] = false; leftBracket[2][5] = true; leftBracket[3][5] = false; leftBracket[4][5] = false; leftBracket[5][5] = false;
        leftBracket[0][6] = false; leftBracket[1][6] = false; leftBracket[2][6] = false; leftBracket[3][6] = true; leftBracket[4][6] = false; leftBracket[5][6] = false;
        leftBracket[0][7] = false; leftBracket[1][7] = false; leftBracket[2][7] = false; leftBracket[3][7] = false; leftBracket[4][7] = false; leftBracket[5][7] = false;
        //)
        rightBracket[0][0] = false; rightBracket[1][0] = true; rightBracket[2][0] = false; rightBracket[3][0] = false; rightBracket[4][0] = false; rightBracket[5][0] = false;
        rightBracket[0][1] = false; rightBracket[1][1] = false; rightBracket[2][1] = true; rightBracket[3][1] = false; rightBracket[4][1] = false; rightBracket[5][1] = false;
        rightBracket[0][2] = false; rightBracket[1][2] = false; rightBracket[2][2] = false; rightBracket[3][2] = true; rightBracket[4][2] = false; rightBracket[5][2] = false;
        rightBracket[0][3] = false; rightBracket[1][3] = false; rightBracket[2][3] = false; rightBracket[3][3] = true; rightBracket[4][3] = false; rightBracket[5][3] = false;
        rightBracket[0][4] = false; rightBracket[1][4] = false; rightBracket[2][4] = false; rightBracket[3][4] = true; rightBracket[4][4] = false; rightBracket[5][4] = false;
        rightBracket[0][5] = false; rightBracket[1][5] = false; rightBracket[2][5] = true; rightBracket[3][5] = false; rightBracket[4][5] = false; rightBracket[5][5] = false;
        rightBracket[0][6] = false; rightBracket[1][6] = true; rightBracket[2][6] = false; rightBracket[3][6] = false; rightBracket[4][6] = false; rightBracket[5][6] = false;
        rightBracket[0][7] = false; rightBracket[1][7] = false; rightBracket[2][7] = false; rightBracket[3][7] = false; rightBracket[4][7] = false; rightBracket[5][7] = false;
        //+
        plus[0][0] = false; plus[1][0] = false; plus[2][0] = false; plus[3][0] = false; plus[4][0] = false; plus[5][0] = false;
        plus[0][1] = false; plus[1][1] = false; plus[2][1] = true; plus[3][1] = false; plus[4][1] = false; plus[5][1] = false;
        plus[0][2] = false; plus[1][2] = false; plus[2][2] = true; plus[3][2] = false; plus[4][2] = false; plus[5][2] = false;
        plus[0][3] = true; plus[1][3] = true; plus[2][3] = true; plus[3][3] = true; plus[4][3] = true; plus[5][3] = false;
        plus[0][4] = false; plus[1][4] = false; plus[2][4] = true; plus[3][4] = false; plus[4][4] = false; plus[5][4] = false;
        plus[0][5] = false; plus[1][5] = false; plus[2][5] = true; plus[3][5] = false; plus[4][5] = false; plus[5][5] = false;
        plus[0][6] = false; plus[1][6] = false; plus[2][6] = false; plus[3][6] = false; plus[4][6] = false; plus[5][6] = false;
        plus[0][7] = false; plus[1][7] = false; plus[2][7] = false; plus[3][7] = false; plus[4][7] = false; plus[5][7] = false;
        //-
        minus[0][0] = false; minus[1][0] = false; minus[2][0] = false; minus[3][0] = false; minus[4][0] = false; minus[5][0] = false;
        minus[0][1] = false; minus[1][1] = false; minus[2][1] = false; minus[3][1] = false; minus[4][1] = false; minus[5][1] = false;
        minus[0][2] = false; minus[1][2] = false; minus[2][2] = false; minus[3][2] = false; minus[4][2] = false; minus[5][2] = false;
        minus[0][3] = true; minus[1][3] = true; minus[2][3] = true; minus[3][3] = true; minus[4][3] = true; minus[5][3] = false;
        minus[0][4] = false; minus[1][4] = false; minus[2][4] = false; minus[3][4] = false; minus[4][4] = false; minus[5][4] = false;
        minus[0][5] = false; minus[1][5] = false; minus[2][5] = false; minus[3][5] = false; minus[4][5] = false; minus[5][5] = false;
        minus[0][6] = false; minus[1][6] = false; minus[2][6] = false; minus[3][6] = false; minus[4][6] = false; minus[5][6] = false;
        minus[0][7] = false; minus[1][7] = false; minus[2][7] = false; minus[3][7] = false; minus[4][7] = false; minus[5][7] = false;
        // /
        forwardSlash[0][0] = false; forwardSlash[1][0] = false; forwardSlash[2][0] = false; forwardSlash[3][0] = false; forwardSlash[4][0] = false; forwardSlash[5][0] = false;
        forwardSlash[0][1] = false; forwardSlash[1][1] = false; forwardSlash[2][1] = false; forwardSlash[3][1] = false; forwardSlash[4][1] = true; forwardSlash[5][1] = false;
        forwardSlash[0][2] = false; forwardSlash[1][2] = false; forwardSlash[2][2] = false; forwardSlash[3][2] = true; forwardSlash[4][2] = false; forwardSlash[5][2] = false;
        forwardSlash[0][3] = false; forwardSlash[1][3] = false; forwardSlash[2][3] = true; forwardSlash[3][3] = false; forwardSlash[4][3] = false; forwardSlash[5][3] = false;
        forwardSlash[0][4] = false; forwardSlash[1][4] = true; forwardSlash[2][4] = false; forwardSlash[3][4] = false; forwardSlash[4][4] = false; forwardSlash[5][4] = false;
        forwardSlash[0][5] = true; forwardSlash[1][5] = false; forwardSlash[2][5] = false; forwardSlash[3][5] = false; forwardSlash[4][5] = false; forwardSlash[5][5] = false;
        forwardSlash[0][6] = false; forwardSlash[1][6] = false; forwardSlash[2][6] = false; forwardSlash[3][6] = false; forwardSlash[4][6] = false; forwardSlash[5][6] = false;
        forwardSlash[0][7] = false; forwardSlash[1][7] = false; forwardSlash[2][7] = false; forwardSlash[3][7] = false; forwardSlash[4][7] = false; forwardSlash[5][7] = false;
        // \
        backwardSlash[0][0] = false; backwardSlash[1][0] = false; backwardSlash[2][0] = false; backwardSlash[3][0] = false; backwardSlash[4][0] = false; backwardSlash[5][0] = false;
        backwardSlash[0][1] = true; backwardSlash[1][1] = false; backwardSlash[2][1] = false; backwardSlash[3][1] = false; backwardSlash[4][1] = false; backwardSlash[5][1] = false;
        backwardSlash[0][2] = false; backwardSlash[1][2] = true; backwardSlash[2][2] = false; backwardSlash[3][2] = false; backwardSlash[4][2] = false; backwardSlash[5][2] = false;
        backwardSlash[0][3] = false; backwardSlash[1][3] = false; backwardSlash[2][3] = true; backwardSlash[3][3] = false; backwardSlash[4][3] = false; backwardSlash[5][3] = false;
        backwardSlash[0][4] = false; backwardSlash[1][4] = false; backwardSlash[2][4] = false; backwardSlash[3][4] = true; backwardSlash[4][4] = false; backwardSlash[5][4] = false;
        backwardSlash[0][5] = false; backwardSlash[1][5] = false; backwardSlash[2][5] = false; backwardSlash[3][5] = false; backwardSlash[4][5] = true; backwardSlash[5][5] = false;
        backwardSlash[0][6] = false; backwardSlash[1][6] = false; backwardSlash[2][6] = false; backwardSlash[3][6] = false; backwardSlash[4][6] = false; backwardSlash[5][6] = false;
        backwardSlash[0][7] = false; backwardSlash[1][7] = false; backwardSlash[2][7] = false; backwardSlash[3][7] = false; backwardSlash[4][7] = false; backwardSlash[5][7] = false;
        //:
        colon[0][0] = false; colon[1][0] = false; colon[2][0] = false; colon[3][0] = false; colon[4][0] = false; colon[5][0] = false;
        colon[0][1] = false; colon[1][1] = true; colon[2][1] = true; colon[3][1] = false; colon[4][1] = false; colon[5][1] = false;
        colon[0][2] = false; colon[1][2] = true; colon[2][2] = true; colon[3][2] = false; colon[4][2] = false; colon[5][2] = false;
        colon[0][3] = false; colon[1][3] = false; colon[2][3] = false; colon[3][3] = false; colon[4][3] = false; colon[5][3] = false;
        colon[0][4] = false; colon[1][4] = true; colon[2][4] = true; colon[3][4] = false; colon[4][4] = false; colon[5][4] = false;
        colon[0][5] = false; colon[1][5] = true; colon[2][5] = true; colon[3][5] = false; colon[4][5] = false; colon[5][5] = false;
        colon[0][6] = false; colon[1][6] = false; colon[2][6] = false; colon[3][6] = false; colon[4][6] = false; colon[5][6] = false;
        colon[0][7] = false; colon[1][7] = false; colon[2][7] = false; colon[3][7] = false; colon[4][7] = false; colon[5][7] = false;
        //;
        semiColon[0][0] = false; semiColon[1][0] = false; semiColon[2][0] = false; semiColon[3][0] = false; semiColon[4][0] = false; semiColon[5][0] = false;
        semiColon[0][1] = false; semiColon[1][1] = true; semiColon[2][1] = true; semiColon[3][1] = false; semiColon[4][1] = false; semiColon[5][1] = false;
        semiColon[0][2] = false; semiColon[1][2] = true; semiColon[2][2] = true; semiColon[3][2] = false; semiColon[4][2] = false; semiColon[5][2] = false;
        semiColon[0][3] = false; semiColon[1][3] = false; semiColon[2][3] = false; semiColon[3][3] = false; semiColon[4][3] = false; semiColon[5][3] = false;
        semiColon[0][4] = false; semiColon[1][4] = true; semiColon[2][4] = true; semiColon[3][4] = false; semiColon[4][4] = false; semiColon[5][4] = false;
        semiColon[0][5] = false; semiColon[1][5] = false; semiColon[2][5] = true; semiColon[3][5] = false; semiColon[4][5] = false; semiColon[5][5] = false;
        semiColon[0][6] = false; semiColon[1][6] = true; semiColon[2][6] = false; semiColon[3][6] = false; semiColon[4][6] = false; semiColon[5][6] = false;
        semiColon[0][7] = false; semiColon[1][7] = false; semiColon[2][7] = false; semiColon[3][7] = false; semiColon[4][7] = false; semiColon[5][7] = false;
        //<
        leftArrow[0][0] = false; leftArrow[1][0] = false; leftArrow[2][0] = false; leftArrow[3][0] = true; leftArrow[4][0] = false; leftArrow[5][0] = false;
        leftArrow[0][1] = false; leftArrow[1][1] = false; leftArrow[2][1] = true; leftArrow[3][1] = false; leftArrow[4][1] = false; leftArrow[5][1] = false;
        leftArrow[0][2] = false; leftArrow[1][2] = true; leftArrow[2][2] = false; leftArrow[3][2] = false; leftArrow[4][2] = false; leftArrow[5][2] = false;
        leftArrow[0][3] = true; leftArrow[1][3] = false; leftArrow[2][3] = false; leftArrow[3][3] = false; leftArrow[4][3] = false; leftArrow[5][3] = false;
        leftArrow[0][4] = false; leftArrow[1][4] = true; leftArrow[2][4] = false; leftArrow[3][4] = false; leftArrow[4][4] = false; leftArrow[5][4] = false;
        leftArrow[0][5] = false; leftArrow[1][5] = false; leftArrow[2][5] = true; leftArrow[3][5] = false; leftArrow[4][5] = false; leftArrow[5][5] = false;
        leftArrow[0][6] = false; leftArrow[1][6] = false; leftArrow[2][6] = false; leftArrow[3][6] = true; leftArrow[4][6] = false; leftArrow[5][6] = false;
        leftArrow[0][7] = false; leftArrow[1][7] = false; leftArrow[2][7] = false; leftArrow[3][7] = false; leftArrow[4][7] = false; leftArrow[5][7] = false;
        //>
        rightArrow[0][0] = false; rightArrow[1][0] = true; rightArrow[2][0] = false; rightArrow[3][0] = false; rightArrow[4][0] = false; rightArrow[5][0] = false;
        rightArrow[0][1] = false; rightArrow[1][1] = false; rightArrow[2][1] = true; rightArrow[3][1] = false; rightArrow[4][1] = false; rightArrow[5][1] = false;
        rightArrow[0][2] = false; rightArrow[1][2] = false; rightArrow[2][2] = false; rightArrow[3][2] = true; rightArrow[4][2] = false; rightArrow[5][2] = false;
        rightArrow[0][3] = false; rightArrow[1][3] = false; rightArrow[2][3] = false; rightArrow[3][3] = false; rightArrow[4][3] = true; rightArrow[5][3] = false;
        rightArrow[0][4] = false; rightArrow[1][4] = false; rightArrow[2][4] = false; rightArrow[3][4] = true; rightArrow[4][4] = false; rightArrow[5][4] = false;
        rightArrow[0][5] = false; rightArrow[1][5] = false; rightArrow[2][5] = true; rightArrow[3][5] = false; rightArrow[4][5] = false; rightArrow[5][5] = false;
        rightArrow[0][6] = false; rightArrow[1][6] = true; rightArrow[2][6] = false; rightArrow[3][6] = false; rightArrow[4][6] = false; rightArrow[5][6] = false;
        rightArrow[0][7] = false; rightArrow[1][7] = false; rightArrow[2][7] = false; rightArrow[3][7] = false; rightArrow[4][7] = false; rightArrow[5][7] = false;
        //=
        equals[0][0] = false; equals[1][0] = false; equals[2][0] = false; equals[3][0] = false; equals[4][0] = false; equals[5][0] = false;
        equals[0][1] = false; equals[1][1] = false; equals[2][1] = false; equals[3][1] = false; equals[4][1] = false; equals[5][1] = false;
        equals[0][2] = true; equals[1][2] = true; equals[2][2] = true; equals[3][2] = true; equals[4][2] = true; equals[5][2] = false;
        equals[0][3] = false; equals[1][3] = false; equals[2][3] = false; equals[3][3] = false; equals[4][3] = false; equals[5][3] = false;
        equals[0][4] = true; equals[1][4] = true; equals[2][4] = true; equals[3][4] = true; equals[4][4] = true; equals[5][4] = false;
        equals[0][5] = false; equals[1][5] = false; equals[2][5] = false; equals[3][5] = false; equals[4][5] = false; equals[5][5] = false;
        equals[0][6] = false; equals[1][6] = false; equals[2][6] = false; equals[3][6] = false; equals[4][6] = false; equals[5][6] = false;
        equals[0][7] = false; equals[1][7] = false; equals[2][7] = false; equals[3][7] = false; equals[4][7] = false; equals[5][7] = false;
        //[
        leftSquareBracket[0][0] = false; leftSquareBracket[1][0] = true; leftSquareBracket[2][0] = true; leftSquareBracket[3][0] = true; leftSquareBracket[4][0] = false; leftSquareBracket[5][0] = false;
        leftSquareBracket[0][1] = false; leftSquareBracket[1][1] = true; leftSquareBracket[2][1] = false; leftSquareBracket[3][1] = false; leftSquareBracket[4][1] = false; leftSquareBracket[5][1] = false;
        leftSquareBracket[0][2] = false; leftSquareBracket[1][2] = true; leftSquareBracket[2][2] = false; leftSquareBracket[3][2] = false; leftSquareBracket[4][2] = false; leftSquareBracket[5][2] = false;
        leftSquareBracket[0][3] = false; leftSquareBracket[1][3] = true; leftSquareBracket[2][3] = false; leftSquareBracket[3][3] = false; leftSquareBracket[4][3] = false; leftSquareBracket[5][3] = false;
        leftSquareBracket[0][4] = false; leftSquareBracket[1][4] = true; leftSquareBracket[2][4] = false; leftSquareBracket[3][4] = false; leftSquareBracket[4][4] = false; leftSquareBracket[5][4] = false;
        leftSquareBracket[0][5] = false; leftSquareBracket[1][5] = true; leftSquareBracket[2][5] = false; leftSquareBracket[3][5] = false; leftSquareBracket[4][5] = false; leftSquareBracket[5][5] = false;
        leftSquareBracket[0][6] = false; leftSquareBracket[1][6] = true; leftSquareBracket[2][6] = true; leftSquareBracket[3][6] = true; leftSquareBracket[4][6] = false; leftSquareBracket[5][6] = false;
        leftSquareBracket[0][7] = false; leftSquareBracket[1][7] = false; leftSquareBracket[2][7] = false; leftSquareBracket[3][7] = false; leftSquareBracket[4][7] = false; leftSquareBracket[5][7] = false;
        //]
        rightSquareBracket[0][0] = false; rightSquareBracket[1][0] = true; rightSquareBracket[2][0] = true; rightSquareBracket[3][0] = true; rightSquareBracket[4][0] = false; rightSquareBracket[5][0] = false;
        rightSquareBracket[0][1] = false; rightSquareBracket[1][1] = false; rightSquareBracket[2][1] = false; rightSquareBracket[3][1] = true; rightSquareBracket[4][1] = false; rightSquareBracket[5][1] = false;
        rightSquareBracket[0][2] = false; rightSquareBracket[1][2] = false; rightSquareBracket[2][2] = false; rightSquareBracket[3][2] = true; rightSquareBracket[4][2] = false; rightSquareBracket[5][2] = false;
        rightSquareBracket[0][3] = false; rightSquareBracket[1][3] = false; rightSquareBracket[2][3] = false; rightSquareBracket[3][3] = true; rightSquareBracket[4][3] = false; rightSquareBracket[5][3] = false;
        rightSquareBracket[0][4] = false; rightSquareBracket[1][4] = false; rightSquareBracket[2][4] = false; rightSquareBracket[3][4] = true; rightSquareBracket[4][4] = false; rightSquareBracket[5][4] = false;
        rightSquareBracket[0][5] = false; rightSquareBracket[1][5] = false; rightSquareBracket[2][5] = false; rightSquareBracket[3][5] = true; rightSquareBracket[4][5] = false; rightSquareBracket[5][5] = false;
        rightSquareBracket[0][6] = false; rightSquareBracket[1][6] = true; rightSquareBracket[2][6] = true; rightSquareBracket[3][6] = true; rightSquareBracket[4][6] = false; rightSquareBracket[5][6] = false;
        rightSquareBracket[0][7] = false; rightSquareBracket[1][7] = false; rightSquareBracket[2][7] = false; rightSquareBracket[3][7] = false; rightSquareBracket[4][7] = false; rightSquareBracket[5][7] = false;
        //^
        power[0][0] = false; power[1][0] = false; power[2][0] = true; power[3][0] = false; power[4][0] = false; power[5][0] = false;
        power[0][1] = false; power[1][1] = true; power[2][1] = false; power[3][1] = true; power[4][1] = false; power[5][1] = false;
        power[0][2] = true; power[1][2] = false; power[2][2] = false; power[3][2] = false; power[4][2] = true; power[5][2] = false;
        power[0][3] = false; power[1][3] = false; power[2][3] = false; power[3][3] = false; power[4][3] = false; power[5][3] = false;
        power[0][4] = false; power[1][4] = false; power[2][4] = false; power[3][4] = false; power[4][4] = false; power[5][4] = false;
        power[0][5] = false; power[1][5] = false; power[2][5] = false; power[3][5] = false; power[4][5] = false; power[5][5] = false;
        power[0][6] = false; power[1][6] = false; power[2][6] = false; power[3][6] = false; power[4][6] = false; power[5][6] = false;
        power[0][7] = false; power[1][7] = false; power[2][7] = false; power[3][7] = false; power[4][7] = false; power[5][7] = false;
        //{
        leftBrace[0][0] = false; leftBrace[1][0] = false; leftBrace[2][0] = true; leftBrace[3][0] = true; leftBrace[4][0] = false; leftBrace[5][0] = false;
        leftBrace[0][1] = false; leftBrace[1][1] = true; leftBrace[2][1] = false; leftBrace[3][1] = false; leftBrace[4][1] = false; leftBrace[5][1] = false;
        leftBrace[0][2] = false; leftBrace[1][2] = true; leftBrace[2][2] = false; leftBrace[3][2] = false; leftBrace[4][2] = false; leftBrace[5][2] = false;
        leftBrace[0][3] = true; leftBrace[1][3] = false; leftBrace[2][3] = false; leftBrace[3][3] = false; leftBrace[4][3] = false; leftBrace[5][3] = false;
        leftBrace[0][4] = false; leftBrace[1][4] = true; leftBrace[2][4] = false; leftBrace[3][4] = false; leftBrace[4][4] = false; leftBrace[5][4] = false;
        leftBrace[0][5] = false; leftBrace[1][5] = true; leftBrace[2][5] = false; leftBrace[3][5] = false; leftBrace[4][5] = false; leftBrace[5][5] = false;
        leftBrace[0][6] = false; leftBrace[1][6] = false; leftBrace[2][6] = true; leftBrace[3][6] = true; leftBrace[4][6] = false; leftBrace[5][6] = false;
        leftBrace[0][7] = false; leftBrace[1][7] = false; leftBrace[2][7] = false; leftBrace[3][7] = false; leftBrace[4][7] = false; leftBrace[5][7] = false;
        //}
        rightBrace[0][0] = false; rightBrace[1][0] = true; rightBrace[2][0] = true; rightBrace[3][0] = false; rightBrace[4][0] = false; rightBrace[5][0] = false;
        rightBrace[0][1] = false; rightBrace[1][1] = false; rightBrace[2][1] = false; rightBrace[3][1] = true; rightBrace[4][1] = false; rightBrace[5][1] = false;
        rightBrace[0][2] = false; rightBrace[1][2] = false; rightBrace[2][2] = false; rightBrace[3][2] = true; rightBrace[4][2] = false; rightBrace[5][2] = false;
        rightBrace[0][3] = false; rightBrace[1][3] = false; rightBrace[2][3] = false; rightBrace[3][3] = false; rightBrace[4][3] = true; rightBrace[5][3] = false;
        rightBrace[0][4] = false; rightBrace[1][4] = false; rightBrace[2][4] = false; rightBrace[3][4] = true; rightBrace[4][4] = false; rightBrace[5][4] = false;
        rightBrace[0][5] = false; rightBrace[1][5] = false; rightBrace[2][5] = false; rightBrace[3][5] = true; rightBrace[4][5] = false; rightBrace[5][5] = false;
        rightBrace[0][6] = false; rightBrace[1][6] = true; rightBrace[2][6] = true; rightBrace[3][6] = false; rightBrace[4][6] = false; rightBrace[5][6] = false;
        rightBrace[0][7] = false; rightBrace[1][7] = false; rightBrace[2][7] = false; rightBrace[3][7] = false; rightBrace[4][7] = false; rightBrace[5][7] = false;
        // |
        pipe[0][0] = false; pipe[1][0] = false; pipe[2][0] = true; pipe[3][0] = false; pipe[4][0] = false; pipe[5][0] = false;
        pipe[0][1] = false; pipe[1][1] = false; pipe[2][1] = true; pipe[3][1] = false; pipe[4][1] = false; pipe[5][1] = false;
        pipe[0][2] = false; pipe[1][2] = false; pipe[2][2] = true; pipe[3][2] = false; pipe[4][2] = false; pipe[5][2] = false;
        pipe[0][3] = false; pipe[1][3] = false; pipe[2][3] = true; pipe[3][3] = false; pipe[4][3] = false; pipe[5][3] = false;
        pipe[0][4] = false; pipe[1][4] = false; pipe[2][4] = true; pipe[3][4] = false; pipe[4][4] = false; pipe[5][4] = false;
        pipe[0][5] = false; pipe[1][5] = false; pipe[2][5] = true; pipe[3][5] = false; pipe[4][5] = false; pipe[5][5] = false;
        pipe[0][6] = false; pipe[1][6] = false; pipe[2][6] = true; pipe[3][6] = false; pipe[4][6] = false; pipe[5][6] = false;
        pipe[0][7] = false; pipe[1][7] = false; pipe[2][7] = false; pipe[3][7] = false; pipe[4][7] = false; pipe[5][7] = false;
        //~
        tilda[0][0] = false; tilda[1][0] = false; tilda[2][0] = false; tilda[3][0] = false; tilda[4][0] = false; tilda[5][0] = false;
        tilda[0][1] = false; tilda[1][1] = false; tilda[2][1] = false; tilda[3][1] = false; tilda[4][1] = false; tilda[5][1] = false;
        tilda[0][2] = false; tilda[1][2] = true; tilda[2][2] = false; tilda[3][2] = false; tilda[4][2] = false; tilda[5][2] = false;
        tilda[0][3] = true; tilda[1][3] = false; tilda[2][3] = true; tilda[3][3] = false; tilda[4][3] = true; tilda[5][3] = false;
        tilda[0][4] = false; tilda[1][4] = false; tilda[2][4] = false; tilda[3][4] = true; tilda[4][4] = false; tilda[5][4] = false;
        tilda[0][5] = false; tilda[1][5] = false; tilda[2][5] = false; tilda[3][5] = false; tilda[4][5] = false; tilda[5][5] = false;
        tilda[0][6] = false; tilda[1][6] = false; tilda[2][6] = false; tilda[3][6] = false; tilda[4][6] = false; tilda[5][6] = false;
        tilda[0][7] = false; tilda[1][7] = false; tilda[2][7] = false; tilda[3][7] = false; tilda[4][7] = false; tilda[5][7] = false;
    }
}