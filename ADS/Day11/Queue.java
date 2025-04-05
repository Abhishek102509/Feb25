class Queue{
	int size=5;
	int arr[] = new int[size];
	int rear,front;
	
	Queue(){
		rear=-1;
		front= -1;
	}
	boolean isEmpty()
	{
		if(front==-1)
		{
			return true;
			
		}else
		{
			return false;
		}
		
	}
	boolean isfull(){
		if(front==0 &&rear ==size-1)
		{
			
			return true;
		}else
		{
			return false;
		}
	}
	
	void enqueue(int x){
		if(isfull()){
			System.out.println("Size is full");			
		}else{
			if(front == -1)
				front =0;
			front++;
			arr[front]=x;
			System.out.println("Element added "+x);
			
		}
		
	}
	
	int dequeue(){
		int x;
		if(isEmpty())
		{
			System.out.println("Empty");	
			return -1;
		 }else
		 {
			x= arr[front];
		 if(front>=rear)
		 {
			rear =-1;
			front=-1;
		 }else
		 {
			front++;
		 }
		 System.out.println("deleted-->"+x);	
		  return x;
		}
	}
	
	
	void display(){
		if(isEmpty()){
			System.out.println("Empty");
		}else{
			for(int i =front;i<rear;i++){
			System.out.println(arr[i]);
			}
		}
	}
	
	
	
	
	
	public static void main(String arg[]){
		
		Queue q1= new Queue();
		
		
		//q1.display();
		
		q1.enqueue(12);
		q1.enqueue(12);
		q1.enqueue(15);
		q1.enqueue(12);
		q1.enqueue(19);
		
		q1.display();
		
		q1.dequeue();
		q1.display();
		
		
		
	}

}