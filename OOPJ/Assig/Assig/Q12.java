//12. Write a program to demonstrate the use of assignment operators (=, +=, -=, *=, /=, %=) on two integers.

class Q12{
	public static void main(String arg[]){
		int a =10; 
		int b = 30;
		int c= a;
		 a += 1;
		int d = 3;
        int e = 4;	
		d*=5;
		e/=2; 
	
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		b -=1;
		System.out.println(b);
		
		
		System.out.println(d);
		System.out.println(e);
		
	}
}