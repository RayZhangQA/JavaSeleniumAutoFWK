package HashMapping;

import java.util.HashMap;

public class HashMap11_GetValueFromKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		// add elements to HashMap
		hmap.put(1, "AA");
		hmap.put(2, "BB");
		hmap.put(3, "CC");
		hmap.put(4, "DD");

		String value = hmap.get(4);
		System.out.println("The value mapped to Key 4 is: " + value);

		System.out.println("The value mapped to Key 5 is: " + hmap.get(5));

		if (hmap.get(5) == null) {
			System.out.println("The key 5 exists in HashMap: " + hmap.containsKey(5));
		}

		hmap.put(5, null);

		if (hmap.get(5) == null) {
			System.out.println("The key 5 exists in HashMap: " + hmap.containsKey(5));
		}

	}

}

//Note: In the above program the key 5 is not mapped to any value so the get() method returned null. 
//However you must not use this method for checking existence of a Key in HashMap
//because a return value of null does not necessarily indicate that the map contains no mapping for the key; 
//it’s also possible that the map explicitly maps the key to null. 

//You must use the containsKey() method for checking the existence of a Key in HashMap.