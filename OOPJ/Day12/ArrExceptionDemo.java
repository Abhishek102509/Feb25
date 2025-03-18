class ArrExceptionDemo{

public static void main(String arg[]){
    System.out.println("Started");
	String arr[] ={"12","23","13","24","34"}; 
	try{
		/*String s1 =[0];
		String s2 =[1];
		String s3 =[2];
		String s4 =[3];
		String s5 =[4];*/
		System.out.println(arr[10]);
	}
	catch(ArrayIndexOutOfBoundsException e){
		e.printStackTrace();
		System.out.println("Arr me index nahi hai");
	}
	
	
	
	
	System.out.println("finshed");
}
}