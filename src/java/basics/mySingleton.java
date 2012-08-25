package java.basics;

public class mySingleton {

	public static void main(String[] args) {
		Singleton.getInstance();
		Singleton.getInstance();
		Singleton.getInstance();
		Singleton.getInstance();
		System.out.println(Singleton.getData());
	}
}

class Singleton{
	private static Singleton instance;
	static int data = 0;
	
	private Singleton(){
		data += 5;
	}
	
	public static Singleton getInstance(){
		if(instance == null)
			return instance = new Singleton();
		else
			return instance;
	}
	
	public static int getData(){
		return data;
	}
}
