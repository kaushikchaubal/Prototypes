package java.basics;

public class XORing {

	public static void main(String[] args) {
		new XORing();
	}

	public XORing() {
		int uniqueSet = 1 ^ 2^ 4 ^ 8;
		int data = 1 ^ 8;
		
		System.err.println(uniqueSet ^ data);
	}

}
