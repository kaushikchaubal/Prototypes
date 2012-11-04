package threads;

public class ThreadSimple implements Runnable {

	public static void main(String[] args) {
		ThreadSimple r = new ThreadSimple();
		Thread t = new Thread(r);
		t.start();
		
		System.out.println("Thread 1");
		r.run();
	}


	public void run() {
		System.out.println("Thread 2");
	}

}
