package collections.operations;

public class ArrayPosNeg {
	
	public static void main(String[] args) {
		new ArrayPosNeg();
	}
	
	public ArrayPosNeg() {
		int[] arr = {1,4,-6,2,-5,8,-3,7,9};
		
		int pCount = 0;
		for(int i=0; i < arr.length; i++){
			if(arr[i] >= 0)
				pCount++;
		}

		int shiftCount = 0;
		int[] newArr = new int[arr.length];
		for(int i=0; i<arr.length; i++){
			if(arr[i] >= 0)
				newArr[i-shiftCount] = arr[i];
			else{
				newArr[pCount++] = arr[i];
				shiftCount++;
			}	
		}
		
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		
		System.out.println("\n");
		for(int i=0; i<newArr.length; i++)
			System.out.print(newArr[i] + " ");
		
	}



}
