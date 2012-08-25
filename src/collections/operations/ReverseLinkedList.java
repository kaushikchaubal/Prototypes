package collections.operations;
import java.util.LinkedList;
import java.util.Stack;


public class ReverseLinkedList {

	public static void main(String[] args) {
		new ReverseLinkedList();

	}

	public ReverseLinkedList() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		Stack<Integer> stack =  new Stack<Integer>();
		
		for(int i = 0; i<5; i++) 
			list.add(i+1);
		
		for(int i =0; i < list.size(); i++) 
			stack.push(list.get(i));
		
		while(!stack.isEmpty()) 
			System.out.print(stack.pop() + " ");
	}
	
//	void reverse(Node head){
//		Node n=head.next;
//		Node previous= head;
//
//		while(n!=null)
//		{ Node a= n.next;
//		n.next=previous;
//		previous=n;
//		n=a;
//	}

}
