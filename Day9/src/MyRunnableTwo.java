
class MyRunnable implements Runnable{
	public void run() {
		System.out.println("run");
		first();
	}
	public void first() {
		System.out.println("first");
		second();
	}
	public void second() {
		System.out.println("second");
	}
}


public class MyRunnableTwo {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+ " start");
		Runnable r = new MyRunnable();
		Thread myThread = new Thread(r);
		myThread.start();
		try {  
			myThread.join();
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " end");
		
	}
}