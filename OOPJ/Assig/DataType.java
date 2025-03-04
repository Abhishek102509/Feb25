 //Create a program that declares and initializes all primitive data types in Java and prints their default and assigned values.


class DataType{
 
   public static void main(String args[]){
	  //Default values
        byte a =0 ;
        short s= 0 ;
		int i = 0;
		char ch ='\u0000' ;
		long l = 0;
		float f =0.0f;	
	    double d =0.0;
		boolean  b = false;
		System.out.println(a);
		System.out.println(s);
		System.out.println(i);
		System.out.println(ch);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(b);
		
		//Assigned value
		byte a1 =1;
        short s2=2;
		int i3 = 4;
		char ch4 =2 ;
		long l5 = 8;
		float f6 =4;	
	    double d7 =8;
	
		
		System.out.println(a1+"byte");
		System.out.println(s2+"byte");
		System.out.println(i3+"byte");
		System.out.println(ch4+"byte");
		System.out.println(l5+"byte");
		System.out.println(f6+"byte");
		System.out.println(d7+"byte");
		//System.out.println(b8+"byte");
   }

}