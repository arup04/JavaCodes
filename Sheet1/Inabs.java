package Sheet1;

import java.util.Scanner;
interface MathOperations {
    int sum();
    double average();
    int product();
    int largest();
    int smallest();
}


abstract class NumberOperations {
    protected int num1, num2, num3;

    // Method to take input from the user
    public void inputNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        num3 = scanner.nextInt();
    }


    public abstract void displayResults();
}
class Calculator extends NumberOperations implements MathOperations {


    public int sum() {
        return num1 + num2 + num3;
    }

    @Override
    public double average() {
        return sum() / 3.0;
    }

    public int product() {
        return num1 * num2 * num3;
    }


    public int largest() {
        return Math.max(num1, Math.max(num2, num3));
    }


    public int smallest() {
        return Math.min(num1, Math.min(num2, num3));
    }


    public void displayResults() {
        System.out.println("Sum: " + sum());
        System.out.println("Average: " + average());
        System.out.println("Product: " + product());
        System.out.println("Largest: " + largest());
        System.out.println("Smallest: " + smallest());
    }
}
public class Inabs {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Input numbers from the user
        calculator.inputNumbers();

        // Display results
        System.out.println("\nResults:");
        calculator.displayResults();
    }
}

