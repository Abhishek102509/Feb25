package Day16;

class MyThread extends Thread{
    public void run() {
		for(int i = 0; i<5; i++) {
			System.out.println(i+" :j"
					+ "+"
					+ "34 "+Thread.currentThread().getName());
		}
	}
	
}
public class ThreadDemo1 {
	public static void main(String args[]) {
		MyThread t1 = new MyThread(); 
		t1.setName("T1");
		t1.start();
	}

}
