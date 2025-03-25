package Day16;

class MyThread1 extends Thread{
	public void run() {
		for(int i= 1; i<10;i++) {
			
			System.out.println(i+"  "+Thread.currentThread().getName()+"  Start");
			
		}
		
	}
	
}



public class ThreadDemo3 {

	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1();
		t1.setName("T1");
		MyThread1 t2 = new MyThread1();
		t2.setName("T2");
		MyThread1 t3 = new MyThread1();
		t3.setName("T3");
		MyThread1 t4 = new MyThread1();
		t4.setName("T4");
		
	t1.start();
	t2.start();
	t3.start();
	try {
		t3.join();
		
	}catch( InterruptedException e) {
		e.printStackTrace();
	}
	System.out.println("  "+Thread.currentThread().getName()+"  After T3");
	
	
	t4.start();
	
	
	
	
	}

}
