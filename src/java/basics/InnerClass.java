package java.basics;

public class InnerClass {
	int val;
	
	class Inner{
		int innerVal;
		
		public Inner(int a){
			val = a;
		}
	}

	public static void main(String[] args) {
		new InnerClass();	
	}
	
	public InnerClass(){
		val = 5;
		System.out.println("val: " + val);
		Inner obj = new Inner(10);
		
		System.out.println("val: " + val);
	}

}
