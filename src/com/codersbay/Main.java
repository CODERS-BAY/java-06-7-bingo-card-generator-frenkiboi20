package com.codersbay;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n\n\tB I N G O\n");
        String[] columnB = getColB(1, 15);
        String[] columnI = getColI(16, 30);
        String[] columnN = getColN(31, 45);
        String[] columnG = getColG(46, 60);
        String[] columnO = getColO(61, 75);

        for (int i = 0; i < columnB.length; i++) {
            System.out.println(columnB[i] + "   " + columnI[i] + "   " + columnN[i] + "   " + columnG[i] + "   " + columnO[i]);
            System.out.println();
        }
    }

    public static String[] getColB(int min, int max) {
        String[] colB = new String[5];
        for (int i = 0; i < colB.length; i++) {
            colB[i] = String.valueOf((int) (Math.floor(Math.random() * (max - min)) + min));
        }
        return colB;
    }

    public static String[] getColI(int min, int max) {
        String[] colI = new String[5];
        for (int i = 0; i < colI.length; i++) {
            colI[i] = String.valueOf((int) (Math.floor(Math.random() * (max - min)) + min));
        }
        return colI;
    }

    public static String[] getColN(int min, int max) {
        String[] colN = new String[5];
        colN[0] = String.valueOf((int) (Math.floor(Math.random() * (max - min)) + min));
        colN[1] = String.valueOf((int) (Math.floor(Math.random() * (max - min)) + min));
        colN[2] = " ";
        colN[3] = String.valueOf((int) (Math.floor(Math.random() * (max - min)) + min));
        colN[4] = String.valueOf((int) (Math.floor(Math.random() * (max - min)) + min));
        return colN;
    }

    public static String[] getColG(int min, int max) {
        String[] colG = new String[5];
        for (int i = 0; i < colG.length; i++) {
            colG[i] = String.valueOf((int) (Math.floor(Math.random() * (max - min)) + min));
        }
        return colG;
    }

    public static String[] getColO(int min, int max) {
        String[] colO = new String[5];
        for (int i = 0; i < colO.length; i++) {
            colO[i] = String.valueOf((int) (Math.floor(Math.random() * (max - min)) + min));
        }
        return colO;
    }
}