class Day2{
public static void main(String args[]){

int a =25;
System.out.println(a>>1);
}
}


//Switch Statement
/*
class Switch{
public static void main(String args[]){
  int a= 10;
 switch(a){
         case 10 :
            System.out.println(10);
            break;
         case 20 :
             System.out.println(20);
             break;
         case 30:
             System.out.println(30);
             break;
          default:
             System.out.println("default Case");
              break;
  }    

}
}
*/


//Check Number is Positive


class positivenum{
  public static void main(String args[]){
   int n= 5;
if (n>0){
System.out.println(n +" " +"is positive Number");
}

}
}

//Check Number is negative

class negativenum{
  public static void main(String args[]){
   int n= -5;
if (n<0){
System.out.println(n +" " +"is negative Number");
}

}
}

//Check Number is positive or negative


class positive{
  public static void main(String args[]){
   int n= -5;
if (n>0){
System.out.println(n +" " +"is positive Number");
}

else if(n<0){
System.out.println(n +" " +"is negative Number");
}
}
}



  /*  4. Display Good Morning Message Based on Time:
 Task: Create a flowchart to display a "Good Morning" message based on a given time. 
 Next Step: Write a Java program that displays a "Good Morning" message if the 
predefined time is between 5 AM and 12 PM. Use an if statement to implement the logic.
*/




class time{
public static void main(String args[]){
   int t = 5;

if (t>=5 & t<=12){
System.out.println("Good Morning");

}
}
}

class time1{
public static void main(String args[]){
   int t = 5;

if (t>=5 & t<=12){
System.out.println("Good Morning");


}
else if (t>12 & t<=17){
System.out.println("Good Afternoon");
}
else{
System.out.println("Good Night");
}

}
}



// Area

class area{
public static void main(String args[]){
  int l = 5;
  int  A= l*l;
System.out.println("Area" + " = "+ A);
}

}


//Area of a Rectangle:


class Rectangle{
public static void main(String args[]){
 int l = 6 ,w = 5;
  int A = l*w;
System.out.println("Area of a Rectangle"+"  " +A);

}
}

// --______________Section 1: Error-Driven Learning in Java
//--===============================
/*
public class Main { 
 public void main(String[] args) //Errer:Main method is not static in class Main
{ 
 System.out.println("Hello, World!"); 
 }
}

*/
//-----------------------------------------
/*
 class Main { 
 public static void main(String[] args) { 
 System.out.println("Hello, World!"); 
 } 
}

*/
//======================================
/*
Snippet 2: 
public class Main { 
 static void main(String[] args) //Main method not found in class Main
{ 
 System.out.println("Hello, World!"); 
 } 
} 
 What happens when you compile and run this code?

*/
//-----------------------------

/*
class Main { 
 public static void main(String[] args) { 
 System.out.println("Hello, World!"); 
 } 
} 
*/
//-============================================

/*
Snippet 3: 
public class Main { 
 public static int main(String[] args) //
{ 
 System.out.println("Hello, World!"); 
 return 0; 
 }
*/

//-----------------------------------


/*
 class Main { 
 public static void main(String[] args) { 
 System.out.println("Hello, World!"); 
 
 }
}
*/

//=======================================


/*
Snippet 4: 
public class Main { 
 public static void main() //Main method not found in class Main, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application
{ 
 System.out.println("Hello, World!"); 
 } 
}
*/

//------------------------
//Run time Ereer 
 

/*
 class Main { 
 public static void main(String args[]) { 
 System.out.println("Hello, World!"); 
 } 
}
*/

//==================================

/*
Snippet 5: 
public class Main { 
 public static void main(String[] args) { 
 System.out.println("Main method with String[] args"); 
 } 
 public static void main(int[] args) { 


 Main method not found in class Main, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application
 System.out.println("Overloaded main method with int[] args"); 
 } 
}
*/
//=---------------------------------------------


  /*
 class Main { 
 public static void main(String[] args) { 
 System.out.println("Main method with String[] args"); 
 } 
 public static void main(String[] args) { 
 System.out.println("Overloaded main method with int[] args"); 
 } 
}
*/
//==============================================


/*
Snippet 6: 
public class Main { 
 public static void main(String[] args) { 


 int x = y + 10; 
 System.out.println(x); 
 } 
}

 cannot find symbol
 int x = y + 10;
         ^
  symbol:   variable y
  location: class Main
1 error
*/

//_______________________________------------------
/*
 class Main { 
 public static void main(String[] args) { 
int y= 10;
 int x = y + 10; 
 System.out.println(x); 
 } 
}
*/
//=======================================

