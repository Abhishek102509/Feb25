   import java.util.Scanner;
/*
Snippet 1: 
public class InfiniteForLoop { 
 public static void main(String[] args) { 
 for (int i = 0; i < 10; i--) { 
 System.out.println(i); 
 } 
 } 
} 
// Error to investigate: Why does this loop run infinitely? How should the loop control variable be adjusted?

Ans .. 
loop run infinitely because i = 0 and i is less then 10 and the i is allway decrement and i is always 0 thin the loop is go to infinit
Solution 
cundation i-- replace the i++

*/
class InfiniteForLoop { 
 public static void main(String[] args) { 
 for (int i = 0; i < 10; i++) { 
 System.out.println(i); 
 } 
 } 
}



/*
Snippet 2: 
public class IncorrectWhileCondition { 
 public static void main(String[] args) { 
 int count = 5; 
 while (count = 0) { 
 System.out.println(count); 
 count--; 
 } 
 } 
} 
// Error to investigate: Why does the loop not execute as expected? What is the issue with the condition in the 
`while` loop
Ans In While loop condation is not right
*/

class IncorrectWhileCondition { 
 public static void main(String[] args) { 
 int count = 5; 
 while (count >= 0) { 
 System.out.println(count); 
 count--; 
 } 
 } 
} 


/*
Snippet 3: 
public class DoWhileIncorrectCondition { 
 public static void main(String[] args) { 
 int num = 0; 
 do { 
 System.out.println(num); 
 num++; 
 } while (num > 0); 
 } 
} 
// Error to investigate: Why does the loop only execute once? What is wrong with the loop condition in the `dowhile` loop
Ans code is go to infinty in while loop the conditiond is > 0 ther is always Garger 0 the the loop go to infinity
*/

class DoWhileIncorrectCondition { 
 public static void main(String[] args) { 
 int num = 0; 
 do { 
 System.out.println(num);
num++;  
 } while (num < 10); 
   
 } 
}
//======================================================================

/*
Snippet 4: 
public class OffByOneErrorForLoop { 
 public static void main(String[] args) { 
 for (int i = 1; i <= 10; i++) { 
 System.out.println(i); 
 } 
 // Expected: 10 iterations with numbers 1 to 10 
 // Actual: Prints numbers 1 to 10, but the task expected only 1 to 9 
 } 
} 
// Error to investigate: What is the issue with the loop boundaries? How should the loop be adjusted to meet the 
expected output?

Ans ...
condition is <= 10 Then it will print 10 also if chang the condation i<10 then it will print 1 to 9 

*/

class OffByOneErrorForLoop { 
 public static void main(String[] args) { 
 for (int i = 1; i < 10; i++) { 
 System.out.println(i); 
 } 
 
 } 
}

//=======================================================

/*
Snippet 5: 
public class WrongInitializationForLoop { 
 public static void main(String[] args) { 
 for (int i = 10; i >= 0; i++) { 
 System.out.println(i); 
 } 
 } 
} 
// Error to investigate: Why does this loop not print numbers in the expected order? What is the problem with the 
initialization and update statements in the `for` loop?

Ans because it print infinity. update i++ in i--
*/

class WrongInitializationForLoop { 
 public static void main(String[] args) { 
 for (int i = 10; i >= 0; i--) { 
 System.out.println(i); 
 } 
 } 
}

//============================================================


/*
Snippet 6: 
public class MisplacedForLoopBody { 
 public static void main(String[] args) { 
 for (int i = 0; i < 5; i++) 
 System.out.println(i); 
 System.out.println("Done"); 
 } 
} 
// Error to investigate: Why does "Done" print only once, outside the loop? How should the loop body be enclosed to 
include all statements within the loop?

System.out.println("Done"); statement is outside the for loop because it is not enclosed within the  braces {}
*/

 class MisplacedForLoopBody { 
 public static void main(String[] args) { 
 for (int i = 0; i < 5; i++) {
 System.out.println(i); 
 System.out.println("Done"); 
 } 
}
}
//==========================================================


