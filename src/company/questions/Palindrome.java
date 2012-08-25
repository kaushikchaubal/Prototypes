package company.questions;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class Palindrome {

	public static void main(String[] args) throws IOException {
		new Palindrome();
	}

	public Palindrome() throws IOException {
		Stack<Character> stack = new Stack<Character>();
		Queue<Character> queue =  new LinkedList<Character>();
		int flag=0;
		
		while(true){
			char elem = (char) System.in.read();
			if(elem == '.') break;
			else if(elem == ' ');
			else{
				stack.push(elem);
				queue.add(elem);
			}
		}

		while(!stack.isEmpty()){
			if(stack.pop() != queue.poll()){ 
				flag=1;
				break;
			}
		}
		
		if(flag==1)
			System.out.println("NOT A PALINDROME");
		else
			System.out.println("PALINDROME");
	}

}
