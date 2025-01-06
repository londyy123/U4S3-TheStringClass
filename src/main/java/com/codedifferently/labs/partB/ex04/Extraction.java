package com.codedifferently.labs.partB.ex04;

public class Extraction {

    public static String extraction(){
        String response = "";
        String greeting = "Learning Java is a good time!";

        /* Your code goes here*/
        //Utilizing the built-in substring method on the predefined String, print out the results to satisfy the example below
        //String subString = greeting.substring(0,5);
        System.out.println(greeting.substring(0, 5));
        System.out.println(greeting.substring(7, 10));
        System.out.println(greeting.substring(7));
        return response;

    }
    public static void main(String[] args) {
        String extractionOutput = extraction();
        System.out.println(extractionOutput);
    }
}
