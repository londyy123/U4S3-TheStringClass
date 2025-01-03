package com.codedifferently.labs.partB.ex02;

public class Concatenate {
    public static String concatenateStrings() {
            String response = "";
        /* Your code goes here*/
        //Create two different variables that hold text - a first name and a last name
        //Create a third variable that combines both of the variables
        //Print out the variable that contains the concatenation

        String myString = "Abe";
        myString = myString + " Lincoln";
        response += myString;
        return response;
    }

    public static void main(String[] args) {
        String stringOutput = concatenateStrings();
        System.out.println(stringOutput);

    }
}
