package company.questions;
import java.io.IOException;
import java.util.ArrayList;


public class LcaseToUcase {

	public static void main(String[] args) throws IOException {
		new LcaseToUcase();

	}
	
	public LcaseToUcase() throws IOException {
		System.out.println("Enter the sentence: ");
		ArrayList<Character> oldList = new ArrayList<Character>();
		ArrayList<Character> newList = new ArrayList<Character>();
		
		while(true){
			char elem = (char) System.in.read();
			if(elem == '.') break;
			else{
				oldList.add(elem);
			}
		}
		
		for(int i=0; i<oldList.size(); i++){
			if((int) oldList.get(i) >= 97 && (int) oldList.get(i) <= 122)
				newList.add((char)((int) oldList.get(i) - 32));
			else
				newList.add(oldList.get(i));
		}
		
		System.out.println("old: " + oldList + "\nnew: " + newList);
	}

}
