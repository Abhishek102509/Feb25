class Parent{
	Parent(String name){
		System.out.println("Parent" +name);
	}
}
class Child extends Parent {
		Child(String name){
			super(name);
			System.out.println("child"+name);
		}
		
	}



class OverridingDemo8{
	public static void main(String arg[]){
		
		//Parent p = new Parent();
		
		Child c = new Child("Abhi");
		
	}
}