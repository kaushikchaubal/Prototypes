package collections.operations;
import java.util.Stack;


public class SortStack {

	public static void main(String[] args) {
		new SortStack();
	}

	public SortStack() {
		Stack<Integer> OrigStack = new Stack<Integer>();
		Stack<Integer> NewStack = new Stack<Integer>();
		
		OrigStack.push(2);
		OrigStack.push(6);
		OrigStack.push(5);
		OrigStack.push(1);
		OrigStack.push(3);
		
		NewStack.push(OrigStack.pop());

		while(!OrigStack.isEmpty())
		{
		int val = OrigStack.pop();
		while(NewStack.peek() < val) {
			System.err.print("?");
		OrigStack.push(NewStack.peek());
		}
		NewStack.push(val);
		}

		OrigStack = NewStack;
		
		System.out.println(OrigStack);
	}

}
