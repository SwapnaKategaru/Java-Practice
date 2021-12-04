package com.example;

public class SwapValues {
    public static void main(String[] args) {
        int a = 1;
        int b = 9;
        swap(a,b);

        System.out.println(a + "," + b);
    }

    static void swap(int a, int b) {
        int c = a;
        a = b;
        b = c;
    }
}
