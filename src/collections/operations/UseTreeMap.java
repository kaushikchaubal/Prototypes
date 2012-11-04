package collections.operations;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;


public class UseTreeMap {

	public static void main(String[] args) {
		new UseTreeMap();
	}

	public UseTreeMap() {
		

		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		
		map.put(3, "three");
		map.put(2, "two");
		map.put(0, "zero");
		
		StringBuilder s = new StringBuilder();
		Set  set =  map.keySet();
		for(Iterator i = set.iterator();i.hasNext();){
			Object index = i.next();
			s.append(index + " ");
			s.append(map.get(index) + "\n");
		}
		
		System.out.println(s.toString());
		System.out.println(map.firstKey());
		
		String s1 = "0kaushik";
		int score = (int) s1.charAt(0)-48;
		System.out.println(score);
		System.out.println(s1.substring(1));
	}

}
