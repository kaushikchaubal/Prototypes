package java.basics;

public class BitManipulations {
	public static void main(String[] args){
		new BitManipulations();
	}
	
	public BitManipulations(){
		int x = 0x01;
		int y = 0xFF;
		
		int z = y & (~x);
		System.out.println("Ox"+Integer.toHexString(z));
	}
}
