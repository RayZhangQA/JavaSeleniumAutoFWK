package HashMapping;

import java.util.HashMap;

public class HashMap06_RemoveAllMappings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		hashmap.put(11, "Value1");
		hashmap.put(22, "Value2");
		hashmap.put(33, "Value3");
		hashmap.put(44, "Value4");
		hashmap.put(55, "Value5");

		System.out.println("HashMap Elements: " + hashmap);
		System.out.println("Is HashMap Empty? " + hashmap.isEmpty());

		hashmap.clear();

		System.out.print("After Calling clear(): ");
		System.out.println("HashMap Elements: " + hashmap);
		System.out.println("Is HashMap Empty? " + hashmap.isEmpty());

	}

}

//Example
//In the last tutorial we shared how to remove a specific mapping from HashMap based on key. 
//In this example we are going to see how to remove all the mappings from HashMap. 
//We will be using clear() method of HashMap class to do this:
//
//public void clear(): Removes all of the mappings from this map. 
//The map will be empty after this call returns.

//Program to check if a HashMap is empty or not. We are using isEmpty() method of HashMap class to perform this check.