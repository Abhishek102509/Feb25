class Node{
	char data;
	Node next;
	
	Node(char d){
		this.data=d;
		this.next=null;
	}
}

	class Bracket{
		Node start;
		Bracket(){
			this.start=null;
		}
		boolean isEmpty(){
			return start == null;
		}
		
		void push(char data){
			Node newNode = new Node(data);
			newNode.next = start;
			start=newNode;
		}
		
		void pop(){
			if(isEmpty()){
				System.out.print("Stack is overflor");
				return;
			}
			else{
				Node temp = start;
				start = start.next;
				temp.next=null;
				temp=null;
				
			}
		}
		
		char peek(){
			if(! isEmpty()){
				return start.data;
			}
			else{
				System.out.print("Stack underflow");
				return '\0';
			}
		}
		
	}
	



class BracketDemo{
	public static void main(String arg[]){
	  Bracket b1= new Bracket();
	  
	String s ="[";
	  char c[] = s.toCharArray();
	  int l = c.length;
	  for(int i =0;i<l;i++){
		  if(c[i]== '{' || c[i]== '[' || c[i]== '('){
			  b1.push(c[i]);
	  }else if (c[i]== '}' || c[i]== ']' || c[i]== ')'){
	  if(
	    (c[i]=='}' && b1.peek() != '{') ||
		(c[i]==']' && b1.peek() != '[') ||
		(c[i]==')' && b1.peek() != '(')
		){
			System.out.println("balanced naa Haw");
			return ;
		}
		  b1.pop();
	  }
	  }
	  if(b1.isEmpty()){
		  System.out.println("Brackets are balanced!");
	  }else{
		  System.out.println("Brackets are not balanced!");
	  }
	}

}