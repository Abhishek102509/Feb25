//1. Arithmetic & Assignment Operators

//Q1: Write a program to swap two numbers without using a third variable and without using arithmetic operators like + or -.
//Hint: Use bitwise XOR ^ operator.

class Swap{
	public static void main(String arg[]){
		
		int a= 10;
		int b =5;
		
		a= a^b;
		b= a^b;
		a= a^b;
		System.out.println(a);
		System.out.println(b);
		
	}
		
}