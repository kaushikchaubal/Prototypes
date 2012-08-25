package company.questions;

import java.util.ArrayList;
import java.util.Stack;

public class GoogleQuestion3 implements Cloneable{
	Stack<Integer> stack = new Stack<Integer>();
	ArrayList<ArrayList<Integer>> version = new ArrayList<ArrayList<Integer>>();
	ArrayList<Integer> temp = new ArrayList<Integer>();

	public static void main(String[] args) {
		new GoogleQuestion3();
	}

	public GoogleQuestion3() {
		
		//push 1
		myPush(1);
		
		//push 2
		myPush(2);
		
		//pop 2
		int val = myPop();
		
		//push 3
		myPush(3);
		System.out.println(version);
//		printVersion(0);
	}
	
	public void myPush(int val){
		
		stack.push(val);
		temp.add(val);
		temp = (ArrayList<Integer>) temp.clone();
		version.add(temp);
	}
	
	public int myPop(){
		int val = stack.pop();
		temp.remove(temp.size()-1);
		temp = (ArrayList<Integer>) temp.clone();
		version.add(temp);
		return val;
	}
	
	public void printVersion(int index){
		System.out.println(version.get(index));
	}

}
