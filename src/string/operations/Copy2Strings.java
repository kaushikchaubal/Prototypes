package string.operations;

public class Copy2Strings {

	public static void main(String[] args) {
		new Copy2Strings();
	}

	public Copy2Strings() {
		String a = "hello";
		String b = " world";
		
		String c = add(a,b);
		System.out.println(c);
	}
	
	public String add(String a, String b){
		StringBuilder s = new StringBuilder();
		
		for(int i=0; i< a.length(); i++){
			s.append(a.charAt(i));
		}
		
		for(int i=0; i< b.length(); i++){
			s.append(b.charAt(i));
		}
		
		return s.toString();
	}
	
	

}
