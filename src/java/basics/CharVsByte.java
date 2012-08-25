package java.basics;

public class CharVsByte {

	public static void main(String[] args) {
		new CharVsByte();
	}

	public CharVsByte() {
		
		byte b = 'a';
		char c = (char) b;
		System.out.println(c);
		
		
		byte[] b1 = {'a', 'b', 'c'};
		char[] c1 = new char[3]; 
		
		System.arraycopy(b1, 0, c1, 0, 3);
		System.out.println(c1[2]);
		
		for (int i=0;i<b1.length;i++){
		c1[i] = (char) b1[i];
		System.out.println(c1[i]);
		
		}
	}

}
