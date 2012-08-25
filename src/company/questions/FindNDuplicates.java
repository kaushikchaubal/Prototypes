package company.questions;
import java.util.ArrayList;
import java.util.Scanner;


public class FindNDuplicates {


	public static void main(String[] args) {
		new FindNDuplicates();
	}
	
	public FindNDuplicates() {
		System.out.println("Enter numbers");
		ArrayList<Integer> arr =  new ArrayList<Integer>();
		ArrayList<Integer> duplicates =  new ArrayList<Integer>();
		Scanner in  = new Scanner(System.in);
		
		while(true){
			int elem = in.nextInt(); 
			if(elem == 0) break;
			else arr.add(elem);
		}
		
		boolean[] flag = new boolean[arr.size()];

		for(int i=0; i<arr.size(); i++){
			if(!flag[arr.get(i)]) flag[arr.get(i)] = true;
			else duplicates.add(arr.get(i));
		}
		
		System.out.println("Duplicates: " + duplicates);
			
	}


}
