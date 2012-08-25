package java.basics;

public class WideningConversions {


	public static void main(String[] args) {
		new WideningConversions(); 
	}
	

	public WideningConversions() {
		String s = "Yash";
		
		Object obj;
		
		obj = s;
		s = "Kaushik";
		System.out.println(s);
		System.out.println(obj);
	}

}
