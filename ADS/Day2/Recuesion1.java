class Recuesion1{
	static int fact(int n){
		
		if(n<=1)
			return 1;
			
		else 
			return n*fact(n-1);
		
	}
	
	
	public static void main(String arg[]){
	System.out.println(fact(5));
	
	}
}