class Student{
	String name;
	int m1;
	int m2;
	int m3;
	
	
	Student(String name,int m1,int m2,int m3){
		this.name=name;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		
	}
	
	double total(){
		return (m1+m2+m3);
		
	}
	double avg(){
		return ((m1+m2+m3)/3.0);
	}
	
	void display(){
		System.out.println("Student Name: "+name);
		System.out.println("Student total marks: "+total());
		
	}
	
	
}




class Q2{

public static void main(String arg[]){
	Student s1 = new Student("Abhishek" ,54,52,58);
	s1.display();


}
}