class BST{
	Node root;
   
   static class Node{
	   int data;
	   Node left;
	   Node right;
	   
	   Node(int d){
		   this.data= d;
		   left= right=null;
		   
	   }
   }
   BST(){
	   root = null;
   }
   BST(int d){
	   root = new Node(d);
   }
   
   //Insert
   
   Node insertData(Node root, int key){
	   if(root == null){
		  root= new Node(key);
		   return root;
	   }
	   if(key<=root.data)
		   root.left = insertData(root.left,key);
	   else
		   root.right = insertData(root.right,key);
	   return root;
   }
   void insert(int key){
	   root = insertData(root,key);
   }
   
   Node deleteData(Node root,int key){
	   if(key < root.data)
		   root.left = deleteData(root.left,key);
	   else if(key > root.data)
		   root.right=deleteData(root.right,key);
	   else
	   {
		if(root.left==null)
			return root.right;		
		   if(root.right==null)
			   return root.left;
		   
		   root.data =minValue(root.right);
		   root.right= deleteData(root.right,root.data);
	   }
	   return root;
   }
   
   
   int minValue(Node root){
	   int x = root.data;
	   while(root.right != null){
		  x= root.left.data;
		   root= root.left;
	   }
	   return x;
   }
   
   void delete(int key){
	   root = deleteData(root,key);
   }
   
   
   
   
   
   
   //Preorede travers root ,lc,rc
   void PreOrder(Node n){
	   if(n==null)
		   return;
	   System.out.print(n.data+" --> ");
	   PreOrder(n.left);
	   PreOrder(n.right);
   }
   //inorder lc root rc
   void InOrder(Node n){
	   if(n== null)
		   return;
	   InOrder(n.left);
	   System.out.print(n.data+" --> ");
	   InOrder(n.right);
   }
   //Post order lc rc Root
   void PostOrder(Node n){
	   if(n==null)
		   return;
	   PostOrder(n.left);
	   PostOrder(n.right);
	   System.out.print(n.data+ " --> ");
   }
    
   
  
   
   
   
   public static void main(String arg[]){
	   BST t1= new BST();
	   /*t1.root = new Node(79);
	   t1.root.left = new Node(20);
	   t1.root.right = new Node(89);
	   t1.root.left.right = new Node(90);
	   t1.root.left.left = new Node(30);
	   t1.root.right.left = new Node(23);
	   t1.root.right.right = new Node(24);
	   */
	    t1.insert(69);
	    t1.insert(64);
		t1.insert(6);
		t1.insert(65);
		t1.delete(6);
	 
	   System.out.println("\n PreOrder\n");
	   t1.PreOrder(t1.root);
	   System.out.println("\n PostOrder\n");
	    t1.PostOrder(t1.root);
		System.out.println("\n InOrder\n");
		 t1.InOrder(t1.root);
	  //t1.insert(69);
	  
	  
	  
	   
	   
   }

}