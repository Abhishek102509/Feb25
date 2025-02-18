class Day2{
public static void main(String args[]){

int a =25;
System.out.println(a>>1);
}
}


//Switch Statement

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

















