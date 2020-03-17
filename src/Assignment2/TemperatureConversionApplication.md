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

       

