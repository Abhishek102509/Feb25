//cunstructor overloading
class Empolyee{
	int num; 
	int age;
	double d;
	
	
	Empolyee()
	{
		System.out.println(num+"name");
	}
	Empolyee(int num, int age)
	{
		this.num= num;
		this.age= age;
		System.out.println(num+age);
	}
	Empolyee(int num ,int age ,double d )
	{
		this.num = num;
		this.age = age;
		this.d = d;
		System.out.println(num+age+d);
	}
	
	
}


class EmpolyeeDemo{
	public static void main(String arg[]){
		Empolyee e = new Empolyee();
		Empolyee e1 = new Empolyee(2,3);
		Empolyee e2 = new Empolyee(3,4,5.6);
		
	}
}