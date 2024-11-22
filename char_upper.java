package com.gsv.project;
import java.util.Scanner;
public class char_upper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a line of text:");
        String input = sc.nextLine();

        // Split into words
        String[] words = input.split("\\s+");

        // Capitalize the first letter of each word
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                // Capitalize the first character and add the rest of the word
                String capitalize = word.substring(0, 1).toUpperCase() + word.substring(1);
                result.append(capitalize).append(" ");
            }
        }
        
        System.out.println("Resulting string:");
        System.out.println(result.toString().trim());

        sc.close();
    }
}

