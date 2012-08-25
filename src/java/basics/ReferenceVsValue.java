package java.basics;

public class ReferenceVsValue {

	public static void main(String[] args) {
		new ReferenceVsValue();

	}

	public ReferenceVsValue() {
		int elem = 10;
		changeInt(elem);
		System.out.println(elem);
		
		MyInt obj = new MyInt(20);
		changeMyInt(obj);
		System.out.println(obj.val);
		
		Integer data = 30;
		changeInteger(data);
		System.out.println(data);
		
		int[] arr = {40};
		changeArray(arr);
		System.out.println(arr[0]);
		
		
		
	}
	
	public void changeInt(int elem){
		elem=100;
	}
	
	public void changeMyInt(MyInt elem){
		elem.val = 200;
	}
	
	public void changeInteger(Integer elem){
		elem = 300;
	}
	
	public void changeArray(int[] elem){
		elem[0] = 400;
	}

}

class MyInt{
	public int val;
	
	public MyInt(int v){
		val = v;
	}
}
