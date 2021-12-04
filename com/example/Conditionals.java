package com.example;

public class Conditionals {
    public static void main(String[] args){
        float temp = 68;
        String weather;
        if (temp == 35) {
            weather = "Normal temperature";
        } else if (temp <= 35) {
            weather = "Too cold";
        } else {
            weather = "Too hot";
        }
        System.out.println(weather);
    }
}


