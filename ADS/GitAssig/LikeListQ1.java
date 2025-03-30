class LikeListQ1{
	
	
	Node Start;
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			this.data=d;
			this.next=null;
		}
		
	}
	
	 void display(){
		Node n = Start;
		while(n != null){
		System.out.print(n.data+"-------->");
		n=n.next;
		}
		
	}
	//2.Insert a node at the beginning of a linked list.
	void insert(int NewData ){
		Node newNode = new Node(NewData);
		newNode.next = Start;
		Start=newNode;
		
	}
	 void insertAfter(Node prevNode,int NewData){
		 Node newNode =new Node(NewData);
		 newNode.next = prevNode.next;
		 prevNode.next = newNode;
	 }
	 //3.Insert a node at the end of a linked list.
	 void append(int NewData){
		 Node NewNode = new Node(NewData);
		if(Start==null){
			Start = NewNode;
			return;
		}
		Node n = Start;
		while(n.next != null)
			n=n.next;
		n.next= NewNode;
		return;
	 }
	
	
	
	
	public static void main(String arg[]){
		LikeListQ1 l1 = new LikeListQ1();
		
		l1.insert(10);
		l1.insert(30);
		l1.insert(60);
		l1.display();
		System.out.print("\n");
		
		l1.insertAfter(l1.Start.next,50);
		System.out.print("\n");
		l1.display();
		
		
		l1.append(90);
		System.out.print("\n");
		l1.display();
		
		
		
		
		
		
		
	
	} 


}