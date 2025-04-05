import java.util.Scanner;

class Node{
	String name;
	String num;
	Node next;
	
	Node(String name,String num){
		this.num=num;
		this.name=name;
		this.next= null;
	}
}
 
 class LinkedList{
	 Node start ;
	 
	 void addContect(String name,String num){
		 
		 Node new_node = new Node( name , num);
		 new_node.next =start;
		 start=new_node;
	 }
	 
	 
	 void display(){
		
		Node n = start;
		while(n != null){
			System.out.println("Name: "+n.name+"\n"+"Phone: "+n.num);
			//System.out.println(n.name+" "+n.num);
			n=n.next;
		}
	}
	 
	 
	 void search(String key){
		 Node n =start;
		 while(n != null){
			 if(n.name.equals(key) ){
				 System.out.println("Contect found "+n.name+" ,"+n.num);
                 return;
			 }
			 n =n.next;
			 //System.out.println("Not found"); 
		 } 
		 System.out.println("Not found");
		 
	 }
	 
	 void delete(String key){
		Node temp =start, prev=null;
		 if(temp != null && temp.name == key){
			 start = temp.next;
			 return;
		 }
		 while(temp !=null && temp.name != key){
			 prev = temp.next;// Store the current node
			 temp=temp.next;// Move to the next node
		 }
		 if(temp == null) // If the key is not found, return

			 return;
		 prev.next =temp.next;// Update the link to remove the node

	 }

 }
 

class Contect{

	
	public static void main(String agr[]){
		LinkedList l1 = new LinkedList();
		Scanner sc = new Scanner(System.in);
		
		int choice;

		
		do{
			System.out.println("\nMenu:");
            System.out.println("1. Add Contact");
            System.out.println("2. Display All Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
			 choice = sc.nextInt();
            sc.nextLine(); // Consume the newline character
            
			switch (choice) {
				
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter phone number: ");
                    String num = sc.nextLine();
                    l1.addContect(name, num);
                    System.out.println("Contact added successfully.");
                    break;
				case 2:
                    l1.display();
                    break;

                case 3:
                    System.out.print("Enter name to search: ");
                    String searchKey = sc.nextLine();
                    l1.search(searchKey);
                    break;
				case 4:
                    System.out.print("Enter name to delete: ");
                    String deleteKey = sc.nextLine();
                    l1.delete(deleteKey);
                    System.out.println("Contact deleted successfully (if it existed).");
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;
					default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 5);

        //sc.close()



	//	}
		
		
		/*
		l1.addContect("Abhishek" ,"123456789");
		l1.addContect("Abhi" ,"123456789");
		l1.addContect("Adarsh" ,"123456789");
		l1.addContect("kk" ,"123456789");
		l1.display();
		
		System.out.println("\n");
		l1.search("Abhishek");
		l1.search("Abhi");
		System.out.println("\n");
		
		l1.delete("kk");
		System.out.println("\n");
		l1.display();
		
		System.out.println("\n");
		l1.search("Abhi");
		*/
		
	}
}