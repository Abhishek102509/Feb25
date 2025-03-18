

class StringDemo1{
	

	public static void main(String arg[]){
		String s1 = "ABC";
		String s2 = "ABC";
		String s3 = "ABCDEFGHIJ";
		String s4 = "ABCD";
		String s5 = "ABCNDFODWFS";
		String s6 = "djdjdjfndjdefe";
		String s7 = "    djdjdjfndjdefet";
		
		
		
		//Importent String Method                   //OutPut
		System.out.println(s1.length());            //3
		System.out.println(s1.charAt(1));           //B
		System.out.println(s3.substring(1,4));      //BCD
		System.out.println(s3.contains("AB"));      //true
		System.out.println(s3.contains("AC"));		//false
		System.out.println(s3.contains("C"));       //true
		System.out.println(s5.indexOf("D"));        //4
		System.out.println(s3.toLowerCase());       //abcdefghij
		System.out.println(s6.toUpperCase());       //DJDJDJFNDJDEFE
		System.out.println(s7);                     //    djdjdjfndjdefet
		System.out.println(s7.trim());              //djdjdjfndjdefet
		System.out.println(s1);                     //ABC
		System.out.println(s1.replace("A", "B"));   //BBC
		//System.out.println(s3.substring(1,4));
	 
		
		
	}
}