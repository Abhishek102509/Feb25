public class Q13{
	public static void main(String[] args){
		abs(7);
		abs(-20);
	}
	
	public static void abs(int num){ 
		int mask = num >> 31; 
		int abs = (num + mask) ^ mask;
		System.out.println(abs);
	} 
}