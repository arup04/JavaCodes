package com.gsv.project;
import java.util.Scanner;

public class vowel_extract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a line of text:");
        String input = sc.nextLine();

        String lowerCase = input.toLowerCase();
        String vowels = "aeiou";

        System.out.println("Vowels and their positions in the text:");
        
        // Loop to find vowels
        for (int i = 0; i < lowerCase.length(); i++) {
            char ch = lowerCase.charAt(i);
            if (vowels.indexOf(ch) != -1) { // Check if the character is a vowel
                System.out.println("Vowel: " + ch + ", Position: " + i);
            }
        }

        sc.close();
    }
}

