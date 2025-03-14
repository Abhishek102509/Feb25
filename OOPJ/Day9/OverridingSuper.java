class Parent{
	
	void show(){
		System.out.println("Parent");
	}
}
class Child extends Parent{
	void show(){
		super.show();
		System.out.println("child");	
	}	
}
class OverridingSuper{
	public static void main(String arg[]){
		Child c = new Child();
		c.show();
	}
}