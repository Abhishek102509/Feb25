class Recuesion5{
	static int sum(int n){
		
		if(n<=0)
			return 0;
		else 
			return n+sum(n-1);
		
	}
	public static void main(String arg[]){
		//int num = 10;
		//for(int i=0;i<num;i++)
	  System.out.println(sum(5));
	
	}
}