abstract class Shape{
	abstract void draw();
}


class Circial extends Shape{
	void draw(){
		System.out.println("Circial");
	}
}
class Rectangle extends Shape{
	void draw(){
		System.out.println("Rectangle");
	}
}



class AbstractDemo{//Driver class
	public static void main(String arg[]){
		Shape s1 = new Circial();
		s1.draw();
		Shape s2 = new Rectangle();
		s2.draw();
		
		
	}
}