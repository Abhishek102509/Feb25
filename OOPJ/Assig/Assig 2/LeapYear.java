//Q7: Implement a Java program that checks whether a given year is a leap year or not using logical (&&, ||) operators.

class LeapYear{
	public static void main(String arg[]){
		
		int y=2001;
	
		if ((y %400==0)||(y %4==0)&& (y %100!=0) ){
			System.out.println("Leap Year");
		}else
		
		System.out.println("Not Leap Year");
		
	}
		
}