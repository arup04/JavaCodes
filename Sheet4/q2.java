import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the password
        System.out.print("Enter the password: ");
        String password = scanner.nextLine();

        // Validate the password
        if (isPasswordValid(password)) {
            System.out.println("The password is valid.");
        } else {
            System.out.println("The password is invalid.");
        }

        scanner.close();
    }

    // Method to validate the password
    public static boolean isPasswordValid(String password) {
        // Check length
        if (password.length() < 5 || password.length() > 12) {
            return false;
        }

        // Check for at least one lowercase letter and one digit
        boolean hasLowerCase = false, hasDigit = false;
        for (char ch : password.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
            }
            if (Character.isDigit(ch)) {
                hasDigit = true;
            }
            // Check for invalid characters (uppercase and special characters)
            if (Character.isUpperCase(ch) || !Character.isLetterOrDigit(ch)) {
                return false;
            }
        }

        if (!hasLowerCase || !hasDigit) {
            return false;
        }

        // Check for immediate repeating patterns
        for (int i = 0; i < password.length() - 1; i++) {
            for (int j = i + 1; j < password.length(); j++) {
                String pattern = password.substring(i, j);
                int nextIndex = j + pattern.length();
                if (nextIndex <= password.length() && password.substring(j, nextIndex).equals(pattern)) {
                    return false;
                }
            }
        }

        // If all checks pass, the password is valid
        return true;
    }
}
