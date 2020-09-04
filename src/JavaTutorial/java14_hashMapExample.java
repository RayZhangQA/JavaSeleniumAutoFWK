package JavaTutorial;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class java14_hashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(0, "Hello");
		hm.put(1, "Gudbye");
		hm.put(2, "morning");
		hm.put(3, "evening");
		hm.put(4, "night");
		System.out.println(hm.get(2));

		hm.remove(2);
		System.out.println(hm.get(2));

		Set sn = hm.entrySet();

		Iterator it = sn.iterator();

		// hashtable - pass table set collections

		while (it.hasNext()) {
			Map.Entry mp = (Map.Entry) it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}

	}

}

//The differences between HashMap and HashTable
//1. Synchronization or Thread Safe:
// This is the most important difference between two. HashMap is non synchronized and not thread safe.
// On the other hand, HashTable is thread safe and synchronized.
// When to use HashMap? answer is if your application do not require any multi-threading task,
// in other words HashMap is better for non-threading applications. HashTable should be used in multithreading application.

//2. Null Keys and null values: HashMap allows one null key and any number of null values, 
// while HashTable do not allow null keys and null values in the HashTable Object.

//3. Iterating the values: HashMap object values are iterated by using iterator. 
// HashTable is the only class other than vector which uses enumerator to iterate the values of HashTable object.
