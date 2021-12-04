package com.oop;

import java.util.Arrays;

public class NewClass {
    public static void main(String[] args) {
        int[] id = new int[3];
        String[] name = new String[3];
        float[] percentage = new float[3];

        // Details[] students = new Details[3];       
        // Details tom;
        // System.out.println(Arrays.toString(students));    

        Details adam = new Details();
        System.out.println(adam);
        System.out.println(adam.id);
        System.out.println(adam.name); 
        System.out.println(adam.percentage);

        adam.id = 1;
        adam.name = "Adam Wilson";
        adam.percentage = 96.5f;

        System.out.println(adam.id + " " + adam.name + " " + adam.percentage);
    }
}


    // class - used to create and store own datatypes
class Details {
    int id;
    String name;
    float percentage;
    
    Details () {
        this.id = 3;
        this.name = "Nobita";
        this.percentage = 55.3f;
    }
}
