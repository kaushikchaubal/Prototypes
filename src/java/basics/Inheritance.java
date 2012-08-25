package java.basics;

public class Inheritance {

	public static void main(String[] args) {
		A a1 = new A();
		a1.me();
		
		A a2 = new B();
		a2.me();

		B a3 = new B();
		a3.me();
		
		A a4 = new C();
		a4.me();
		
//		B a5 = new D();
//		a1.me();
	}

}

class A{
	public void me(){
		System.out.println("A");
	}
}

class B extends A{
	public void me(){
		System.out.println("B");
	}	
}

class C  extends B{
	public void me(){
		System.out.println("C");
	}
}

class D extends A{
	public void me(){
		System.out.println("D");
	}
}
