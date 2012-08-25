package collections.operations;
import java.util.HashMap;


public class GiveCount {

	public static void main(String[] args) {
		new GiveCount();

	}

	public GiveCount() {
		String s = "apple";
		HashMap<Character, Integer> list = new HashMap<Character, Integer>();
		
		list = getCount(s);
		System.out.println(list);
	}
	
	public HashMap<Character, Integer> getCount(String s){
		int count = 0;
		HashMap<Character, Integer> list = new HashMap<Character, Integer>();
		
		for(int i=0; i<s.length(); i++){
			if(list.containsKey(s.charAt(i))){
				count = list.get(s.charAt(i));
				count++;
				list.put(s.charAt(i), count);
			}
			else{
				count = 1;
				list.put(s.charAt(i), count);
			}
				
		}
		return list;
	}


}
