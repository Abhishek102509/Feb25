class Stack{
	static int Max =5;
	int top;
	int a1[] = new int[Max];
     
	 
	Stack(){
		top=-1;
	}
	
	boolean isEmpty(){
		return top<0;
	}
	boolean isFull(){
		return top >=Max-1;	
	}
	boolean push(int x){
		if(isFull()){
			System.out.println("Stack overflow");
			return false;
		}else{
			a1[++top]=x;
			System.out.println(x+" Element Add");
			return true;
		}
	}
	int pop(){
		if(isEmpty()){
			System.out.println("Stack underflow");
			return 0;
		}
		int x = a1[top--];
		return x;
	}
	int peek(){
		if(isEmpty()){
			System.out.println("Stack underflow");
			return 0;
		}
		int x = a1[top];
		return x;
	}
	
     
}
class StackDemo11{
	public static void main(String arg[]){
		Stack s1 = new Stack();
		s1.push(10);
		s1.push(30);
		s1.push(60);
		s1.push(70);
		System.out.println(s1.peek());
		s1.pop();
		System.out.println(s1.peek());
		
	
	}
}