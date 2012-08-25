package company.questions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TwoSigma1 {

	public static void main(String[] args) {
		new TwoSigma1();
	}
	
	public TwoSigma1() {
		System.out.println("Enter Data: ");
		ArrayList<String> input = getInputData();
	
//		Initialize Extra Buffers
		int flag[] = new int[input.size()];
		ArrayList<String> stringArray = new ArrayList<String>();
		ArrayList<Integer> intArray = new ArrayList<Integer>();
		String[] output = new String[input.size()];
		
		try{
			splitInputData(input, stringArray, intArray, flag);
			mySort(stringArray, intArray);
			setOutputData(input, stringArray, intArray, flag, output);
			printOutput(output);
		}
		catch(Exception e){
			System.err.println("Invalid Input\nTRY AGAIN");
		}
	}

//	Getting user input
	private ArrayList<String> getInputData(){
		ArrayList<String> input = new ArrayList<String>();
		Scanner in  = new Scanner(System.in);
		in.useDelimiter("[\n]");
		String data = in.next();
		int oldIndex = 0;
		
		for(int i=0; i<data.length(); i++){
			if(data.charAt(i) == ' '){
				String temp = data.substring(oldIndex, i);
				oldIndex = i;
				oldIndex++;
				input.add(temp);
			}
			if(i == data.length()-1){
				String temp = data.substring(oldIndex, data.length()-1);
				input.add(temp);
			}
		}
		
		return input;
	}

//	Putting data in intArray, stringArray and setting the flag array
	private void splitInputData(ArrayList<String> input, ArrayList<String> stringArray, ArrayList<Integer> intArray, int[] flag){
		for(int i = 0; i<input.size(); i++){
			if(input.get(i).charAt(0)>= 65 && input.get(i).charAt(0)<=122){
				flag[i] = 1;
				stringArray.add(input.get(i));
			} else{
				flag[i] = 2;
				intArray.add(Integer.parseInt(input.get(i)));	
			}
		}
	}

//	Using inbuilt sorting algorithms to sort the Integers and the Strings
	private void mySort(ArrayList<String> stringArray, ArrayList<Integer> intArray){
		Collections.sort(intArray);
		Collections.sort(stringArray);
	}

//	Getting sorted data back into output array
	private void setOutputData(ArrayList<String> input, ArrayList<String> stringArray, ArrayList<Integer> intArray, int[] flag, String[] output){
		for(int i=0, j=0, k=0; i <input.size(); i++){
			if(flag[i] == 	1){
				output[i] = stringArray.get(j);
				j++;
			}
			else if(flag[i] == 2){
				output[i] = Integer.toString(intArray.get(k));
				k++;
			}
		}
	}
	
//	Printing the result to console
	private void printOutput(String[] output){
		System.out.println("\nSorted List: ");
		for(int i=0; i<output.length; i++)
			System.out.print(output[i] + " ");
	}
} 
