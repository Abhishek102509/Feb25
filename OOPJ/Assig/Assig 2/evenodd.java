//Q2: Write a program to check whether a given number is even or odd using only bitwise operators.
//Hint: Use n & 1 to check

class evenodd{
	public static void main(String arg[]){
		
		int n= 10;
		if ((n & 1)==0 ){
			System.out.println("Even");
		}else{
			System.out.println("odd");
		}
		
		
	}
		
}