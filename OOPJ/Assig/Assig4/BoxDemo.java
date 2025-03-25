class Box{
	double h;
	double w;
	double b;
	
	Box(double h, double w, double b){
		this.h=h;
		this.w=w;
		this.b=b;
	}
	double getVolume(){
		return (h*w*b);
	}
	double getArea(){
        return 2 * (h * w + w * b + h * b);	
	}	
	
	/*void display(){
		System.out.println(getVolume());
	    System.out.println(getArea());
		
	}*/
}

class BoxDemo{
	
	public static void main(String arg[]){
	    Box b1 = new Box(54,10,10);
		Box b2 = new Box(54,10,15);
		
		
		System.out.println(b1.getVolume());
	    System.out.println(b2.getArea());
		//b1.display();
		//b2.display();
		
	}
}