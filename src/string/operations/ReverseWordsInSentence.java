package string.operations;
import java.util.Scanner;
import java.util.Stack;

public class ReverseWordsInSentence {

	public static void main(String[] args) {
		new ReverseWordsInSentence();
	}
	
	public ReverseWordsInSentence(){
		System.out.println("Input Sentence");
		Scanner in = new Scanner(System.in);
		String[] input = new String[3];
		       
		for(int i=0; i<input.length ;i++){
			input[i] = in.next();
		}
		
		Stack<String> dump = new Stack<String>();
		for(int i=0; i<input.length ;i++){
			dump.push(input[i]);
		}
		
		while(!dump.isEmpty())
			System.out.print(dump.pop() + " ");
		
	}

}



