class IllegalExceptionDemo1{
	int age ;
	
	void setAge(int age){
		if(age<0){
			
			throw new IllegalArgumentException("Age must be greater than zero");
		}else{
			this.age = age;
			System.out.println("The person's age is: " + this.age);
		}
	}
	
	
	
	
public static void main(String arg[]){
    
	
	IllegalExceptionDemo1 E = new IllegalExceptionDemo1();
	E.setAge(17);
	
}
}