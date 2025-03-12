class Animal{
	void display(){
		System.out.println("parent");
	}
}


class Dog extends Animal{
	void bark(){
		System.out.println("child");
	}
}
class cat extends Animal{
	void mew(){
		System.out.println("chail2");
	}
	
}


class Herarichal{
	public static void main (String arg[]){
		  
		  cat c =new cat();
		  c.display();
		  c.mew();
		  Dog d =new Dog();
		  d.display();
		  d.bark();
	}
	
}