/*

Snippet 7: 
public class UninitializedWhileLoop { 
 public static void main(String[] args) { 
 int count; 
 while (count < 10) { 
 System.out.println(count); 
 count++; 
 } 
 } 
} 
// Error to investigate: Why does this code produce a compilation error? What needs to be done to initialize the loop 
variable properly

 variable count might not have been initialized

*/

class UninitializedWhileLoop { 
 public static void main(String[] args) { 
 int count = 0 ; 
 while (count < 10) { 
 System.out.println(count); 
 count++; 
 } 
 } 
}

//=============================================================


/*
Snippet 8: 
public class OffByOneDoWhileLoop { 
 public static void main(String[] args) { 
 int num = 1; 
 do { 
 System.out.println(num); 
 num--; 
 } while (num > 0); 
 } 
} 
// Error to investigate: Why does this loop print unexpected numbers? What adjustments are needed to print the 
numbers from 1 to 5?

ans.... 
 in while loop cundation is (num > 0)num is graterthen 0 then it will exit the out Side of The loop And print unexpected number 1

*/

class OffByOneDoWhileLoop { 
 public static void main(String[] args) { 
 int num = 1; 
 do { 
 System.out.println(num); 
num++; 
 } while (num <= 5); 

 } 
}

//==========================================================


/*
Snippet 9: 
public class InfiniteForLoopUpdate { 
 public static void main(String[] args) { 
 for (int i = 0; i < 5; i += 2) { 
 System.out.println(i); 
 } 
 } 
} 
// Error to investigate: Why does the loop print unexpected results or run infinitely? How should the loop update 
expression be corrected?

Ans ..
Loop is not print infinitely it will print only 0 2 4
After 3 iteratin i is grater the 5 then it will exit the loop 
*/
 class InfiniteForLoopUpdate { 
 public static void main(String[] args) { 
 for (int i = 0; i < 5; i++) { 
 System.out.println(i); 
 } 
 } 
}
//===============================


/*
Snippet 10: 
public class IncorrectWhileLoopControl { 
 public static void main(String[] args) { 
 int num = 10; 
 while (num = 10) { 
 System.out.println(num); 
 num--; 
 } 
 } 
} 
// Error to investigate: Why does the loop execute indefinitely? What is wrong with the loop condition?

Ans ....
IIn Java the single equals sign = is used for assignment not comparison

*/

class IncorrectWhileLoopControl { 
 public static void main(String[] args) { 
 int num = 10; 
 while (num > 0) { 
 System.out.println(num); 
 num--; 
 } 
 } 
} 

//================================================


/*
Snippet 11: 
public class IncorrectLoopUpdate { 
 public static void main(String[] args) { 
 int i = 0; 
 while (i < 5) { 
 System.out.println(i); 
 i += 2; // Error: This may cause unexpected results in output 
 } 
 } 
} 
// Error to investigate: What will be the output of this loop? How should the loop variable be updated to achieve the 
desired result?
Out put 
0 2 4 

Update the increment condation to achive A desired Result


*/

 class IncorrectLoopUpdate { 
 public static void main(String[] args) { 
 int i = 0; 
 while (i < 5) { 
 System.out.println(i); 
 i += 1; // Error: This may cause unexpected results in output 
 } 
 } 
}

//===================================================


/*Snippet 12: 
public class LoopVariableScope { 
 public static void main(String[] args) { 
 for (int i = 0; i < 5; i++) { 
 int x = i * 2; 
 } 
 System.out.println(x); // Error: 'x' is not accessible here 
 } 
} 
// Error to investigate: Why does the variable 'x' cause a compilation error? How does scope*/

class LoopVariableScope { 
 public static void main(String[] args) { 
 for (int i = 0; i < 5; i++) { 
 int x = i * 2; 
System.out.println(x);
 } 
  // Error: 'x' is not accessible here  Because it is a out side of the For loop 
 } 
} 



