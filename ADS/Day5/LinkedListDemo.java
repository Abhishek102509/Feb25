
class LinkedListDemo{
	
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
	

	public static void main(String arg[]){
	LinkedListDemo l1 = new LinkedListDemo();

		//new Node();
		l1.start = new Node(5);
		Node second = new Node(5);
		Node third = new Node(20);
		Node four = new Node(40);
		
		l1.start.next = second;
		second.next = third;
		third.next = four;
		
		l1.display();
		
		
		
	}

}