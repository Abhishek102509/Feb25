class Node{
	int data;
	Node next;
	
	Node(int d){
		this.data = d;
		this.next = null;
	}	
}



class StackDemo3{
	Node head;
	
	StackDemo3(){
		this.head=null;
		
	}
	boolean IsEmpty(){
		return head ==null;
		
	}
	
	void push(int data){
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;		
	}
	
	void pop(){
		if(IsEmpty()){
			System.out.println("Stack underflow");
			return;
		}
		Node temp = head;
		head =head.next;
		temp.next= null;
		temp = null;
	}
	
	int peek(){
		if(! IsEmpty()){
			return head.data;
		}
		else
		{
			System.out.println("Stack underflow");
			return -1;
		}
	}
	
	
	public static void main(String arg[]){
		StackDemo3 s1 = new StackDemo3 ();
		s1.push(80);
		s1.push(90);
		s1.push(780);
		s1.push(700);
		System.out.println(s1.peek());
		s1.pop();
		System.out.println(s1.peek());
		
		
		
	}
}