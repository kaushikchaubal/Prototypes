package collections.operations;
import java.util.ArrayList;
import java.util.Scanner;


public class SplitNumbersLetters {

	public static void main(String[] args) {
		new SplitNumbersLetters();

	}

	public SplitNumbersLetters() {
		System.out.println("Enter numbers: ");
		Scanner in = new Scanner(System.in);
		ArrayList<Object> list = new ArrayList<Object>();
		ArrayList<Integer> intList = new ArrayList<Integer>();
		ArrayList<Character> charList = new ArrayList<Character>();
		
		for(int i=0; i<5; i++){
			Object elem = in.next();
//			if(elem == "0") break;
			list.add(elem);
		}
		
		
	
		for(int i = 0; i<list.size(); i++){
			if(((String)list.get(i)).charAt(0) >= 'A' && ((String)list.get(i)).charAt(0) <= 'z' )
				charList.add(((String)list.get(i)).charAt(0));
			else
				intList.add(Integer.parseInt(((String)list.get(i))));
			
				
		}
		
		System.out.println("List: " + list);
		System.out.println("IntList: " + intList);
		System.out.println("CharList: " + charList);
		
	}

}