/*
Snippet 7: 
public class Main { 
 public static void main(String[] args) { 
 int x = "Hello"; 
 System.out.println(x); 
 } 
}
 incompatible types: String cannot be converted to int
*/
//=-----------------------------

/*
 class Main { 
 public static void main(String[] args) { 
 String x = "Hello"; 
 System.out.println(x); 
 } 
}
*/

//===================================================

/*
Snippet 8: 
public class Main { 
 public static void main(String[] args) { 
 System.out.println("Hello, World!" 
 } 
} 

 error: ')' expected
*/
//------------------------------------

 /*
 class Main { 
 public static void main(String[] args) { 
 System.out.println("Hello, World!") 
 } 
} 
*/

//=========================================================

/*
Snippet 9: 
public class Main { 
 public static void main(String[] args) { 
 int class = 10; 
 System.out.println(class); 
 } 
}
*/

//--------------------------------------------
/*
 class Main { 
 public static void main(String[] args) { 
 int a = 10; 
 System.out.println(a); 
 } 
}
*/
//================================================================

/*
Snippet 10: 
public class Main { 
 public void display() { 
 System.out.println("No parameters"); 
 } 
 public void display(int num) { 
 System.out.println("With parameter: " + num); 
 } 
 public static void main(String[] args) { 
 display(); 
 display(5); 
 } 
}
*/
//=----------------------------------------------

//==============================================
/*
Snippet 11: 
public class Main { 
 public static void main(String[] args) { 
 int[] arr = {1, 2, 3}; 
 System.out.println(arr[5]); 
 } 
}

Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
        at Main.main(Day2.java:398)
*/

//-----------------------------
/*
  class Main { 
 public static void main(String[] args) { 
 int[] arr = {1, 2, 3,4,5,6}; 
 System.out.println(arr[5]); 
 } 
}
*/

//==========================================


/*
Snippet 12: 
public class Main { 
 public static void main(String[] args) { 
 while (true) { 
 System.out.println("Infinite Loop"); 
 } 
 } 
}
*/
//-----------------------------------

/*
class Main { 
 public static void main(String[] args) { 
int n =5 ;
 while (n>=5) { 
 System.out.println("Infinite Loop");
n--; 
 } 
 } 
}
*/
//===================================================

/*
Snippet 13: 
public class Main { 
 public static void main(String[] args) { 
 String str = null; //Null Not writen in Str formate String is written in ""or''.
 System.out.println(str.length()); 
 } 
}
Exception in thread "main" java.lang.NullPointerException
        at Main.main(Day2.java:447)
*/
//----------------------------------------------------
/*
class Main { 
 public static void main(String[] args) { 
 String str = "null"; 
 System.out.println(str.length()); 
 } 
}
*/

//================================================

/*
Snippet 14: 
public class Main { 
 public static void main(String[] args) { 
 double num = "Hello"; 
 System.out.println(num); 
 } 
}
 incompatible types: String cannot be converted to double
 double num = "Hello";
*/
//------------------------------------------------------------

/*
 class Main { 
 public static void main(String[] args) { 
 double num = 78.0; 
 System.out.println(num); 
 } 
}
*/
//===========================================================
/*
Snippet 15: 
public class Main { 
 public static void main(String[] args) { 
 int num1 = 10; 
 double num2 = 5.5; 
 int result = num1 + num2; 
 System.out.println(result); 
 } 
}

incompatible types: possible lossy conversion from double to int
 int result = num1 + num2;
*/
//----------------------------------------------------
/*
 class Main { 
 public static void main(String[] args) { 
 int num1 = 10; 
 double num2 = 5.5; 
 double result = num1 + num2; 
 System.out.println(result); 
 } 
}
*/
//===================================================

/*
Snippet 16: 
public class Main { 
 public static void main(String[] args) { 
 int num = 10; 
 double result = num / 4; 
 System.out.println(result); 
 } 
} no error
*/

//-------------------------------------------------------
/*
 class Main { 
 public static void main(String[] args) { 
 int num = 10; 
 double result = num / 4; 
 System.out.println(result); 
 } 
}*/

//=========================================

/*
Snippet 17: 
public class Main { 
 public static void main(String[] args) { 
 int a = 10; 
 int b = 5; 
 int result = a ** b; 
 System.out.println(result); 
 } 
}error: illegal start of expression
 int result = a ** b;
*/

//-----------------------------------------------------
/*
 class Main { 
 public static void main(String[] args) { 
 int a = 10; 
 int b = 5; 
 int result = a * b; 
 System.out.println(result); 
 } 
}
*/
//==============================
/*
Snippet 18: 
public class Main { 
 public static void main(String[] args) { 
 int a = 10; 
 int b = 5; 
 int result = a + b * 2; 
 System.out.println(result); 
 } 
} no error
*/
//---------------------------------------------

