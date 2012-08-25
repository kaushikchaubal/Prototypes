package company.questions;
import java.util.Scanner;


public class Factorial {


	public static void main(String[] args) {
		new Factorial();

	}
	
	public Factorial() {
		System.out.println("Enter number for Factorial");
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		
		System.out.println("Factorial: " + calcFact(number));
	}
	
	public int calcFact(int n){
		if(n <= 1) return 1;
		else
			return n * calcFact(n-1);
	}


}
