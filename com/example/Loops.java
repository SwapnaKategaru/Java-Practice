package com.example;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        
        // for loop
        for (int num=3; num<=30; num+=3) {
            System.out.println("Multiples of 3:" + num);
        }

        // while loop
        int a = 5;
        int i = 1;
        while (i <= 10) {
            System.out.println(a * i);
            i++;
        }


        //get values as per specified range with user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        for (int x=1; x<=number; x++) {
            System.out.println(x);
        }


        // do-while loop   - execute once and then checks for condition
        Scanner input2 = new Scanner(System.in);
        String text = "Wasted";

        do {
           System.out.println("do statement is executed");
       } while (text != "Wasted");
         

        input.close();
        input2.close();
    }
}