//=============================================

/*
Snippet 19: 
public class Main { 
 public static void main(String[] args) { 
 int a = 10; 
 int b = 0; 
 int result = a / b; 
 System.out.println(result); 
 } 
}
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Main.main(Day2.java:585)
*/
//-----------------------Run time Error--------------------

/*
 class Main { 
 public static void main(String[] args) { 
 int a = 10; 
 int b = 2; 
 double result = a / b; 
 System.out.println(result); 
 } 
}
*/

//================================================



/*
20....
public class Main { 
 public static void main(String[] args) { 
 System.out.println("Hello, World") 
 }

//====errors======

Day2.java:609: error: ';' expected
 System.out.println("Hello, World")
      error: reached end of file while parsing
 }                             ^
*/

//---------------------------------



/*
class Main { 
 public static void main(String[] args) { 
 System.out.println("Hello, World"); 
 }
}

*/
//============================================


/*
Snippet 21: 
public class Main { 
 public static void main(String[] args) { 
 System.out.println("Hello, World!"); 
 // Missing closing brace here 
} error: reached end of file while parsing
}
 ^
*/

//--------------------------------


/*
 class Main { 
 public static void main(String[] args) { 
 System.out.println("Hello, World!"); 
 // Missing closing brace here 
}
}
*/
//==============================================


/*
Snippet 22: 
public class Main { 
 public static void main(String[] args) { 
 static void displayMessage() { 
 System.out.println("Message"); 
 } 
 } 
}  ---------------------------------------------

static void displayMessage() {
 ^
Day2.java:671: error: class, interface, or enum expected
}
^
Day2.java:672: error: illegal character: '\u201a'
∩é╖
 ^
Day2.java:672: error: illegal character: '\u00b7'
∩é╖
  ^
4 errors

*/
//-----------------------------


/*
 class Main { 
 public static void main(String[] args) { 
 //static void displayMessage() { 
 System.out.println("Message"); 
 //} 
 } 
} 
*/
//===============================================


/*
Snippet 23: 
public class Confusion { 
 public static void main(String[] args) { 
 int value = 2; 
 switch(value) { 
 case 1: 
 System.out.println("Value is 1"); 
 case 2: 
 System.out.println("Value is 2"); 
 case 3: 
 System.out.println("Value is 3"); 
 default: 
 System.out.println("Default case"); 
 } 
 } 
}
Error to Investigate: Why does the default case print after "Value is 2"? How can you prevent 
the program from executing the default case?

Ans...
Because in switch statemnet we not use a break 

*/
//---------------No Error--------------------------------
//===========================================


/*
Snippet 24: 
public class MissingBreakCase { 
 public static void main(String[] args) { 
 int level = 1; 
 switch(level) { 
 case 1: 
 System.out.println("Level 1"); 
 case 2: 
 System.out.println("Level 2"); 
 case 3: 
 System.out.println("Level 3"); 
 default: 
 System.out.println("Unknown level"); 
 } 
 } 
}Error to Investigate: When level is 1, why does it print "Level 1", "Level 2", "Level 3", and 
"Unknown level"? What is the role of the break statement in this situation?


Ans....==============
The role of break statement is if the condatin in find then the code is not execute the net line it will jump the out side of loop
*/

//---------------------------------------------
//=======================

/*
Snippet 25: 
public class Switch { 
 public static void main(String[] args) { 
 double score = 85.0; 
 switch(score) { 
 case 100: 
 System.out.println("Perfect score!"); 
 break; 
 case 85: 
 System.out.println("Great job!"); 
 break; 
 default: 
 System.out.println("Keep trying!"); 
 } 
 } 
} 
 Error to Investigate: Why does this code not compile? What does the error tell you about the 
types allowed in switch expressions? How can you modify the code to make it work?


====
 error: incompatible types: possible lossy conversion from double to int
 switch(score) {
*/
//--------------------------------------------


/*
class Switch { 
 public static void main(String[] args) { 
 int score =(int) 85.0; 
 switch(score) { 
 case 100: 
 System.out.println("Perfect score!"); 
 break; 
 case 85: 
 System.out.println("Great job!"); 
 break; 
 default: 
 System.out.println("Keep trying!"); 
 } 
 } 
}
*/

//===================================


/*

Snippet 26: 
public class Switch { 
 public static void main(String[] args) { 
 int number = 5; 
 switch(number) { 
 case 5: 
 System.out.println("Number is 5"); 
 break; 
 case 6: 
 System.out.println("This is another case 5"); 
 break; 
 default: 
 System.out.println("This is the default case"); 
 } 
 } 
}

 Error to Investigate: Why does the compiler complain about duplicate case labels? What 
happens when you have two identical case labels in the same switch block?
  

Ans.......... 
Remove Or change the dublicat case labels.


*/

