package company.questions;
import java.io.IOException;
import java.util.Scanner;


public class Fibonacci {

	public static void main(String[] args) throws IOException {
		new Fibonacci();
	}
	
	public Fibonacci() throws IOException{
		System.out.println("Enter number for Fibonnaci number");
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		
		for(int i=1; i <= number; i++){
			System.out.print(getFibSeq(i) + " ");
		}
	}
	
	public int getFibSeq(int n){
		if(n < 2) return n;
		else return getFibSeq(n-1) + getFibSeq(n-2);
	}

}
