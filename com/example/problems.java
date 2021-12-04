package com.example;

// import java.util.Scanner;

public class problems {
    public static void main(String[] args){
        // biggest  number
        // Scanner in = new Scanner(System.in);
        // System.out.print("Enter 3 numbers: ");

        // int num1 = in.nextInt();
        // int num2 = in.nextInt();
        // int num3 = in.nextInt(); 
        
        // int max = num1;
        // if (num2 > max) {
        //     max = num2;
        // } 
        // if (num3 > max) {
        //     max = num3;
        // }
        // System.out.println("Maximum value is: " + max);

        // // check lowercase or uppercase letter
        // Scanner input = new Scanner(System.in);
        // System.out.print("Type a character: ");
        // char letter = input.next().charAt(0);
        
        // if (letter >= 'a' && letter <= 'z') {
        //     System.out.println("lowercase");
        // } else {
        //     System.out.println("uppercase");
        // }

        // in.close();
        // input.close();

        
        // // fibonacci series
        // int count = 1;
        // int i = 0;
        // int j = 1;
        // while (count <= 9) {
        //     int k = i;
        //     i = i + j;
        //     System.out.println(i);
        //     j = k;
        //     count++;
        // }
        // System.out.println("Fibonacci number is: " + i);


        // // similar number count
        // int number = 67534;
        // int counts = 0;
        // while(number > 0) {
        //     if (number % 10 == 6) {
        //         counts++;
        //     }
        //     number = number / 10;
        // }
        // System.out.println(counts);
    
    
        // reverse integer
        int num = 8790829;
        int reverse = 0;
        int mod = 0;
        while (num > 0) {
        //     mod = num % 10;
        //     reverse += mod;
        //     num = num / 10;
        //     reverse *= 10;
        // }
        // System.out.println(reverse/10);
            mod = num % 10;
            num = num / 10;
            reverse = reverse * 10 + mod;
        }
        System.out.println(reverse);
    }
}