//=================================================

//===================================================================================
/*
SECTION 2: Guess the Output 
Instructions: 
1. Perform a Dry Run: Carefully trace the execution of each code snippet manually to determine 
the output. 
2. Write Down Your Observations: Document each step of your dry run, including the values of 
variables at each stage of execution. 
3. Guess the Output: Based on your dry run, provide the expected output of the code. 
4. Submit Your Assignment: Provide your dry run steps along with the guessed output for each 
code snippet
*/
//============================================================================
/*

Snippet 1: 
public class NestedLoopOutput { 
 public static void main(String[] args) { 
 for (int i = 1; i <= 3; i++) { 
 for (int j = 1; j <= 2; j++) { 
 System.out.print(i + " " + j + " "); 
 } 
 System.out.println(); 
 } 
 } 
} 
// Guess the output of this nested loop.
1 1 1 2
2 1 2 2
3 1 3 2


*/


//=============================
/*
Snippet 2: 
public class DecrementingLoop { 
 public static void main(String[] args) { 
 int total = 0; 
 for (int i = 5; i > 0; i--) { 
 total += i; 
 if (i == 3) continue; 
 total -= 1; 
 } 
 System.out.println(total); 
 } 
} 
// Guess the output of this loop
11
 

*/


//=======================================
/*
Snippet 3: 
public class WhileLoopBreak { 
 public static void main(String[] args) { 
 int count = 0; 
 while (count < 5) { 
 System.out.print(count + " "); 
 count++; 
 if (count == 3) break; 
 } 
 System.out.println(count); 
 } 
} 
// Guess the output of this while loop.

0 1 2 3

*/


//=================================
/*
Snippet 4: 
public class DoWhileLoop { 
 public static void main(String[] args) { 
 int i = 1; 
 do { 
 System.out.print(i + " "); 
 i++; 
 } while (i < 5); 
 System.out.println(i); 
 } 
} 
// Guess the output of this do-while loop
1 2 3 4 5

*/


//===================================
/*
Snippet 5: 
public class ConditionalLoopOutput { 
 public static void main(String[] args) { 
 int num = 1; 
 for (int i = 1; i <= 4; i++) { 
 if (i % 2 == 0) { 
 num += i; 
 } else { 
 num -= i; 
 } 
 } 
 System.out.println(num); 
 } 
} 
// Guess the output of this loop.
3
*/



//===============================
/*
Snippet 6: 
public class IncrementDecrement { 
 public static void main(String[] args) { 
 int x = 5; 
 int y = ++x - x-- + --x + x++; 
 System.out.println(y); 
 } 
} 
// Guess the output of this code snipp
8
*/
//======================
/*
Snippet 7: 
public class NestedIncrement { 
 public static void main(String[] args) { 
 int a = 10; 
 int b = 5; 
 int result = ++a * b-- - --a + b++; 
 System.out.println(result); 
 } 
} 
// Guess the output of this code snippet.

49
*/
class NestedIncrement { 
 public static void main(String[] args) { 
 int a = 10; 
 int b = 5; 
 int result = ++a * b-- - --a + b++; 
 System.out.println(result); 
 } 
}
//=====================
/*
Snippet 8: 
public class LoopIncrement { 
 public static void main(String[] args) { 
 int count = 0; 
 for (int i = 0; i < 4; i++) { 
 count += i++ - ++i; 
 } 
 System.out.println(count); 
 } 
} 
// Guess the output of this code snippet.
-4
*/



