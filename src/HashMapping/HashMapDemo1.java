package HashMapping;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("Apple", 1);
		map.put("Banana", 2);
		map.put("Cherry", 3);
		map.put("Pear", 4);
		map.put("Orange", 5);
		map.put("Grape", 6);
		map.put("Peach", 7);
		map.put("Pineapple", 8);
		map.put("Blueberry", 1);

		for (Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

	}

}
