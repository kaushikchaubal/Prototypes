package string.operations;

public class reverseString2 {

	public static void main(String[] args){
		String s1 = "Poorva Rohit Kaushik Chaubal";
		String s2 = null;
		int temp = s1.length();
		
		for (int i=s1.length(); i>0; i--){
			if(s1.charAt(i-1)== ' '){
				
				s2 = s1.substring(i,temp);
				temp = i;
				System.out.print(s2 + " ");
			}
			if((i-1)==0){
				s2 = s1.substring(i-1,temp);
				System.out.print(s2 + " ");
			}
		}
		
		
	}
}
