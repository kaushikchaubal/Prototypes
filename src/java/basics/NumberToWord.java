package java.basics;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumberToWord {
	Map<Integer, String> map = new HashMap<Integer, String>();
	int count;

	public static void main(String[] args) {
		
		new NumberToWord();
	}
	
	public NumberToWord() {
		map.put(0, "zero");
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
		map.put(5, "five");
		map.put(6, "six");
		map.put(7, "seven");
		map.put(8, "eight");
		map.put(9, "nine");
		
		System.out.println("Enter Data: ");
		int data = inputNumber();
		
		breakElements(data);
	}
	
	public int inputNumber(){
		return (new Scanner(System.in)).nextInt();
	}

	public void breakElements(int data){
		if(data < 10){
			System.out.print(data + " ");
			printNumber(data);
			printValue();
		}
			
		else{
			breakElements(data/10);
			System.out.print(data%10 + " ");
			printNumber(data%10);
		}
	}
	
	public void printNumber(int data){
		System.out.print(map.get(data)+ " ");
	}
	
	public void printValue(){
		
	}

}
