package collections.operations;
import java.util.ArrayList;
import java.util.Scanner;


public class AlternateCopy {

	public static void main(String[] args) {
		new AlternateCopy();

	}

	public AlternateCopy() {
		System.out.println("Enter numbers: ");
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> oddList = new ArrayList<Integer>();
		ArrayList<Integer> evenList = new ArrayList<Integer>();
		
		while(true){
			int elem = in.nextInt();
			if(elem == 0) break;
			list.add(elem);
		}
	
		for(int i = 0; i<list.size(); i++){
			if(i%2==0) evenList.add(list.get(i));
			else oddList.add(list.get(i));
		}
		
		System.out.println("List: " + list);
		System.out.println("OddList: " + oddList);
		System.out.println("EvenList: " + evenList);
		
	}

}
