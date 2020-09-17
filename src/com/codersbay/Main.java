package com.codersbay;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n\n\tB I N G O\n");
        int[] columnB = getCol(1, 15);
        int[] columnI = getCol(16, 30);
        int[] columnN = getCol(31, 45);
        int[] columnG = getCol(46, 60);
        int[] columnO = getCol(61, 75);

        for (int i = 0; i < columnB.length; i++) {
            System.out.println(columnB[i] + "   " + columnI[i] + "   " + columnN[i] + "   " + columnG[i] + "   " + columnO[i]);
            System.out.println();
        }
    }

    public static int[] getCol(int min, int max) {

        int[] col = new int[5];

        for (int i = 0; i < col.length; i++) {
            col[i] = (int) (Math.floor(Math.random() * (max - min)) + min);
        }

        return col;
    }


}