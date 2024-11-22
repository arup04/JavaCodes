package com.gsv.project;
import java.util.Scanner;

public class Find_Extract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a line of text:");
        String input = scanner.nextLine();

        int firstIndex = input.indexOf("the");
        int lastIndex = input.lastIndexOf("the");

        if (firstIndex == -1 || lastIndex == -1 || firstIndex == lastIndex) {
            System.out.println("The string 'the' does not occur twice in the text.");
        } else {
            // Extract characters enclosed between the two occurrences
            String enclosedText = input.substring(firstIndex + 3, lastIndex);
            System.out.println("Characters enclosed between the first and last occurrence of 'the':");
            System.out.println(enclosedText);
        }

        scanner.close();
    }
}

