package Day16;

class AddRun implements Runnable{
	public void run() {
		int sum = 0;
		for(int i =0;i<5;i++) {
			sum +=i;
		}
		System.out.println(sum +" " +Thread.currentThread().getName());
		
	}
}

class MulRun implements Runnable{
	public void run() {
		int res = 1;
		for(int i =1;i<5;i++) {
			res *=i;
		}
		System.out.println(res +" " +Thread.currentThread().getName());
		
	}
	}
	



public class ThreadDemo2 {

	public static void main(String[] args) {
		Thread t1 = new Thread( new AddRun());
		t1.setName("T1");
        t1.start();
        Thread t2 = new Thread( new MulRun(),"T2");
   	       t2.start();
   	       
   	       
   	       //using Anonymous 
   	       
   	       Thread t3 = new Thread(() ->{
   	    	   
   	    	   int res =0;
   	    	   for(int i= 1;i<10;i++) {
   	    		   if (i%2==0) {
   	    			   res+=i;
   	    		   }
   	    	   }
   	    	   System.out.println(res+""+Thread.currentThread().getName()+" T3");
   	    	   
   	       });
   	       t3.start();
   	    Thread t4 = new Thread(() ->{
	    	   
	    	   int res =0;
	    	   for(int i= 1;i<10;i++) {
	    		   if (i%2!=0) {
	    			   res+=i;
	    		   }
	    	   }
	    	   System.out.println(res+""+Thread.currentThread().getName()+" T4");
	    	   
	       });
	       t4.start();
   	       
	}

}
