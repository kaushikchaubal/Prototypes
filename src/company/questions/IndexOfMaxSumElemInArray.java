package company.questions;


public class IndexOfMaxSumElemInArray {

	public static void main(String[] args) {
		new IndexOfMaxSumElemInArray();

	}

	public IndexOfMaxSumElemInArray() {
		int temp = 0, index = -1;
		int[] arr1 = {1, 8, 4, 3};
		int[] arr2 = {1, 8, 4, 3, 5, 6, 7, 8};
		
		for(int i=0; i < ((arr1.length < arr2.length)?arr1.length:arr2.length); i++){
			if(arr1[i]+arr2[i] > temp){
				temp = arr1[i]+arr2[i];
				index = i;
			}				
		}
		
		System.out.println(index);
	}

}
