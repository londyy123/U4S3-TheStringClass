package com.codedifferently.labs.partB.ex01;

public class Indexing {
    public static String index() {
        String response = "";
        String myStr = "Hello planet earth, you are a great planet.";
        /* Your code goes here*/
            int idx1 = myStr.indexOf('e');
            response += "index of first e: " + idx1 + "\n";
            int idx2 = myStr.indexOf('e', idx1 + 1);
            response += "index of second e: " + idx2;

            return response;
    }

    public static void main(String[] args) {
        String indexOutput = index();
        System.out.println(indexOutput);
    }
}


