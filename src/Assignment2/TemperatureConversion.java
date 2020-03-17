package Assignment2;

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        System.out.println("Welcome to the Temperature Converter!");
        System.out.println("Enter 0 to convert F --> C and 1 to convert from C --> F");
        System.out.println("Enter Control-Z when done!");
        Scanner scanner = new Scanner(System.in);
        int selection = scanner.nextInt();
        if (selection == 0) {
            System.out.println("Welcome to the F --> C Converter!");
            while (scanner.hasNext()) {
                double f = scanner.nextDouble();
                double c = FToC(f);
                System.out.printf("%.02fF = %.02fC", f, c);

            }
        } else {
            System.out.println("Welcome to the C --> F Converter!");
            while (scanner.hasNext()) {
                double c = scanner.nextDouble();
                double f = CTOF(c);
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
