class Node{
	int data;
	Node next;
	
	Node(int d){
		this.data=d;
		this.next=null;
		
	}
}

class StackDemo4{
	Node head;
	StackDemo4(){
		this.head =null;
	}
	
	
	boolean isEmpty(){
		return head ==null;
	}
	void push(int x){
		Node newNode = new Node(x);
		newNode.next = head;
		head = newNode;
	}
	
	void pop(){
		if(isEmpty()){
			system.out.println("Stack underflow");
			return;
		}else{
			Node temp = head;
			head = head.next;
			temp=null;
			temp.next = null;
		}	
	}
	int peek(){
		if(! isEmpty()){
			return head.data;
		}
		else{
			System.out.println("Stack under flow");
			return -1;
		}
	}
	

	
	
	
	
	

	public static void main(String arg[]){
		
		
	}
	
	
	
}