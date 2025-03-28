import java.util.*;

class Recuesion6{
	static void toh(int n, char s,char m ,char d){
		
		if(n==1){
			System.out.println("Disk from "+s+" to "+d);
		}else{
			 toh(n-1,s,d,m);
			System.out.println("Disk from "+s+" to "+d);
		   toh(n-1,m,s,d);
		}
	}
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		//int n = 4;
		System.out.println("Enter a number");
		int n= sc.nextInt();
		
		toh(n ,'A','B','C');
		//System.out.println("Enter a number"+" "+ toh(n));
	 
	
	}
}