package com.ig.ui;


import java.util.Scanner;

public class Program1 {

    public static String getCapitalized(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase());
            result.append(" "); 
        }

        return result.toString(); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String capitalizedSentence = getCapitalized(sentence);

        System.out.println("Capitalized Sentence: ");
        System.out.println(capitalizedSentence);
    }
}

