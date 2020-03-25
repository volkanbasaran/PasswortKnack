package de.knack;

import java.util.ArrayList;

public class Knack {

    public static void main(String[] args) {
        String alpahabet = "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz".toUpperCase() + "0123456789";
        char[] alphabetAsCharArray = alpahabet.toCharArray();

        String theWord = "Jackson";

        char[] theWordAsArray = theWord.toCharArray();

        ArrayList<Character> result = new ArrayList<>();
        String cracked = "";

        for (int i = 0; i < theWordAsArray.length; i++) {
            for (int j = 0; j < alphabetAsCharArray.length; j++) {
                if (alphabetAsCharArray[j] == theWordAsArray[i]) {
                    result.add(theWordAsArray[i]);
                }
            }
        }

        cracked = result.toString();       // Output: [H, a, l, l, o, W, e, l, t]

        System.out.println("The Password is: " + cracked);

    }
}
