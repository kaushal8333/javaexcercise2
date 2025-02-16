package com.ig.ui;

import java.util.Scanner;

public class Program5 {
    public static String getLastLetter(String sentence) {
        String[] words = sentence.split(" ");       
        StringBuilder result = new StringBuilder();     
        for (String word : words) {
            if (word.length() > 0) {
                char lastChar = word.charAt(word.length() - 1);
                result.append(Character.toUpperCase(lastChar));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();
        String result = getLastLetter(sentence);
        System.out.println("Result: ");
        System.out.println(result);
    }
}

