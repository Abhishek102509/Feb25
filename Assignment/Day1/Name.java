/*1. Print 'Hello' and Your Name
Write a Java program to print 'Hello' on the screen and then print your name on a separate line.
Expected Output :
Hello
Alex andra Abramov*/


class Name{
public static void main(String arg[]){
      System.out.println("Hello");
      System.out.println("Abhishek Yadav");

}
}
  



/*
2. Sum of Two Numbers
Write a Java program to p rint the sum of two numbers.Test Data : 74 + 36
Expected Output :
110*/


class Sum{
public static void main(String arg[]){
int a =74 ;
int b =36 ;

System.out.println(a+b);

}
}

/*
3. Divide Two Numbers
Write a Java program to divide two numbers and print the result on the screen.Test Data : 50 / 3
Expected Output :
16*/



class Divide{
public static void main(String arg[]){
int a = 50;
int b = 3;

System.out.println(a/b);


}
}



/*
4. Perform Arithmetic Operations
Write a Java program to print the result of the following operations.

Test Data:
a. -5  + 8 * 6
b. (55 + 9) % 9
c. 20 + - 3  * 5 / 8
d. 5 + 15 / 3 * 2 -  8 % 3

 Expected Output :
43
1
19
13

*/


class Arithmetic{
public static void main(String arg[]){
int a = -5  + 8 * 6;
int b = (55 + 9) % 9;
int c = 20 + - 3  * 5 / 8;
int d =5 + 15 / 3 * 2 -  8 % 3;



System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println(d);
}
}


/*
5. Multiply Two Numbers
Write a Java program that takes two numbers as input and displays the product of the two numbers.
Test Data :
Input first number: 25
Input second number: 5
Expected Output :25 x 5 = 125

*/

class Multiply{
   public static void main(String arg[]){
int a = 25;
int b = 5;
int c = 25*5;
System.out.println("25*5=" + c);

}
}


/*
6. Basic Arithmetic Operations
Write a Java program to print the sum, multiplication, subtraction, division, and remainder of two numbers.
Test Data :
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125  - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5

*/


class Operations{
public static void main(String arg[]){
int a = 125;
int b=24;
int c = a+b;
int d = a-c;
int e = a*b;
int f =a/b;
int g = a%b;
System.out.println("125 + 24 =" +c );
System.out.println("125  - 24 ="+d);
System.out.println("125 x 24 = "+e);
System.out.println("125 / 24 = "+f);
System.out.println("125 mod 24 = "+g);
}
}



/*
7. Multiplication Table
Write a Java program that takes a number as input and prints its multiplication table up to 10.
Test Data :
Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
8 x 4 = 32
8 x 5 = 40
8 x 6 = 48
8 x 7 = 56
8 x 8 = 64
8 x 9 = 72
8 x 10 = 80
*/




class Table{
public static void main(String arg[]){
int n = 8;
for(int i = 1; i<=10; i++){
System.out.println(n +"*"+ i + "="+ n*i);
}

}

}





/*
8. Swap Two Numbers
Write a Java program to swap the values of two variables without using a third variable.Test Data:
nput first  number: 10
Input second number: 20
Expected Output :
Before swapping:
First number: 10
Second number: 20

After swapping:
First number: 20
Second number: 10

*/


class Swap{
public static void main(String arg[]){
int a = 10;
int b = 20;
System.out.println("Before Swapping:");
System.out.println("First Number:" +a);
System.out.println("Second Number:"+b);

a=a+b;
b=a-b;
a=a-b;
System.out.println("after Swapping:");
System.out.println("First Number:"+a);
System.out.println("Second Number:"+b);
}
}


/*
9. Calculate the Area of a Circle
Write a Java program that calculates the area of a circle.
Test Data :
Input the radius: 7
Formula : Area = π * radius²Expected Output :
Area of the circle: 153.93804

*/



class Area{
public static void main(String arg[]){
int r = 7;
double pi = 3.142;
double area = pi * r*r;

System.out.println(area);
}
}



/*
10. Check If a Number Is Even or Odd
Write  a Java program that checks if a number is even or odd.
Test Data :
input a number: 15
Expected Output :
The number 15 is Odd.

*/



class Evenodd{
   public static void main(String arg[]){
      int num = 15;

   if(num %2 == 0){
System.out.println("The Number 15 is Even");
}
else{
System.out.println("The Number 15 is Odd");
}
}
}





/*
11. Find the Largest of Three Numbers
Write a Java program that takes three numbers as input and finds the largest of the three.Test Data :
nput first number: 12
Input second number: 45
Input third number: 22
Expected Output :
The largest number is 45.

*/




class LargestNum{
   public static void main(String arg[]){
  int a = 12; 
int b = 45;
int c = 22;
if(a > b & a > c){
System.out.println("The Largest Number is :" +a);
}
if(b > c & b > a){
System.out.println("The Largest  Number is:" +b);
}
if (c>a & c>b){
System.out.println("The Largest Number is :" +c);

}
}
} 





/*
12. Reverse a Number
Write a Java program that takes a number as input and prints the reverse of that number.Test Data :
Input number: 12345
Expected Output :
The reverse of 12345 is 54321.   
*/





/*
13. Calculate the Average of Three Numbers
Write a Java program to calculate the average of thr ee numbers.
Test Data :
Input first number: 20
Input second number: 40 Input third number: 60
Expected Output :
The average is: 40.0
*/




/*
14. Print the Fibonacci Series
Write a Java program to print the Fibonacci series up to the 10th number.Expected Output :
0 1 1 2 3 5 8 13 21 34

*/




/*
15. Find the Factorial of a Number
Write a Java program to find t he factorial of a number.
Test Data :
Input a number: 5
Expected Output :
Factorial of 5 is 120.
*/





/*
16. Check Whether a Number Is Prime
Write a Java program to check whether a number i s prime or not.Test Data :
Input number: 17
Expected Output :
The number 17 is Prime.
*/





/*
17. Print the First N Natural Numbers
Write a Java program to print the first N natural numbers, where N is provided by the user.
Test Data :
Input a number: 6
Expected Output :1 2 3 4 5 6
18. Convert Celsius to Fahrenheit
Write a Java program to convert a temperature from Celsius to Fahrenheit.Test Data :
Input temperature in Celsius: 25
Formu la : Fahrenheit = (Celsius * 9/5) + 32 Expected Output :
25°C is equal to 77.0°F

*/




/*
19. Calculate the Power of a Number
Write a Java program that calculates the power of a number. Take two numbers as input: the base and the exponent, and compute the result of base raised to the power of exponent.
Test Data :
Input base number: 3
Input exponent number: 4
Expected Output :
3 raised to the power 4 is 81
*/




/*
20. Count the Number of Digits in a Number
Write a Java program that counts the number of digits in a given n umber.
Test Data :
Input number: 123456
Expected Output :
The number 123456 has 6 digits
*/



