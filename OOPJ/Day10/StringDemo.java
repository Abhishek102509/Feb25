

class StringDemo{
	

	public static void main(String arg[]){
		String s1 = "ABC";
		String s2 = "ABC";
		String s3 = "ABCD";
		String s4 = "ABCD";
		
		System.out.println((s1==s2));//true
		System.out.println((s1==s4));//false
		
		String s5 = new String("ABC");
		String s6 = new String ("ABCD");
		
		System.out.println((s1==s5));//false
		System.out.println((s1.equals(s5)));//true
		
		s1.concat("xyz");
		
		s1 = s1.concat("xyz");
		System.out.println(s1);  
		
		
	}
}