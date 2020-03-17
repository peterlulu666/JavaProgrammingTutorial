# Assignment 1
```java
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
```

## Part one

Explain how the above program operates by briefly explaining each of the 17 lines – number the explanations.

1. Comment that describe what will the program do
2. import statement that import Scanner class and comment
3. class header
4. method header
5. declare Scanner object
6. print "Ready to copy!" to the console and insert a newline in the text
7. print "Enter 0.0 when done!" to the console
8. declare double type variable num
9. read user input and assign user input to variable num
10. while statement and the while statement will end if num is equal to 0.0
11. print num
12. read user input and assign user input to variable num
13. end while statement
14. print "Goodbye!" to the console
15. end program
16. end main method
17. end the Copy class

## Part two

Compile and run the above program with the list of numbers shown below and submit the program and its output.

**Notes/Hints:**

You will need to store the above program in a file named Copy.java before you can compile it and run it.

**Use the following Input data**

- 2.0
- 3.0
- 11.0
- -4.0
- 6.0
- 8.0
- 0.0

```
Ready to copy!
Enter 0.0 when done!
2.0
2.00
3.0
3.00
11.0
11.00
-4.0
-4.00
6.0
6.00
8.0
8.00
0.0
Goodbye!
```

## Part three

Modify the above program to also print
a. Count of numbers input (15 points for correctly modifying the program)
b. The total numbers in the input (15 points for correctly modifying the program) c. The average value of the numbers in the input (15 points for correctly modifying the program

**Notes/Hints:**
- Your program will need to add 2 variables, say n and total (of types int and double, respectively) that keep a running count of the number of values read and the total up to that point.
- Use the format items %d and %.2f to print integer (int) and floating-point numbers (double) values, respectively.
- Both n and total start with zero initial values and have to be updated after each number is read.
- The average can computed using the final values of n and total



