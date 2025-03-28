package Day16;

import java.util.Scanner;

public class Q1 {
	public static void main(String arg[]) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		for (int i=2;i<n;i++)
		if(n<=1 || n%i==0)  {
			System.out.println("Number is Not Prime");
		}else {
			System.out.println("Number is Prime");
		}
	}

}
