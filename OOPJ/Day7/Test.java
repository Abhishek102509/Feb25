interface Scanner{
	default void scan(){
		System.out.println("parent");
	}
}

interface Computer extends Scanner{
	default void display(){
		System.out.println("Scanned document");
	}
}

interface Printer{
	default void print(){
		System.out.println("parets");
	}
}


interface Laptop extends Printer{
	default void display2(){
		System.out.println("Print Document");
	}
}

class Test1 implements Computer,Laptop{
	void display3(){
		System.out.println("main");
	}
	
}



class Test{
	public static void main (String arg[]){
		  
		  Test1 L =new Test1();
		  L.display3();
		  L.display2();
		 L.scan();
		  L.print();
		 
	}
	
}