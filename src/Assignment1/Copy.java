package Assignment1;

// Copy the numbers input until 0.0 is read

import java.util.*;  // for class Scanner

public class Copy {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.println("Ready to copy!\n" +
                "Enter 0.0 when done!");
        double num;
        num = stdin.nextDouble();
        // Your program will need to add 2 variables,
        // say n and total (of types int and double, respectively)
        // that keep a running count of the number of values
        // read and the total up to that point.
        // Initialize n and total
        int n = 0;
        double total = 0.0;
        total = total + num;

        while (num != 0.0) {
            System.out.printf("%.2f\n", num);
            num = stdin.nextDouble();
            // Both n and total start with zero initial values and
            // have to be updated after each number is read.
            // Increment n
            n++;
            // Add num to total
            total = total + num;

        }
        // Use the format items %d and %.2f to print integer (int) and
        // floating-point numbers (double) values, respectively.
        double average = total / n;
        System.out.printf("The count of numbers is %d\n", n);
        System.out.printf("The total numbers in the input is %.2f\n", total);
        System.out.printf("The average is %.2f\n", average);
        System.out.println("Goodbye!");
        System.exit(0);

    }
}
