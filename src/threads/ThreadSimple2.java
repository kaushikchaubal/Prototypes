package threads;

public class ThreadSimple2 implements Runnable {

	boolean flag = false;
	
	public static void main(String[] args) throws InterruptedException {
		ThreadSimple2 r = new ThreadSimple2();
		r.methodCall();
	}

	public void methodCall() throws InterruptedException{
		
		Thread t = new Thread(this);
		t.start();
		
		System.out.println("Thread 1");
		Thread.sleep(1);
		flag = true;
		run();
	}
	
	public void run() {
		if(!flag)
		System.out.println("Thread 2");
		else if(flag){
			System.out.println("Thread 1 is over");
		}
	}

}
