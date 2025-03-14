//Q25: Implement a program that reverses an integer number without using string conversion (StringBuilder or toCharArray).
//Hint: Use while(n!=0) { rev = rev * 10 + n % 10; n /= 10; } 
public class Q25{
	static public void main(String me[]){
		int x = 1534, rev = 0;
		int temp = x;
		while(x!=0){
			rev = rev * 10 + x % 10;
			x = x/10;
		}
		System.out.println("Reverse of " + temp + " is " + rev);
	}
}