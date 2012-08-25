package string.operations;

public class reverseString {

	public static void main(String[] args){
		String s1 = "Poorva";
		StringBuffer s2 = new StringBuffer();
		System.out.println(s1.length());
		for (int i=s1.length(); i>0; i--){
			s2.append(s1.charAt(i-1));
		}
		System.out.println(s2);
		
	}
}
