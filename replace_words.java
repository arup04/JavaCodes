package com.gsv.project;
import java.io.*;
import java.nio.file.*;
public class replace_words {
    public static void main(String[] args) {
        String fileName = "sdj.txt";
        String oldWord = "his";
        String newWord = "her";

        try {
            // Read the content of the file
            String content = new String(Files.readAllBytes(Paths.get(fileName)));

            // Replace all occurrences of "his" with "her"
            String modifiedContent = content.replaceAll("\\bhis\\b", newWord);

            // Write the modified content to the file
            Files.write(Paths.get(fileName), modifiedContent.getBytes());

            System.out.println("All occurrences of '" + oldWord + "' have been replaced with '" + newWord + "'.");
        } catch (IOException e) {
            System.err.println("Error processing the file: " + e.getMessage());
        }
    }
}
