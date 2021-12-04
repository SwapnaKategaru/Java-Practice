package com.example;

import java.util.Scanner;

public class FunctionParameters {
    public static void main(String[] args) {
        int result = sum(3,5);
        System.out.println(result);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String greeting_input = input.next();
        
        String msg = greet(greeting_input);
        System.out.println(msg);

        input.close();
    }

    static int sum(int num1, int num2) {
        int add = num1 + num2;
        return add;
    }

    static String greet(String greeting) {            // specify parameter with type
        String message = "Hello " + greeting;
        return message;
    }
}