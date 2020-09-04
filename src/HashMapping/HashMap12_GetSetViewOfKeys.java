package HashMapping;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap12_GetSetViewOfKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> hmap = new HashMap<String, String>();

		hmap.put("Key1", "Jack");
		hmap.put("Key2", "Rock");
		hmap.put("Key3", "Rick");
		hmap.put("Key4", "Smith");
		hmap.put("Key5", "Will");

		// Getting Set of HashMap keys
		/*
		 * public Set<K> keySet(): Returns a Set view of the keys contained in this map.
		 * The set is backed by the map, so changes to the map are reflected in the set,
		 * and vice-versa.
		 */
		Set<String> keys = hmap.keySet();
		Set<Entry<String, String>> entries = hmap.entrySet();

		System.out.println(keys);
		System.out.println(entries);

	}

}
