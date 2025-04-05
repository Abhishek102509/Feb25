class BT{
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
   BT(){
	   root = null;
   }
   BT(int d){
	   root = new Node(d);
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
	   BT t1= new BT();
	   t1.root = new Node(79);
	   t1.root.left = new Node(20);
	   t1.root.right = new Node(89);
	   t1.root.left.right = new Node(90);
	   t1.root.left.left = new Node(30);
	   t1.root.right.left = new Node(23);
	   t1.root.right.right = new Node(24);
	   System.out.println("\n PreOrder\n");
	   t1.PreOrder(t1.root);
	   System.out.println("\n PostOrder\n");
	    t1.PostOrder(t1.root);
		System.out.println("\n InOrder\n");
		 t1.InOrder(t1.root);
	   
	   
	   
   }

}