
class LinkedListDemo2{
	
	Node start;//Reference: Starting point of the list
	static class Node{
		int data;//stores the value of node
		Node next;//referen
		
		Node(int d){
			this.data=d;
			this.next=null;
			
		}
		
	}
	
	void display(){
		Node n = start;
		while( n != null)
		{
			System.out.print(n.data+"----->");
			n=n.next;
			
		}
		
	}
	
	//add beging
	void insert(int new_data){
		Node new_node = new Node(new_data);
		new_node.next = start;
		start = new_node;
		
		
	}
	//Add between Two
	void insertAfter(Node prev_node,int new_data){
		Node new_node = new Node(new_data);
		new_node.next = prev_node.next;
		prev_node.next = new_node;
		
	}
	
	//add in the end
	void append(int new_data){
		Node new_node = new Node(new_data);
		
		if(start==null){
			start = new_node;
			return;
		}
		Node n = start; 
		while(n.next != null)
			n = n.next;
			n.next = new_node;
			return;
		
	}
	
	

	public static void main(String arg[]){
	LinkedListDemo2 l1 = new LinkedListDemo2();

		//new Node();
		
		l1.insert(10);
		l1.insert(70);
		l1.insert(60);
		l1.insert(30);
		l1.insert(90);
		
		System.out.println("\n");
		
		l1.display();
		
	/*	l1.start = new Node(5);
		Node second = new Node(5);
		Node third = new Node(20);
		Node four = new Node(40);
		
		l1.start.next = second;
		second.next = third;
		third.next = four;*/
		
		System.out.println("\n");
		
		l1.insertAfter(l1.start,60);
		
		l1.display();
		
		System.out.println("\n");
		
		l1.append(40);
		
		l1.display();
		
		
		/*90----->30----->60----->70----->10----->

          90----->60----->30----->60----->70----->10----->

         90----->60----->30----->60----->70----->10----->40----->*/
		
		
	}

}