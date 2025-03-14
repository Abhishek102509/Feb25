//Q6: Write a program to find the largest of three numbers using only the ternary operator (? :)
class Largest{
	public static void main(String args[]){
		int a = 10;
		int b = 20;
		int c = 30;
		int result = (a>b) ? (a>c ? a: c):(b>c ? b:c);
		 System.out.println(result);
		
	}
}