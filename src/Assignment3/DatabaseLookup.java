package Assignment3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DatabaseLookup {
    public static void main(String[] args) throws FileNotFoundException {
        // Read data file
        // Read the number data in the Data3.txt file
        var file = new File("/Users/YanzhiWang/IdeaProjects/JavaProgrammingTutorial/src/Assignment3/Data3.txt");
        // Store number to arrayList
        Scanner scannerFile = new Scanner(file);
        var arrayList = new ArrayList<Integer>();
        while (scannerFile.hasNext()) {
            arrayList.add(scannerFile.nextInt());

        }

        // Read user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number to Lookup: ");
        while (scanner.hasNext()) {
            // Read user input
            int numberLookup = scanner.nextInt();

            // Check if the data is in array
            checkDataInArray(arrayList, numberLookup);

            System.out.println("Number to Lookup: ");

        }

    }

    static void checkDataInArray(ArrayList<Integer> array, int numberLookup) {
        for (int numberFile : array) {
            if (numberFile == numberLookup) {
                System.out.println(numberLookup + " is in the database");
                return;

            }
        }
        System.out.println(numberLookup + " is not in the database");

    }
}
