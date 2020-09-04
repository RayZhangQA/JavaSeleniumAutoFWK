package HashMapping;

import java.util.HashMap;
import java.util.Map;

public class HashMap05_RemoveMapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		hashmap.put(11, "Value1");
		hashmap.put(22, "Value2");
		hashmap.put(33, "Value3");
		hashmap.put(44, "Value4");
		hashmap.put(55, "Value5");
		hashmap.put(66, "Value6");

		// Displaying HashMap Elements
		System.out.println("HashMap Elements: " + hashmap);

		// Displaying HashMap Elements divided by Key and Value
		for (Map.Entry me : hashmap.entrySet()) {
			System.out.println("Key: " + me.getKey() + ", Value: " + me.getValue());
		}

		Object removedElement = hashmap.remove(33);
		System.out.println("Element removed is: " + removedElement);
		System.out.println("The remaining elements: " + hashmap);

		System.out.println();
		System.out.println("Element removed is: " + hashmap.remove(55));
		System.out.println("The remaining elements: " + hashmap);

		for (Map.Entry me1 : hashmap.entrySet()) {
			System.out.println("Key: " + me1.getKey() + ", Value: " + me1.getValue());
		}

	}

}

//Example
//In this example we are gonna see how to remove a specific mapping from HashMap using the key value of Key-value pair. 
//We will be using the following method of HashMap class to perform this operation:
//
//public Value remove(Object key): Removes the mapping for the specified key from this map if present 
//and returns the Element value for that particular Key. More about remove method from Javadoc.