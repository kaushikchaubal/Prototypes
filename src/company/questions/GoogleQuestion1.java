package company.questions;
import java.util.HashMap;


public class GoogleQuestion1 {

	public static void main(String[] args) {
		new GoogleQuestion1();
	}
	
	public GoogleQuestion1() {
		String input = "abcba";
		String order = "bca";
		
		String output = sort(input, order);
		System.out.println(output);
	}

	public String sort(String input, String order) {
		StringBuilder output = new StringBuilder();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i=0; i < input.length(); i++){
			if(map.containsKey(input.charAt(i))){
				int count = map.get(input.charAt(i));
				map.put(input.charAt(i), ++count);
			}
			else
				map.put(input.charAt(i), 1);
		}
		
		for(int i=0; i< order.length(); i++){
			while(map.get(order.charAt(i)) !=0){
				output.append(order.charAt(i));
				int count = map.get(order.charAt(i));
				map.put(order.charAt(i), --count);
			}
		}
		return output.toString();
	}
}
