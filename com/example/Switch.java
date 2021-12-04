package com.example;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // find animal survival - switch cases
        System.out.print("Enter a creature : ");
        String creature = input.next();

        switch (creature) {
            case "Fish":
                System.out.println("Survives in water");
                break;
            case "Human":
                System.out.println("Survives on Land");
                break;
            case "Turtle":
                System.out.println("Survives on land and water");
                break;
            default:
                System.out.println("Please enter valid creature !");
        }


        // new short format of switch - identify months
        System.out.print("Enter month number : ");
        int month = input.nextInt();

        switch (month) {
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
        }

        // new short format of switch - identify seasons
        System.out.print("Enter a month : ");
        String month2 = input.next();

        switch(month2) {
            case "feb", "mar", "apr", "may", "june" -> System.out.println("Summer");
            case "july", "aug", "sep" -> System.out.println("Autumn beauty");
            case "oct", "nov", "dec", "jan" -> System.out.println("Winter chills");
        }


        // Nested switch - id and department
        System.out.print("Enter id and department : ");

        int id = input.nextInt();
        String expertise = input.next();
        switch (id) {
            case 1:
                System.out.println("CEO");
                break;
            case 2:
                System.out.println("Manager");
                switch (expertise) {
                    case "Sales":
                    System.out.println("Sales Manager");
                    break;
                    case "Operations": 
                    System.out.println("Operations Manager");
                    break;
                }
                break;
            case 3:
                System.out.println("Employee");
                break;
            default:
                System.out.println("Invalid - Enter valid id");
        }
        input.close();
    }
}