package com.example;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] array_example = {2, 3, 4, 5};            // directly assigning values to array
        System.out.println(Arrays.toString(array_example));

        int[] empty_int_array = new int[4];            // unassigned integer type arrays have default value "0" 
        System.out.println(empty_int_array[3]);

        String[] empty_string_array = new String[3];
        System.out.println(empty_string_array[2]);     // unassigned string type arrays have default value "null"

        empty_int_array[0] = 1;
        empty_int_array[2] = 25;
        System.out.println(empty_int_array);
        System.out.println(Arrays.toString(empty_int_array));          // print array using toString method


        Scanner input = new Scanner(System.in);
        System.out.print("Enter 4 array values: ");

        for (int i=0; i<4; i++) {                                // assigning array values with user input
        // for (int i=0; i<empty_int_array.length; i++) {        // array_name.length if length of array is unknown
        
            empty_int_array[i] = input.nextInt();
            System.out.print(empty_int_array[i] + " ");
        }

        System.out.println("\nArray :" + Arrays.toString(empty_int_array));

        // for each loop
        System.out.print("Printing array values using forEach loop: ");
        for (int element : empty_int_array) {
            System.out.print(element + " "); 
        }


        // non-primities(String) arrays
        System.out.print("\nEnter some strings: ");
        String[] str = new String[3];

        for (int x=0; x<str.length; x++) {
            str[x] = input.next();
        }

        System.out.println("Array of Strings: " + Arrays.toString(str));

        str[2] = "some text";               // modified value
        System.out.println("Modified array value: " + Arrays.toString(str));

        input.close();
    }
}
