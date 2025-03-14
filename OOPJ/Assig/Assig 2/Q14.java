public class Q14{
	public static void main(String[] args){
		setbits(7);
		setbits(12);
	}
	
	public static void setbits(int num){ 
		int count = 0;
		while(num > 0){
            num = (num & (num - 1));
            count++;
        }
		System.out.println(count);
	} 
}