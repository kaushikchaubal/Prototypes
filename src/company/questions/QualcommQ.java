package company.questions;

public class QualcommQ {

	public static void main(String[] args) {
		new QualcommQ();
	}
	
	public QualcommQ() {
		char[] arr = {'a', 'a', 'b', 'b', 'c', 'c', 'b', 'a', 'b'};
		char elem = 'b';
		int occurence = 3;
		
		int index1 = findInteratively(arr, elem, occurence);
		System.out.println(index1);
		int index2 = findRecursively(arr, elem, occurence, 0);
		System.out.println(index2);
	}

	private int findRecursively(char[] arr, char elem, int occurence, int index) {
		if(occurence == 0) return index-1;
		if(index == arr.length) return -1;
		
		if(arr[index] == elem) return findRecursively(arr, elem, --occurence, ++index);
		else return findRecursively(arr, elem, occurence, ++index);
		
	}

	public int findInteratively(char[] arr, char elem, int occurence) {
		int count = 0;
		int index = -1;
		
		for(int i=0; i<arr.length; i++){
			if(arr[i] == elem){
				count++;
				if(count == occurence){
					index = i;
					break;
				}
			}
		}
		return index;
		
	}


}
