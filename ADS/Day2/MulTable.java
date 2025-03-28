import java.util.*;

class MulTable{
	 static void mul(int n,int i){
		
		if(i>10){
			return;
		}
			System.out.println(n+"* "+i+ " = "+n*i);
		
		 mul(n,i+1);
		
	}
	public static void main(String arg[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		
		mul( n, 1);
		//System.out.println(mul( n, 1));
	}
}