//---------------------------------------------

class Switch { 
 public static void main(String[] args) { 
 int number = 5; 
 switch(number) { 
 case 5: 
 System.out.println("Number is 5"); 
 break; 
 case 6: 
 System.out.println("This is another case 5"); 
 break; 
 default: 
 System.out.println("This is the default case"); 
 } 
 } 
}

/*
//=================================================================
Section 2: Java Programming with Conditional Statements 
Question 1: Grade Classification 
Write a program to classify student grades based on the following criteria: 
 If the score is greater than or equal to 90, print "A" 
 If the score is between 80 and 89, print "B" 
 If the score is between 70 and 79, print "C" 
 If the score is between 60 and 69, prin

*/

//--------------------------------------------------------------

/*

class Main{
public static void main(String args[]){
int n=40;
if(n>=90){
System.out.println("A");
}

else if(n>=80 && n<=89){
System.out.println("Print B");
} 
else if(n>=70 && n<=99){
System.out.println("Print C");
}
else if(n>=60 && n<=69){
System.out.println("Print D");
}
else {
System.out.println("Print F");

}
}
}

*/
//===================================================

/*
Question 2: Days of the Week 
Write a program that uses a nested switch statement to print out the day of the week based on an 
integer input (1 for Monday, 2 for Tuesday, etc.). Additionally, within each day, print whether it 
is a weekday or weekend
*/





class main{
public static void main(String args[]){

int Day = 1 ;

switch(Day){
case 0 :
System.out.println("Sunday");
switch(Day){
case 0:
System.out.println("weekend");
break;
}
break;
case 1 :
System.out.println("Monday");
switch(Day){
case 1:
System.out.println("weekday");
break;
}
break;
case 2 :
System.out.println("Tuesday");
switch(Day){
case 2:
System.out.println("weekday");
break;
}
break;
case 3 :
System.out.println("Wednesday");
switch(Day){
case 3:
System.out.println("weekday");
break;
}
break;
case 4 :
System.out.println("Thursday");
switch(Day){
case 4:
System.out.println("weekday");
break;
}
break;
case 5 :
System.out.println("Friday");
switch(Day){
case 5:
System.out.println("weekday");
break;
}
break;
case 6 :
System.out.println("Saturday");
switch(Day){
case 6:
System.out.println("weekend");
break;
}
break;
default :
System.out.println("no Day");
}


}



}


//=============================================================================
/*
Question 3: Calculator 
Write a program that acts as a simple calculator. It should accept two numbers and an operator 
(+, -, *, /) as input. Use a switch statement to perform the appropriate operation. Use nested ifelse to check if division by zero is attempted and display an error message

*/

//------------------------------------------------------------------------------------

/*
class Calculator{
public static void main (String args []){
 int num1 = 30;
 int num2 = 40;
 char  op = '/' ;
double result;
switch(op){
     case '+':
     result = num1+num2;
System.out.println(result);
break;

case '-':
     result = num1-num2;
System.out.println(result);
break;

case '*':
     result = num1*num2;
System.out.println(result);
break;

case '/':
if (num2 !=0){
 result = num1/num2;
System.out.println(result);
}else{
System.out.println("Error");
}
break;
default:
 System.out.println("Invalid Operator");

     }

}
} 

*/

//=====================================================
/*

Question 4: Discount Calculation 
Write a program to calculate the discount based on the total purchase amount. Use the following 
criteria: 
 If the total purchase is greater than or equal to Rs.1000, apply a 20% discount. 
 If the total purchase is between Rs.500 and Rs.999, apply a 10% discount. 
 If the total purchase is less than Rs.500, apply a 5% discount. 
Additionally, if the user has a membership card, increase the discount by 5%

*/

//------------------------------------------------------------------
/*
class Discount{
public static void main(String arg[]){
    int p = 1000;
     double d ;
  // boolean membership;
     
if(p>=1000){
d = p*0.20;
System.out.println(d);

}else if (p>=500 && p<=999){
 d = p*0.10;
System.out.println(d);
}
else if (p<500){
 d = p*0.05;
System.out.println(d);
}
else {
System.out.println("No discount");
}
/*
if(membership){
d +=0.05;
System.out.println(d); 
}


} 
}
*/
//==============================================================================
/*
Question 5: Student Pass/Fail Status with Nested Switch 
Write a program that determines whether a student passes or fails based on their grades in three 
subjects. If the student scores more than 40 in all subjects, they pass. If the student fails in one or 
more subjects, print the number of subjects they failed in.
*/



















