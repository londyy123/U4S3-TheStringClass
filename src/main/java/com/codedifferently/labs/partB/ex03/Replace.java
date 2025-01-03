package com.codedifferently.labs.partB.ex03;

public class Replace {
    public static String sentence(){
        String response = "";
        String sentence = "Using String replace to replace character";
        /** Your code goes here*/
        //Utilizing the built in replace method, create a new String that holds an updated version of the sentence
        //with every lowercase r transformed into uppercase. Print out this new string.
        String replace = "Using String replace to replace character";
        String newString = sentence.replaceAll("r", "R");
        response += newString;

        return response;
    }
    public static void main(String[] args) {
        String sentenceOutput = sentence();
        System.out.println(sentenceOutput);
    }
}
