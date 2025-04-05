import java.util.Scanner;

class BrowserHist{
	Node head,tail,current;
	class Node{
		String url;
		Node prev;
		Node next;
		
		Node(String url){
			this.url=url;
			next=null;
			prev=null;
		}
	}
	boolean visitPage(String url){
		Node new_node=new Node(url);
		if(head == null){
			head=tail=current=new_node;
			return true;
		}
		current.next=new_node;
		new_node.prev=current;
		current=new_node;
		tail=new_node;
		return true;
	}													
	void moveForward(){
		if(current != null && current.next != null){
			current=current.next;
			System.out.println("Moved to next page: "+current.url);
		}
		else{
			System.out.println("No page available after this!!");
		}
	}
	void moveBackward(){
		if(current != null && current.prev != null){
			current=current.prev;
			System.out.println("Moved to previous page: "+current.url);
		}
		else{
			System.out.println("No page available before this!!");
		}
	}
	void clearHistory(){
		head=tail=current=null;
		System.out.println("History cleared !!");
	}
	void displayCurrentPage(){
		if(current != null){
			System.out.println(current.url);
		}
		else{
			System.out.println("No page visited yet !!");
		}
	}
	void display(){
		Node n=head;
		if(n == null){
			System.out.println("No page exist !!");	
		}
		else{
			System.out.println("All Pages visited:");
		while(n != null){
			System.out.println(n.url);
			n=n.next;
		}
		}
		
		
	}

}
class BrowserHistDemo{
	public static void main(String[] args){
		BrowserHist b=new BrowserHist();
		Scanner sc=new Scanner(System.in);
		
		while(true){
			System.out.println("\nChoose an option: ");
			System.out.println("1. Visit web page ");
			System.out.println("2. Move to Backward page");
			System.out.println("3. Move to Forward page");
			System.out.println("4. Display Current Page");
			System.out.println("5. Clear History");
			System.out.println("6. List out all pages visited");
			System.out.println("7. Exit");
			
			System.out.println("Enter choice: ");
			int choice=sc.nextInt();
			sc.nextLine();
			
			switch(choice){
				case 1:
					System.out.println("Enter url: ");
					String url=sc.nextLine();
					if(b.visitPage(url) == false){
						System.out.println("Error !!");
					}
					else{
						System.out.println("Visited: "+url);
					}
					break;
				case 2:
					b.moveBackward();
					break;
				case 3:
					b.moveForward();
					break;
				case 4:
					b.displayCurrentPage();
					break;
				case 5:
					b.clearHistory();
					break;
				case 6:
					b.display();
					break;
				case 7:
					System.out.println("Exited !!!");
					return;
				default:
					System.out.println("Invalid input !!");
			}
			
			
		}
	
	
	

	}
}