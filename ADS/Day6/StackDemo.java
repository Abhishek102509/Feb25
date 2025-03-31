class Stack{
	static final int Max=7;
	int top;
	int a1[] = new int [Max];
	
	Stack(){
		this.top= -1;
		
	}
	boolean isEmpety(){
		return top <0;
	}
	
	boolean isFull(){
		return top > Max-1;
	}

	boolean push(int x){
		if (top > (Max-1)){
			System.out.println("Stack Overflow");
			return false;
			
		}else{
			a1[++top] = x;
			System.out.print(x+" Element Added===");                       
			return true;
		}
	}

	
       int pop(){
		   if (top<0){
			   System.out.println("Stack Overflow");
			return 0;
		   }else{
			   int x = a1[top--];
			   return x;
		   }
	   }
	   int peek(){
		   if(top<0){
			   System.out.println("Stack underflow");
			return 0;
		   }else{
			   int x = a1[top];
			   return x;
		   }
	   }
	   
	   
	   
	   
	   
}
	   
	
class StackDemo{
	 public static void main(String arg[] ){
	Stack s1 = new Stack();
	s1.push(40);
	s1.push(70);
	s1.push(80);
	
	
	
	
	
	}
}