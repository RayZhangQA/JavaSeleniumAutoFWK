package HashMapping;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// This is how to declare HashMap
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(12, "Chaitanya");
		hmap.put(2, "Rahul"); // Adding elements to HashMap
		hmap.put(7, "Singh");
		hmap.put(49, "Ajeet");
		hmap.put(3, "Anuj");

		// Display content using Iterator
		Iterator iterator = hmap.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry mentry = (Map.Entry) iterator.next();
			System.out.println("key is: " + mentry.getKey() + " & Value is: " + mentry.getValue());
		}

		// Get values based on key
		System.out.println("Value at index 2 is: " + hmap.get(2));

		// Remove values based on Key *
		hmap.remove(3);
		System.out.println("Map key and values after removal:");

		Set set2 = hmap.entrySet();
		Iterator iterator2 = set2.iterator();
		while (iterator2.hasNext()) {
			Map.Entry mentry2 = (Map.Entry) iterator2.next();
			System.out.println("key is: " + mentry2.getKey() + " & Value is: " + mentry2.getValue());
		}

	}

}
