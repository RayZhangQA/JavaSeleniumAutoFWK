package HashMapping;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMap02_SortByKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();

		hmap.put(5, "A");
		hmap.put(11, "C");
		hmap.put(4, "Z");
		hmap.put(77, "Y");
		hmap.put(9, "P");
		hmap.put(66, "Q");
		hmap.put(0, "R");

		System.out.println("Original HashMap");

		for (Map.Entry me : hmap.entrySet()) {
			System.out.println("Key: " + me.getKey() + " & Value: " + me.getValue());
		}

		// TreeMap is an example of a SortedMap and is implemented by Red-Black tree
		// which means that the order of the Keys is sorted.
		TreeMap<Integer, String> map = new TreeMap<Integer, String>(hmap);
		System.out.println("Sorted by Keys");

		for (Map.Entry me2 : map.entrySet()) {
			System.out.println(me2.getKey() + ": " + me2.getValue());
		}

		// Sort TreeMap in reverse order
		Map<Integer, String> descmap = map.descendingMap();

		for (Map.Entry me3 : descmap.entrySet()) {
			System.out.println(me3.getKey() + ": " + me3.getValue());
		}

	}

}
