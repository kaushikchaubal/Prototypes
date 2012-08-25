package company.questions;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;


public class TruckArrange {

	public static void main(String[] args) {
		new TruckArrange();
	}
	
	public TruckArrange(){
		ArrayList<Integer> incomingTrucks =  new ArrayList<Integer>();
		ArrayList<Integer> mainStreet =  new ArrayList<Integer>();
		Stack<Integer> sideStreet = new Stack<Integer>();
		int numberOfTrucks, count = 1;
		String flag = null;
		
//		Inputs
		Scanner input = new Scanner(System.in);
		System.out.println("Enter total number of trucks:\n");
		numberOfTrucks = Integer.parseInt(input.next());
		
		System.out.println("Enter order of incoming trucks:\n");
		while(true){
			int data = Integer.parseInt(input.next());
			if(data != 0)	incomingTrucks.add(data);
			else	break;
		}

//		Check whether numberOfTrucks entered is same as the truck sequence
		if(incomingTrucks.size()!= numberOfTrucks){
			System.err.println("INVALID ENTRY");
			System.exit(1);
		}
		
//		Moving trucks either to mainStreet or sideStreet
		for(int i=0; i < numberOfTrucks; i++){
			if(incomingTrucks.get(i) == count){
				mainStreet.add(incomingTrucks.get(i));
				count++;
			}
			else{
				if(!sideStreet.isEmpty() && sideStreet.peek() == count)	
					mainStreet.add(sideStreet.pop());
				else sideStreet.push(incomingTrucks.get(i));
			}
		}
		
//		Move trucks from sideStreet to mainStreet
		while(!sideStreet.empty()){
			mainStreet.add(sideStreet.pop());
			count++;
		}

//		Check if the trucks on mainStreet is Sorted or no
		flag = isSorted(mainStreet);		
		System.out.println(flag);
	}
	
	public String isSorted(ArrayList<Integer> mainStreet){
		for(int i=0; i < mainStreet.size()-1; i++){
			if(mainStreet.get(i) > mainStreet.get(i+1)){
				return "no";
			}
		}
		return "yes";
	}
}

