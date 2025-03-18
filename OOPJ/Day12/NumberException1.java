class NumberException1{
	
public static void main(String arg[]){
    
	String S1 = "12";
	String S2 = "s";
	try
	{
		int i = Integer.parseInt(S1);
		int j = Integer.parseInt(S2);
		int k = i/j;
		System.out.println(k);
	}
	catch(NumberFormatException e)
	{
		e.printStackTrace();
		System.out.println("Number formate");
	}
	
	System.out.println("Finished");
}
}