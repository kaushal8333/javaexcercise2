package com.ig.ui;

import java.util.Scanner;

public class Program6 {

    public static int calculateWordSum(String sentence) {
        String[] words = sentence.split(" ");
        String firstWord = words[0];
        String lastWord = words[words.length - 1];
        
        if (firstWord.equals(lastWord)) {
            return firstWord.length();
        } else {
            return firstWord.length() + lastWord.length();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();
        int result = calculateWordSum(sentence);
        System.out.println(result);
    }
}
