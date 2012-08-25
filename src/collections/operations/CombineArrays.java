package collections.operations;

public class CombineArrays {

	public static void main(String[] args) {
		new CombineArrays();
	}

	public CombineArrays() {
		int[] arr1 = {1,2,3};
		int[] arr2 = {4,5,6};
		
		int[] arr3 = add(arr1, arr2);
		
		for(int i=0; i<arr3.length; i++){
			System.out.print(arr3[i] + " ");
		}
	}

	private int[] add(int[] arr1, int[] arr2) {
		int[] temp = new int[arr1.length+arr2.length];
		
		for(int i =0; i < arr1.length; i++)
			temp[i] = arr1[i];
		
		for(int i = arr1.length, j=0; i < (arr1.length+arr2.length); i++, j++)
			temp[i] = arr2[j];
		
		return temp;
	}
	

}
