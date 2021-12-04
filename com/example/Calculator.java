package com.example;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the operator : ");
            char sign = input.next().charAt(0);

            if (sign == '+' || sign == '-' || sign == '/' || sign == '%' || sign == '*') {
                System.out.print("Enter two numbers : ");

                int m = input.nextInt();
                int n = input.nextInt();
            
                if (sign == '+') {
                    System.out.println(m + n);
                }
                if (sign == '-') {
                    System.out.println(m - n);
                }
                if (sign == '/') {
                    if (n > 0) {
                        System.out.println(m / n);
                    } else {
                        System.out.println("Cannot divide by zero");
                    }
                    
                }
                if (sign == '%') {
                    System.out.println(m % n);
                }
                if (sign == '*') {
                    System.out.println(m * n);
                }
            } else if (sign == 'z' || sign == 'Z') {
                break;
            } else {
                System.out.println("Invalid character - Please enter the valid operator");
            }
        }
        input.close();
    }
}
