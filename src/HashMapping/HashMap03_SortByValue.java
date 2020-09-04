package HashMapping;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class HashMap03_SortByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(5, "A");
		hmap.put(11, "C");
		hmap.put(77, "Y");
		hmap.put(9, "P");
		hmap.put(66, "Q");
		hmap.put(0, "R");

		System.out.println("Original HashMap");

//		for (Map.Entry me : hmap.entrySet()) {
//			System.out.println("Key: " + me.getKey() + " Value: " + me.getValue());
//		}

		Iterator iterator = hmap.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry me = (Map.Entry) iterator.next();
			System.out.println("Key: " + me.getKey() + " Value: " + me.getValue());
		}

		Map<Integer, String> map = sortByValuesAscending(hmap);

		System.out.println("Sorted By Value");
		Iterator iterator2 = map.entrySet().iterator();
		while (iterator2.hasNext()) {

			Map.Entry me2 = (Map.Entry) iterator2.next();
			System.out.println("Key: " + me2.getKey() + " Value: " + me2.getValue());
		}

		Map<Integer, String> descmap = sortByValuesDescending(hmap);

		System.out.println("Sorted By Value");
		Iterator iterator3 = descmap.entrySet().iterator();
		while (iterator3.hasNext()) {

			Map.Entry me3 = (Map.Entry) iterator3.next();
			System.out.println("Key: " + me3.getKey() + " Value: " + me3.getValue());
		}

	}

	private static HashMap sortByValuesAscending(HashMap map) {
		List list = new LinkedList(map.entrySet());
		// Defined Custom Comparator here: Ascending Order
		Collections.sort(list, new Comparator() {
			public int compare(Object o1, Object o2) {
				return ((Comparable) ((Map.Entry) (o1)).getValue()).compareTo(((Map.Entry) (o2)).getValue());
			}
		});

		// Descending Order
//		Collections.sort(list, new Comparator() {
//			public int compare(Object o1, Object o2) {
//				return ((Comparable) ((Map.Entry) (o2)).getValue()).compareTo(((Map.Entry) (o1)).getValue());
//			}
//		});

		// Here I am copying the sorted list in HashMap
		// using LinkedHashMap to preserve the insertion order
		HashMap sortedHashMap = new LinkedHashMap();
		for (Iterator it = list.iterator(); it.hasNext();) {
			Map.Entry entry = (Map.Entry) it.next();
			sortedHashMap.put(entry.getKey(), entry.getValue());
		}
		return sortedHashMap;
	}

	private static HashMap sortByValuesDescending(HashMap map) {
		List list = new LinkedList(map.entrySet());
		// Descending Order
		Collections.sort(list, new Comparator() {
			public int compare(Object o1, Object o2) {
				return ((Comparable) ((Map.Entry) (o2)).getValue()).compareTo(((Map.Entry) (o1)).getValue());
			}
		});

		// Here I am copying the sorted list in HashMap
		// using LinkedHashMap to preserve the insertion order
		HashMap sortedHashMap = new LinkedHashMap();
		for (Iterator it = list.iterator(); it.hasNext();) {
			Map.Entry entry = (Map.Entry) it.next();
			sortedHashMap.put(entry.getKey(), entry.getValue());
		}
		return sortedHashMap;
	}
}
