package collections.operations;
import java.util.HashMap;


public class SearchArrInArr {

	public static void main(String[] args) {
		new SearchArrInArr();
	}


	public SearchArrInArr() {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		long start = System.nanoTime();
		int[] fixedArray = {1,5, 9, 3, 7};
		for(int i=0; i<fixedArray.length; i++){
			map.put(hashCalc(fixedArray[i]), fixedArray[i]);
		}
		
		int[] newArray = {1, 5, 100, 3};
		for(int i=0; i<newArray.length; i++){
			if(map.get(hashCalc(newArray[i]))!=null)
				System.out.print(map.get(hashCalc(newArray[i])) + " ");
		}
		long end = System.nanoTime() - start;
		System.out.println("\n" + end);
	}
	
	public int hashCalc(int val){
		int hash=0;
		
		hash += val;
		
		return hash%256;
	}

}
