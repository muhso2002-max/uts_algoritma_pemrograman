package uts_algoritmapemrograman;

import java.util.Arrays;

public class UTS_ALGORITMAPEMROGRAMAN {
    public static void main(String[] args) {
        int[] A = {200, 50, 10, 4, 300, 1};

        int[] ascending = A.clone();
        Arrays.sort(ascending);

        int[] descending = ascending.clone();
        for (int i = 0; i < descending.length / 2; i++) {
            int temp = descending[i];
            descending[i] = descending[descending.length - 1 - i];
            descending[descending.length - 1 - i] = temp;
        }

        System.out.println("Array awal  : " + Arrays.toString(A));
        System.out.println("Ascending   : " + Arrays.toString(ascending));
        System.out.println("Descending  : " + Arrays.toString(descending));
    }
}