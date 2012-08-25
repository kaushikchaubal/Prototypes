package collections.operations;

public class InsertInSortedArray {

	public static void main(String[] args) {
		new InsertInSortedArray();
	}

	public InsertInSortedArray() {
		int[] arr = {10, 20, 30, 50, 60, 70, 80};
		
		arr = insert(arr, 20);
		
		for(int i =0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
	}
	
	public int[] insert(int[] arr, int elem){
		int[] temp = new int[arr.length+1];
		int index = arr.length;
		
		for(int i=0; i<arr.length; i++){
			if( arr[i] > elem){
				index = i;
				break;
			}
		}
			
		for(int i=0, j=0; i<arr.length+1; i++, j++){
			if(i == index){
				temp[j] = elem;
			}
			else if(i < index)
				temp[j] = arr[i];
			else
				temp[j] = arr[i-1];
			
				
		}
			
		return temp;
		
	}

}
