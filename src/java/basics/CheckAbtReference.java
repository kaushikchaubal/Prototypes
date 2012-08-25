package java.basics;

public class CheckAbtReference {
	public static void main(String[] args){
		MyClass p1 = new MyClass(100);
		MyClass p2 = null;
		MyClass p3 = null;
		
		p2 = p1;
		p3 = (MyClass) p1.clone();
		
		System.out.println("p1.val= " + p1.val);
		System.out.println("p2.val= " + p2.val);
		System.out.println("p3.val= " + p3.val);
		System.out.println("p1.isEqual(p2): " + p1.isEqual(p2) + "\np1.isEqual(p3): " + p1.isEqual(p3));
		
		p1.increment(25);
		System.out.println("p1.val= " + p1.val);
		System.out.println("p2.val= " + p2.val);
		System.out.println("p3.val= " + p3.val);
		System.out.println("p1.isEqual(p2): " + p1.isEqual(p2) + "\np1.isEqual(p3): " + p1.isEqual(p3));
		
		
	}

}


class MyClass implements Cloneable{
	int val;

	public MyClass(int v) {
		val = v;
	}
	
	public void increment(int v){
		val += v;
	}
	
	public Object clone(){
		MyClass cloneObj = null ;

		try {
			cloneObj = (MyClass)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloneObj;
	}
	
	public boolean isEqual(MyClass p2){
		if(this.val == p2.val)
			return true;
		else
		return false;
		
	}

}