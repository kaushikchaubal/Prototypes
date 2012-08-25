package string.operations;
import java.io.IOException;
import java.util.Stack;


public class ReverseLettersInWords {

	public static void main(String[] args) throws IOException {
		new ReverseLettersInWords();
	}
	
	public ReverseLettersInWords() throws IOException{
		System.out.println("Input Sentence");
		int count=0;
		char in[] = new char[100];
				
		for(int i=0; ;i++){
			in[i] = (char)System.in.read();
			count++;
			if(in[i] == '.') break;
		}
		
		char sentence[] = new char[count];		
		for(int i=0; i < sentence.length; i++){
			sentence[i] = in[i];
//			System.out.println(i + " -> " + sentence[i]);
		}

		Stack<Character> dump = new Stack<Character>();
		
		for(int i=0; i < sentence.length; i++){
			if(sentence[i] != ' ' && sentence[i] != '.'){
				dump.push(sentence[i]);
			}
			else{
				while(!dump.isEmpty()){
					System.out.print(dump.pop());
				}
				System.out.print(" ");
			}
		}
		
	}

}
