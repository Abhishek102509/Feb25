//Q25: Implement a program that reverses an integer number without using string conversion (StringBuilder or toCharArray).
//Hint: Use while(n!=0) { rev = rev * 10 + n % 10; n /= 10; } 
class Reverses{
	public static void main(String arg[]){
		
		int n= 1234543;
		int rev;
		
		
		while(n!=0) { rev = rev * 10 + n % 10; n /= 10; }
		System.out.println(rev);
		
		
	}
		
}