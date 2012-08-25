package company.questions;

public class LargestSequence {

	

	public static void main(String[] args) {
		new LargestSequence();
	}
	
	public LargestSequence() {

		int[] numberList={10, -20, 9, 8, 3, -12, 6, 3, 4, 1, -5, 3, -1};
		
		int globalMax,localMax;

		int startIndex=0; 
		int stopIndex=0;
		int index=0;

		globalMax = localMax = numberList[0];

		for(int i=1;i < numberList.length;i++) {
			if(localMax + numberList[i] > 0)
				localMax += numberList[i];
			else{
				index = i;
				localMax = numberList[i];
			}
			
			if(globalMax < localMax ){
					globalMax = localMax;
					startIndex = index;
					stopIndex = i;
			}
		}
		System.out.println("Start: " + startIndex + "\nStop: " + stopIndex + "\nMax: " + globalMax);		
	}

}
