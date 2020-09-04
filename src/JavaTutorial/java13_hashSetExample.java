package JavaTutorial;

import java.util.HashSet;
import java.util.Iterator;

public class java13_hashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// HashSet, TreeSet, LinkedHashSet implements Set Interface.
		// Set does not accept duplicate values
		// There is no guarantee elements stored in sequential order. Random order.

		HashSet<String> hs = new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("INDIA");
		hs.add("INDIA");// Adding duplicate element will be skipped.
		hs.add("he");
		hs.add("she");

		System.out.println(hs);

		// System.out.println(hs.remove("UK"));
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());

		Iterator<String> i = hs.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
