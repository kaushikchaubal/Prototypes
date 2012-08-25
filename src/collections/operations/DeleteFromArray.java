package collections.operations;

public class DeleteFromArray {
	
	public static void main(String[] args){
		new DeleteFromArray();
	}
	
	public DeleteFromArray(){
		int[] arr = {1,4,2,5,7,8};

		deleteElem(arr, 1);
		for(int i=0; i < arr.length; i++)
			System.out.print(arr[i] + " ");		
		
	}
	
////	hacky approach
//	public int[] deleteElem(int[] arr, int elem){
//		int flag = 0;
//		for(int i=0; i < arr.length; i++){
//			if(arr[i] == elem){
//				arr[i] = arr[arr.length-1];
//				flag = 1;
//			}
//		}
//		
//		if(flag == 0) return arr;
//		else{
//			int[] temp = new int[arr.length-1];
//		
//			for(int i=0; i < temp.length; i++){
//				temp[i] = arr[i];
//			}	
//		return temp;
//		}
//	}
	
//	better approach
	public void deleteElem(int[] arr, int elem){
		int count=0;
		for(int i=0; i < arr.length; i++){
			if(arr[i] == elem){
				arr[i] = -100;
			}
			else count++;
		}
		
		int[] temp = new int[count];
		for(int i=0, j=0; i < arr.length && j<count; i++, j++){
			if(arr[i] != -100){
				temp[j] = arr[i]; 
			}
			else j--;
		}
	}
}
