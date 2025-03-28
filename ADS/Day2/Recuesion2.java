class Recuesion5{
	static int fib(int n){
		
		if(n<=1)
			return n;
		else 
			return fib(n-1)+fib(n-2);
		
	}
	public static void main(String arg[]){
		int num = 10;
		for(int i=0;i<num;i++)
	  System.out.println(fib(i)+ " ");
	
	}
}