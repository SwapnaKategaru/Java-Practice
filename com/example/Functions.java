package com.example;

import java.util.Scanner;

public class Functions {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String msg = message();          // function1 call
        System.out.println(msg);

        message();                  // calling this function does not display message as it just returns value.

        message2();                      // function2 call  
        
        int value = sum();               // calling sum function(type int) and store in variable of same type int
        System.out.println(value);

        input.close();
    }

    // function using return type (String)
    static String message() {  
        return "Function with return type - String";
    }  

    // function without return type (void)
    static void message2() {
        System.out.println("Void function - without return type");    // Void methods cannot return a value, use print statement
    }


    // sum function
    static int sum() {                    
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int sum = num1 + num2;

        input.close();
        return sum;
    }
}
