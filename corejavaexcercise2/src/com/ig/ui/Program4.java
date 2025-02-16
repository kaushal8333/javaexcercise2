package com.ig.ui;

import java.util.Scanner;

public class Program4 {
    public static String reshape(String str, char separator) {
        StringBuilder reversedString = new StringBuilder(str);
        reversedString.reverse();
        StringBuilder finalString = new StringBuilder();
        for (int i = 0; i < reversedString.length(); i++) {
            finalString.append(reversedString.charAt(i));  
            if (i != reversedString.length() - 1) {
                finalString.append(separator); 
            }
        }
        return finalString.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();
        System.out.println("Enter a separator character: ");
        char separator = scanner.next().charAt(0);
        String reshapedString = reshape(inputString, separator);
        System.out.println("Reshaped String: ");
        System.out.println(reshapedString);
    }
}
