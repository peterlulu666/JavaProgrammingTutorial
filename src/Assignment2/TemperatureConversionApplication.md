# Temperature Conversion Application

## What is to be done

Write a Java application (i.e., program with a main method) that converts temperatures -- from Fahrenheit (F) to Centigrade (C) and vice versa

## What are the formulas for temperature conversion        

Let tC be temperature in Centigrade and tF be temperature in Fahrenheit. Then

tC = ( (tF-32.0) × 5.0) ÷ 9.0        

or       

tF = ( (tC × 9.0) ÷ 5.0) + 32.0        

## What are the inputs that will be given to the program        

The program accepts as inputs a conversion indicator followed by the temperatures to be converted        

1. The first number will be a 0 (indicating F -> C conversion) or a 1 or any non-zero value (indicating C -> F conversion)
2. a list of temperatures to be converted, one at a time, terminated by Ctrl-Z (Ctrl-D)

## How about some inputs to use?      

You should test your program with several different inputs. But you should submit your assignment using the inputs shown below.

1.Here are inputs asking for F -> C conversion

```
0 
212.0 
32.0 
45.0 
99.0 
-459.67
```
End input by typing Ctrl-Z (or Ctrl-D).

2.Here are inputs asking for C -> F conversion

```
1 
100.0 
0.0 
7.22 
37.22 
-273.17
```

End input by typing Ctrl-Z (or Ctrl-D).

## What will the output of the program look like        

For the F -> C conversion, here is some sample output produced by running the program in jGRASP:

```
Welcome to the Temperature Converter! 
Enter 0 to convert F --> C and 1 to convert from C --> F. 
Enter Control-Z when done! 
0 
Welcome to the F --> C Converter! 
212.0 
212.00F = 100.00C 
32.0 
32.00F = 0.00C 
45.0 
45.00F = 7.22C 
99.0 
99.00F = 37.22C 
-459.67 
-459.67F = -273.15C 
<eof> 
Goodbye!
```

The output for the C -> F conversion the output will have a similar format.      

## How about some hints on writing this program      


1.See how input is read and printed in Assignment 1. You will need to use this.
2.You should comment the program appropriately
3.Your program will have code of the form shown in assignment 1 (import statement,
class definition – give it an appropriate name, and the main method). The body of the main method will be something like the following (but written in Java)

Set up the input stream we called stdin (Scanner class) Read the conversion direction input into the integer variable F2C

```
if (F2C == 0) {
    Read inputs and do the FC conversions 
} else {
    Read inputs and do the CF conversions 
}
Print goodbye
```        
4.The "Read inputs ... “ can be written as

```
while(stdin.hasNext()) {
    Read the next input value
    Do the conversion
    Print the original and converted values
}
```        

## Grading       

The program will be graded as follow for a total of 75 points:
- Appropriate comments: 10 points
- Appropriate indentation: 10 points
- Prints the F -> C conversions correctly (using the input shown): 25 points
- Prints the C -> F conversions correctly (using the input shown): 25 points
- Nice output: 5 points        

## Note about jGrasp on Linux      

Ctrl-Z (Ctrl-D) do not signal end of input. Instead, to signal end of input, hit the Enter key first. Then right click on the Run I/O panel. You will see an option Send EOT. Select this option and hit Enter.      

        

       

