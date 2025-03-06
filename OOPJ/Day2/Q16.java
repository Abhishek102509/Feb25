public class Q16{
	public static void main(String[] args){
		pnz(12);
		pnz(-11);
		pnz(0);
	}
	public static void pnz(int x){
		String res = (x==0)? "zero" : (x>0)? "positive" : "negative";
		System.out.println(res);
	}
}	
