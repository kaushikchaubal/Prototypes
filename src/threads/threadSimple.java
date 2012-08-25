package threads;

public class threadSimple implements Runnable {

	public static void main(String[] args) {
		threadSimple r = new threadSimple();
		Thread t = new Thread(r);
		t.start();
		
		System.out.println("Thread 1");
		r.run();
	}


	public void run() {
		System.out.println("Thread 2");
	}

}
