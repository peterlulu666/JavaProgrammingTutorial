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
        while (num != 0.0) {
            System.out.printf("%.2f\n", num);
            num = stdin.nextDouble();

        }
        System.out.println("Goodbye!");
        System.exit(0);

    }
}
