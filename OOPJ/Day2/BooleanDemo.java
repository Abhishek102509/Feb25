//Q8: Write a program that takes three boolean inputs and prints true if at least two of them are true.
//Hint: Use logical operators (&&, ||)



class BooleanDemo{
	public static void main(String arg[]){
		
		boolean a= true;
		boolean b= false;
		boolean c= true;
		
	
		if ((a&&b)||(a&&c)||(b&&c)){
			System.out.println("True");
		}else
		
		System.out.println("False");
		
	}
		
}