package HashMapping;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMap04_GetSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(11, "Value1");
		hmap.put(22, "Value2");
		hmap.put(33, "Value3");
		hmap.put(44, "Value4");
		hmap.put(55, "Value5");

		System.out.println("Size of HashMap: " + hmap.size());
		for (Map.Entry me : hmap.entrySet()) {
			System.out.println("Key " + me.getKey() + " Value: " + me.getValue());
		}

		hmap.put(66, "Value6");
		hmap.put(77, "Value7");
		TreeMap<Integer, String> map = new TreeMap<Integer, String>(hmap);
		System.out.println("Size of HashMap: " + hmap.size());
		for (Map.Entry me : map.entrySet()) {
			System.out.println("Key " + me.getKey() + " Value: " + me.getValue());
		}

		hmap.put(00, "Value0");
		hmap.put(88, "Value8");
		TreeMap<Integer, String> map1 = new TreeMap<Integer, String>(hmap);
		System.out.println("Size of HashMap: " + hmap.size());
		for (Map.Entry me : map1.entrySet()) {
			System.out.println("Key " + me.getKey() + " Value: " + me.getValue());
		}

	}

}
