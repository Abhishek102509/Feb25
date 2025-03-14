//Q3: Implement a program that calculates the sum of digits of an integer using modulus (%) and division (/) operators



class SumOfDigits{
	public static void main(String arg[]){
		
		int n= 1576,d;
		int sum =0;
		while(n>0){
			d=n%10;
			sum =sum+d;
			
			n=n/10;
			
		}
		System.out.println(sum);
		
		
		
	}
		
}