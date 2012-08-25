package company.questions;
import java.util.HashMap;
import java.util.Scanner;

public class TwoSigma2 implements Cloneable{

	public static void main(String[] args) {
		new TwoSigma2();
	}

	public TwoSigma2() {
		System.out.println("Enter Data: ");
		String[] data = getInputData();
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		makeUniqueMap(map, data);
		
		findMissingElements(map, data);	
	}

//	Getting user input
	private String[] getInputData() {
		Scanner in  = new Scanner(System.in);
		
		int nCount = in.nextInt();
		String[] data = new String[nCount];
		Scanner in2  = new Scanner(System.in);
		in2.useDelimiter("[\n]");
		for(int i=0; i< nCount; i++){
			String temp = in2.next(); 
			data[i] = temp.substring(0, temp.length()-1);
		}
		return data;
	}

//	Initialize and make UniqueMap 
	private void makeUniqueMap(HashMap<Integer, Integer> map, String[] data) {
		for(int i=0; i< data.length; i++){
			for(int j=0; j< data[i].length(); j=j+2){
				if(!map.containsKey((int) data[i].charAt(j)-48)){
					map.put((int) data[i].charAt(j)-48, i);
				}
			}
		}
	}
	
//	Match and print
	private void findMissingElements(HashMap<Integer, Integer> map, String[] data) {
		System.out.println("\nOutput: ");
		int count=0;
		for(int i=0; i< data.length; i++){
			for (int key : map.keySet()) {
				count = 0;
				for(int j = 0; j <data[i].length(); j=j+2){
					if((int)data[i].charAt(j)-48 != key){
						count= count+1;
						if(count == (data[i].length()/2)+1){
							System.out.print(key + " ");
							System.out.print(map.get(key)+1 + " ");
							System.out.print(i+1 + "\n");
							count = 0;
						}
					}
				}	
			}
		}		
		System.out.println("DONE");		
	}
}
