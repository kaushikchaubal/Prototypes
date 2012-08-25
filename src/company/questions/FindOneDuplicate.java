package company.questions;
import java.util.ArrayList;
import java.util.Scanner;


public class FindOneDuplicate {



	public static void main(String[] args) {
		new FindOneDuplicate();
	}
	
	public FindOneDuplicate() {
		System.out.println("Enter numbers");
		ArrayList<Integer> arr =  new ArrayList<Integer>();
		Scanner in  = new Scanner(System.in);
		
		while(true){
			int elem = in.nextInt(); 
			if(elem == 0) break;
			else arr.add(elem);
		}
		
		int MAX = arr.get(arr.size()-1);
		int expectedSum = MAX*(MAX+1)/2;
		int calculatedSum = getSum(arr);
		
		int duplicate = calculatedSum - expectedSum;
		System.out.println("Duplicate: " + duplicate);
	}
	
	public int getSum(ArrayList<Integer> arr){
		int sum = 0;
		for(int i=0; i< arr.size(); i++){
			sum += arr.get(i);
		}
		return sum;
	}

}
