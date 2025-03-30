class LinkListQ2{
   
   
   Node start;
    static class Node{
	   int data;
	   Node next;
	   Node(int d){
		   this.data = d;
		   this.next=null;
	   }
	   
   }
   void display(){
	   Node n = start;
	   while(n !=null){
		   System.out.print(n.data+"-->");
		   n=n.next;
		   
	   }
	   
   }
   
   void insert(int NewData){
	   Node NewNode = new Node(NewData);
	   NewNode.next = start;
	   start = NewNode;
	   
   }
   void deleteNode(int key){
	   Node temp =start, prev =null;
	if(temp != null && temp.data == key){
		start =temp.next;
		return ;
	}	   
	while(temp !=null && temp.data == key ){
		prev = temp.next;
		temp = temp.next;
	}
	 if(temp == null)
		 return;
		 
		 
	 
	 prev.next= temp.next;
	   
   }




public static void main(String arg[]){
	LinkListQ2 l1 =new LinkListQ2();
	
	l1.insert(20);
	l1.insert(60);
	l1.insert(30);
	l1.insert(10);
	l1.display();
	
	System.out.println("\n");
	
	l1.deleteNode(30);
	
	
	

}

}