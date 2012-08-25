package collections.operations;
import java.util.Stack;


public class QueueFromStacks {
	Stack<Integer> main = new Stack<Integer>();
	Stack<Integer> temp = new Stack<Integer>();
	
	public static void main(String[] args) {
		new QueueFromStacks();
	}

	public QueueFromStacks() {
		addInQueue(1);
		addInQueue(2);
		addInQueue(3);
		addInQueue(4);
		addInQueue(5);
		addInQueue(6);
		
		int size = main.size();
		for(int i=0; i < size; i++)
			System.out.print(DeQueue() + " ");
		
	}
	
	public void addInQueue(int val){
		main.push(val);
	}
	
	public int DeQueue(){

		while(main.size() > 1){
			temp.push(main.pop());
		}
		int elem = main.pop();
		
		while(!temp.isEmpty())
			main.push(temp.pop());
		
		return elem;
	}
}
