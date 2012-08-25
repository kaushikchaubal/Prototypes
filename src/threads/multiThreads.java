package threads;

import java.util.Scanner;


public class multiThreads implements Runnable{
	Thread t1 = new Thread(this);
	Thread t2 = new Thread(this);
	Thread t3 = new Thread(this);
	
	public static void main(String[] args){
		new multiThreads();
	}
	
	public multiThreads(){
		Scanner s = new Scanner(System.in);
		String z = s.nextLine();
		
		if(z.equals("1")){
			t1.start();
		}
		else if(z.equals("2")){
			t2.start();			
		}
		else if(z.equals("3")){
			t3.start();			
		}
	}

	public void run() {
		if(Thread.currentThread().equals(t1)){
			System.out.println("1 Selected");
		}
		else if(Thread.currentThread().equals(t2)){
			System.out.println("2 Selected");
		}
		else if(Thread.currentThread().equals(t3)){
			System.out.println("3 Selected");
		}
	}
}
