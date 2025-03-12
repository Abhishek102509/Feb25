interface A{
	void display1()
	{
		System.out.println("Parent");
	}
}

interface B extends A{
	void display2()
	{
		System.out.println("child1");
	}
}

interface C extends A{
	void display3()
	{
		System.out.println("child2");
	}
}

class D implements B,C{
	void display4()
	{
		System.out.println("child3");
	}
}

class E extends D{
	void display4()
	{
		System.out.println("child4");
	}
	
}



class MultipleInharitance{
	public static void main(String args[]){
		E e1 = new E();
		e1.display1();
		e1.display2();
		e1.display3();
		e1.display4();
		e1.display5();
		
	}
}