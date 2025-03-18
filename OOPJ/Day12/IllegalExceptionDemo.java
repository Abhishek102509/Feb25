class IllegalExceptionDemo{

public static void main(String arg[]){
    System.out.println("Started");
	  String s ="";
	 String b ="yugfyu";
	 String c=null;
	if(b==c){
		System.out.println("yes");
	}else{
		System.out.println("no");
	}
	try{
		System.out.println(s.length());
		
	}
	catch(IllegalArgumentException e){
		e.printStackTrace();
		System.out.println("Illegle Argument hai");
	}
	System.out.println("finshed");
}
}