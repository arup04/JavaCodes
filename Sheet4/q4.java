package Sheet4;
import java.util.HashSet;
import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter the string: ");
        String input = scanner.nextLine();

        // Check if the string is a perfect string
        boolean isPerfect = isPerfectString(input);

        // Output the result
        if (isPerfect) {
            System.out.println("The string is a perfect string.");
        } else {
            System.out.println("The string is NOT a perfect string.");
        }

        scanner.close();
    }

    // Method to check if a string is a perfect string
    public static boolean isPerfectString(String str) {
        // Use a HashSet to store unique characters
        HashSet<Character> charSet = new HashSet<>();

        for (char ch : str.toCharArray()) {
            // If the character already exists in the set, it's not a perfect string
            if (charSet.contains(ch)) {
                return false;
            }
            // Add the character to the set
            charSet.add(ch);
        }

        // If no duplicates are found, it's a perfect string
        return true;
    }
}

