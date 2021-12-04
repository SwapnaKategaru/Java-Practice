package com.example;

import java.util.Scanner;

public class DataType {
    public static void main(String[] args){

        // System.in takes input from user keyboard

        Scanner input = new Scanner(System.in);
        System.out.print("Enter bool value: ");                    // print - continues within same line
        System.out.println("Value is: " + input.nextBoolean());    // println - moves to next line

        System.out.print("Enter two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum is: " + sum);

        byte B = 33;
        int i = 5;
        char c = 'b';       // every letter has ascii character value for upper and lower cases
        char c2 = 'B';
        boolean b = true;
        float f = 67.98f;
        long l = 78908765L;
        double d = 456.68980;
        String s = "text";

        System.out.println(B +" "+ i +" "+ c +" "+ b +" "+ f +" "+ l +" "+ d +" "+ s);
        System.out.print("ASCII Character value of " + c + " and " + c2 + " : " + (int)(c) + " and " + (int)(c2));

        input.close();
    }
}