class Animal{
	void display1(){
		System.out.println("parent");
	}
}


class Dog extends Animal{
	void display2(){
		System.out.println("child");
	}
}
class BabyDog extends Dog{
	void display(){
		System.out.println("Babydog");
	}
	
}


class Multilevel{
	public static void main (String arg[]){
		  
		  BabyDog a =new BabyDog();
		  a.display();
		  a.display1();
		  a.display2();
		  
		 
		
	}
	
}