package Sheet9;

public class q4 {
    public static void main(String[] args) {
        double x = Math.toRadians(45); // Angle in radians (e.g., 45 degrees = π/4 radians)

        // Thread to calculate sin(x) using the series
        Thread sinThread = new Thread(() -> {
            double sinValue = calculateSinSeries(x, 10); // 10 terms in the series
            System.out.println("Calculated sin(x) using series: " + sinValue);
            System.out.println("sin(x) using Math.sin: " + Math.sin(x));
        });

        // Thread to calculate cos(x) using the series
        Thread cosThread = new Thread(() -> {
            double cosValue = calculateCosSeries(x, 10); // 10 terms in the series
            System.out.println("Calculated cos(x) using series: " + cosValue);
            System.out.println("cos(x) using Math.cos: " + Math.cos(x));
        });

        // Start both threads
        sinThread.start();
        cosThread.start();

        // Wait for threads to finish
        try {
            sinThread.join();
            cosThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Calculate sin(x) using the series expansion: sin(x) = x - x^3/3! + x^5/5! - x^7/7! + ...
    public static double calculateSinSeries(double x, int terms) {
        double sin = 0.0;
        for (int i = 0; i < terms; i++) {
            int power = 2 * i + 1; // Odd powers: 1, 3, 5, 7, ...
            double term = Math.pow(x, power) / factorial(power);
            sin += (i % 2 == 0 ? term : -term); // Alternate signs
        }
        return sin;
    }

    // Calculate cos(x) using the series expansion: cos(x) = 1 - x^2/2! + x^4/4! - x^6/6! + ...
    public static double calculateCosSeries(double x, int terms) {
        double cos = 0.0;
        for (int i = 0; i < terms; i++) {
            int power = 2 * i; // Even powers: 0, 2, 4, 6, ...
            double term = Math.pow(x, power) / factorial(power);
            cos += (i % 2 == 0 ? term : -term); // Alternate signs
        }
        return cos;
    }

    // Helper method to calculate factorial
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
