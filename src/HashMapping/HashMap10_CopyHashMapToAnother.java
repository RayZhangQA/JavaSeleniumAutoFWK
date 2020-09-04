package HashMapping;

import java.util.HashMap;

public class HashMap10_CopyHashMapToAnother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		// add elements to HashMap
		hmap.put(1, "AA");
		hmap.put(2, "BB");
		hmap.put(3, "CC");
		hmap.put(4, "DD");

		System.out.println("HashMap Elements of hmap: " + hmap);

		HashMap<Integer, String> hmap2 = new HashMap<Integer, String>();
		// Adding elements to the recently created HashMap
		hmap2.put(11, "Hello");
		hmap2.put(22, "Hi");

		System.out.println("HashMap Elements of hmap2: " + hmap2);

		// Copying one HashMap "hmap" to another HashMap "hmap2"\
		hmap2.putAll(hmap);

		System.out.println("HashMap Elements of hmap2 after copying hmap to it: " + hmap2);

	}

}

//All the elements of HashMap 1 got copied to the HashMap 2. 
//putAll() operation does not replace the existing elements of Map rather it appends the elements to them.