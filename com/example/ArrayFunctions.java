package com.example;

import java.util.Arrays;

public class ArrayFunctions {
    public static void main(String[] args) {
        int[] array = {98, 99, 100};
        System.out.println(Arrays.toString(array));       // original array
        modify(array);
        System.out.println(Arrays.toString(array));       // modified array
    }

    static void modify(int[] elements) {
        elements[1] = 0;                     // modify array using function
    }
}
