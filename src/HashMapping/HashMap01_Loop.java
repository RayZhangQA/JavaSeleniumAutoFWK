package HashMapping;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMap01_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hmap = new HashMap<Integer, String>();

		hmap.put(11, "AB");
		hmap.put(2, "CD");
		hmap.put(33, "EF");
		hmap.put(9, "GH");
		hmap.put(3, "IJ");

		// For Loop
		System.out.println("For Loop to print each element of the HashMap");
		for (Map.Entry me : hmap.entrySet()) {
			System.out.println("Key: " + me.getKey() + " & Value: " + me.getValue());
		}

		// While Loop & Iterator
		System.out.println("While Loop to print each element of the HashMap");
		Iterator iterator = hmap.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry me2 = (Map.Entry) iterator.next();
			System.out.println("Key: " + me2.getKey() + " & Value: " + me2.getValue());
		}

	}

}
