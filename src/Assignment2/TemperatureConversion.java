package Assignment2;

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        // Ask user to select the Temperature Converter
        System.out.println("Welcome to the Temperature Converter!");
        System.out.println("Enter 0 to convert F --> C and 1 to convert from C --> F");
        System.out.println("Enter Control-Z when done!");
        Scanner scanner = new Scanner(System.in);
        int selection = scanner.nextInt();
        // Enter 0 to convert F --> C
        if (selection == 0) {
            System.out.println("Welcome to the F --> C Converter!");
            while (scanner.hasNext()) {
                // Read user input
                double f = scanner.nextDouble();
                // Temperature conversion
                double c = FToC(f);
                // Print temperature
                System.out.printf("%.02fF = %.02fC", f, c);

            }
        }
        // Enter 1 or greater number to convert from C --> F
        else {
            System.out.println("Welcome to the C --> F Converter!");
            while (scanner.hasNext()) {
                // Read user input
                double c = scanner.nextDouble();
                // Temperature conversion
                double f = CTOF(c);
                // Print temperature
                System.out.printf("%.02fC = %.02fF", c, f);

            }
        }
    }

    static double FToC(double f) {
        double c = ((f - 32.0) * 5.0) / 9.0;
        return c;

    }

    static double CTOF(double c) {
        double f = ((c * 9.0) / 5.0) + 32.0;
        return f;

    }
}
