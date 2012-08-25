package threads;

public class threadSimple2 implements Runnable {

	boolean flag = false;
	
	public static void main(String[] args) throws InterruptedException {
		threadSimple2 r = new threadSimple2();
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
