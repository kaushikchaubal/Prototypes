package company.questions;

public class FibonacciInt {

	public static void main(String[] args) {
		new FibonacciInt();
	}

	public FibonacciInt() {
		int  s = 5;
		fib(8);
//		tryCatch();
	}
	
	public void fib(int s){
		int x=0, y=1, z;
		
		for(int i = 0; i <= s; i++)  
		  {  
		       z = x + y;  
		       x = y;  
		       y = z; 
		       System.out.print(z + " ");
		  }  
	}
	
	public void tryCatch(){
		try{
			throw new Exception();
		}
		catch(Exception e){
			System.out.println("hii");
		}
	}

}
