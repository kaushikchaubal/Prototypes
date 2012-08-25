package company.questions;

public class GoogleQuestion2 {

	public static void main(String[] args) {
		new GoogleQuestion2();

	}

	public GoogleQuestion2() {
		String[] arr = {"01", "10", "0", "110"};
		int X = 3, Y = 4;
		
		int xCount=0, yCount=0;
		int index = 0, flag = 0;
		
		for(int i=0; i<arr.length; i++){
			for(int j=0; j < arr[i].length(); j++){
				if((int)arr[i].charAt(j)-48 == 0){
					xCount++;
				}
				if((int)arr[i].charAt(j)-48 == 1){
					yCount++;
				}
				if(xCount == X && yCount == Y){
					flag = 1;
					index = i;
					break;
				}
			}
			
			if(flag == 1){
				break;
			}
		}
		
		System.out.println("Index: " + index);
	}

}
