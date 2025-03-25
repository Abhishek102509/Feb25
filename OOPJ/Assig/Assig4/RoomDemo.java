class Room{
	double height;
	double width;
	double breadth;
	
	
	Room(double height,double width,double breadth){
		this.height=height;
		this.width = width;
		this.breadth= breadth;
	}
     double volume(){
		 return height*width*breadth;
  }
  void display(){
	  System.out.println(volume());
  }
}

public class RoomDemo{
	public static void main(String arg[]){
	Room r1 = new Room(45,4,55);
	Room r2 = new Room(45,3,55);
	r1.display();
	r2.display();
	//System.out.println(r1.volume());
	//System.out.println(r2.volume());
	}
}