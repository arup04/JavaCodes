package Sheet4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter the string: ");
        String input = scanner.nextLine();

        // Input the threshold value n
        System.out.print("Enter the threshold value (n): ");
        int n = scanner.nextInt();

        // Create a map to store character frequencies
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Count the frequency of each character
        for (char ch : input.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Print characters that exceed the threshold n
        System.out.println("Characters exceeding the threshold:");
        boolean found = false;
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > n) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No characters exceed the given threshold.");
        }

        scanner.close();
    }
}