//==================================================
/*
SECTION 3: Lamborghini Exercise: 
Instructions: 
//===================================================
1. Complete Each Program: Write a Java program for each of the tasks listed below. 
2. Test Your Code: Make sure your code runs correctly and produces the expected output. 
3. Submit Your Solutions: Provide the complete code for each task along with sample output. 
Tasks: 
//====================================================


1. Write a program to calculate the sum of the first 50 natural numbers. 
2. Write a program to compute the factorial of the number 10. 
3. Write a program to print all multiples of 7 between 1 and 100. 
4. Write a program to reverse the digits of the number 1234. The output should be 4321. 
5. Write a program to print the Fibonacci sequence up to the number 21. 
6. Write a program to find and print the first 5 prime numbers. 
7. Write a program to calculate the sum of the digits of the number 9876. The output should be 
30 (9 + 8 + 7 + 6). 
8. Write a program to count down from 10 to 0, printing each number. 
9. Write a program to find and print the largest digit in the number 4825. 
10. Write a program to print all even numbers between 1 and 50. 
11. Write a Java program to demonstrate the use of both pre-increment and post-decrement 
operators in a single expression 

*/
//========================================================
/*
1. Write a program to calculate the sum of the first 50 natural numbers. 
*/
class Sum {
 public static void main(String arg[]){
  int n = 50,sum;
sum = (n*(n+1)/2);
System.out.println(sum);

}
}


/*
2. Write a program to compute the factorial of the number 10.
*/

class factorial{
public static void main(String args[]){
 int num = 10 ,fact =1 ;
for (int i = 1; i<=num; i++){
fact = fact*i;

}
System.out.println(fact);

}
}

/*
3. Write a program to print all multiples of 7 between 1 and 100.
*/

class multiples{
public static void main (String arg[]){
for(int i= 1; i<=100; i++){
if (i % 7==0){
System.out.println(i);
}
} 
}
}
/*
4. Write a program to reverse the digits of the number 1234. The output should be 4321.
*/
/*

*/
/*
Write a program to revese the digits of the number 1234. The output should be 4321.

*/

class reverse{
public static void main (String arg[]){
long num , rev;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number");
num = sc.nextInt();

while(num>0){
rev=num%10;
System.out.print(rev);
num= num/10;


}




}}

/*
5. Write a program to print the Fibonacci sequence up to the number 21
*/
class Fibonacci{
public static void main (String arg[]){
int num;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number");
num = sc.nextInt();

int a=0,b=1,c;

for(int i = 1; i<=num; i++){
System.out.print(a);
c=a+b;
a=b;
b=c;

}

}}

/*
Write a program to calculate the sum of the digits of the number 9876. The output should be 
30 (9 + 8 + 7 + 6)
*/
class sumdigits{
public static void main(String arg[]){
int num ,d;
int count =0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number");
num = sc.nextInt();
while (num>0){
 d =num%10;
count = count+d;
num= num/10;
}
System.out.println(count);

 
}
}



/*
8. Write a program to count down from 10 to 0, printing each number. 
*/

class countdown{
public static void main(String arg[]){
//int num;

for (int i = 10;i>=0; i-- ){
System.out.println(i);
}

}
}

/*
9. Write a program to find and print the largest digit in the number 4825. 

*/
class Largestdigit{
public static void main(String arg[]){
int num, largdigit = 0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number");
num = sc.nextInt();
while(num>0){
int digit = num%10;
if (digit >largdigit){
largdigit = digit;
}
num = num/10;
}
System.out.println(largdigit);
}
}



/*
10. Write a program to print all even numbers between 1 and 50. 
*/
class evennum{
public static void main(String arg[]){
int num = 50;
for (int i = 1; i <=num; i++){
if (i % 2 == 0){
System.out .println(i);
}
}
}
}

/*
11. Write a Java program to demonstrate the use of both pre-increment and post-decrement 
operators in a single expression 
*/

class demonstrate{
public static void main(String args[]){
int i = 6;
int j = ++i - i--;
System.out.println(i);
System.out.println(j);
}
}


/**/
/**/
/**/
/**/
/**/
/**/
/**/
/**/
/**/
/**/
/**/
/**/
/**/
/**/
/**/
/**/
























