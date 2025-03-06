//Q5: Write a Java program to swap two numbers using the += and -= operators only.

class SwapNum{
	public static void main(String arg[]){
		
		int a= 10;
		int b =5;
		
		a+=b;
		b=a-b;
		a-= b;
		System.out.println(a);
		System.out.println(b);
		
	}
		
}