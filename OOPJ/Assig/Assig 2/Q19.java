public class Q19{
	public static void main(String args[]){
		check('a');
		check('A');
		check('1');
	}
	
	public static void check(char A){
		int a = (int) A;
		String result = (a>64 && a<91)? "Uppercase" : (a>96 && a<123)? "Lowercase" : "Not a character";
		System.out.println(result);
	}
}