package company.questions;

public class FizzBuzz {

	public static void main(String[] args) {
		new FizzBuzz();
	}
	
	public FizzBuzz(){
		for(int number = 0; number <= 100; number++){
			System.out.print(number); 
			if(number%3 == 0)
				System.out.print(": Fizz\n");
			
			if(number%5 == 0)
				System.out.print(": Buzz\n");
			
			else
				System.out.print("\n");
			
			
		}
	}

}
