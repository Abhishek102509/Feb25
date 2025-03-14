public class Q11{
	public static void main(String[] args){
		check(8);
		check(7);
	}
	
	public static void check(int a){
		if(a<0) a = -a;
		if((a & (a-1))==0)
			System.out.println(a + " is a power of two");
		else
			System.out.println("Oops! " + a + " is not a power of two");	
	} 
}