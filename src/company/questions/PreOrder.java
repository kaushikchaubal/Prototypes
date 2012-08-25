package company.questions;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PreOrder {

	public static void main(String[] args) {
		new PreOrder();
	}
	
	public PreOrder(){
		Queue<Integer> numberQ = new LinkedList<Integer>();
		Queue<Character> operandQ = new LinkedList<Character>();
		
		System.out.println("Enter the Operation");
		Scanner input = new Scanner(System.in);
		String operation = input.next();

		for(int i = 0; i < operation.length(); i++){
			if(operation.charAt(i) == '+' || operation.charAt(i) == '-' ){
				operandQ.add(operation.charAt(i));
			}
			else 
				numberQ.add(Character.getNumericValue(operation.charAt(i)));
		}
		
		while(!operandQ.isEmpty()){
			System.out.println(operandQ.poll());
		}
		while(!numberQ.isEmpty()){
			System.out.println(numberQ.poll());
		}
		
		
		
		
	}

}
