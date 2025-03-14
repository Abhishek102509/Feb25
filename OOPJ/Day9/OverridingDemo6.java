class Parent{
	int i =5;
	void show(){
		System.out.println("Parent");
	}
}
class Child extends Parent{
	   int i=20;
		int num=40;
	void show(){
		super.show();
		System.out.println("child");	
	}
void display(){
		
		System.out.println(num);
		System.out.println(i);
        System.out.println(super.i);		
	}	
}
		

class OverridingDemo6{
	public static void main(String arg[]){
		
		Child c = new Child();
		c.show();
		c.display();
	}
}