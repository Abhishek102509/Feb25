   
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


//======================================================================
*/
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

*/
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
*/

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
*/

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

*/

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
*/

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
*/

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
*/

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
*/

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






















