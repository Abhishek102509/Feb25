


class DoublyDemo{
	Node head;
	
	static class Node{
		int data;
		Node next;
		Node prev;
		
		Node(int d){
			this.data=d;
			this.next=null;
			this.prev=null;
			
		}
	}
		
		void display(){
			Node n= head;
			Node p = null;
			System.out.println("Forword");
			while(n != null){
				System.out.print(n.data+"-->");
				p=n;
				n=n.next;
			}
			System.out.println("\nBackword");
			while(p != null)
			{
				System.out.print(p.data+"-->");
				p=p.prev;
			}
			
		}
		
		//Insert At begning
		
		void insert(int data){
			Node newNode = new Node(data);
			newNode.next=head;
			newNode.prev=null;
			if(head != null)
				head.prev =newNode;
				head = newNode;
			
			//System.out.println();
			
		}
		//insertation in between
		void insterAfter(Node prev,int data){
			Node newNode = new Node(data);
			newNode.next = prev.next;
			prev.next = newNode;
			newNode.prev = prev;
			newNode.next.prev = newNode;
			
		}
		
		//insertatin at end
		void append(int data){
			Node newNode = new Node(data);
			
			newNode.next=null;
			if(head==null){
				head = newNode;
				newNode.prev =null;
				return;
			}
			Node n = head;
			while(n.next != null)
			n=n.next;
				n.next=newNode;
				newNode.prev=n;
				
			
		}
		
		//delete Node
		void delete(Node key){
			if(head==null || key == null)
				return;
			
			if(head==key)
				head = key.next;
			if(key.next != null)
				key.next.prev=key.prev;
			if(key.prev !=null)
				key.prev.next=key.next;
			
		}
		
		
		
		
		
	
	
	
	public static void main(String arg[]){
		
		DoublyDemo d1 =new DoublyDemo();
		d1.insert(80);
		d1.insert(30);
		d1.insert(79);
		d1.insert(70);
		d1.display();
		d1.append(50);
		
		d1.display();
		
		d1.insterAfter(d1.head.next,10);
		d1.display();
		
		d1.delete(d1.head);
		d1.display();
		
		
		
	}
}