import java.io.*;
class ChDemo1{
	
public static void main(String arg[]){
  
     //int i = Integer.parseInt("ab");//Unchecked Ex 
		
	try
	{
		int j = System.in.read();
	}
	catch(IOException e)
	{
		e.printStackTrace();
		System.out.println("IOException");
	}
	
	System.out.println("Finished");
}
}