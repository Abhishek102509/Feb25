class NullExceptionDemo{

public static void main(String arg[]){
    System.out.println("Started");
	  String s =null;
	try{
		if (s.equals("myname"))
                System.out.print("Same");
            else 
                System.out.print("Not Same");
	}
	catch(NullPointerException e){
		e.printStackTrace();
		System.out.println("Null pointer");
	}
	
	
	
	
	System.out.println("finshed");
}
}