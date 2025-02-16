package com.ig.ui;

import java.util.Scanner;

public class Program7 {
    public static String convertFormat(String input) {
        String rawDigits = input.replace("-", "");
        
        if (rawDigits.length() != 10) {
            throw new IllegalArgumentException("The input must be a 10-digit number in the format XXX-XXX-XXXX.");
        }
        String formattedString = rawDigits.substring(0, 2) + "-" + 
                                 rawDigits.substring(2, 4) + "-" + 
                                 rawDigits.substring(4, 7) + "-" + 
                                 rawDigits.substring(7);

        return formattedString;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the phone number (XXX-XXX-XXXX): ");
        String input = scanner.nextLine();
        try {
            String result = convertFormat(input);
            System.out.println("Converted format: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
