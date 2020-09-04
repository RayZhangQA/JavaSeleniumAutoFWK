package HashMapping;

import java.util.HashMap;

public class HashMap07_KeyOrValueExists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		hashmap.put(11, "Chaitanya");
		hashmap.put(22, "Pratap");
		hashmap.put(33, "Singh");
		hashmap.put(44, "Rajesh");
		hashmap.put(55, "Kate");

		boolean flag1 = hashmap.containsKey(22);
		System.out.println("Key 22 exists in HashMap? - " + flag1);

		boolean flag2 = hashmap.containsKey(55);
		System.out.println("Key 22 exists in HashMap? - " + flag1);

		System.out.println("Key 99 exists in HashMap? - " + hashmap.containsKey(99));

		boolean flag3 = hashmap.containsValue("Singh");
		System.out.println("String \"Singh\" exists in HashMap? - " + flag3);

		System.out.println("String \"HashMap\" exists in HashMap? - " + hashmap.containsValue("HashMap"));

	}

}

//Example
//The steps we followed in the below example are:
//
//1) Create a HashMap and populate it with key-value pairs.
//2) Check any key existence by calling containsKey() method. This method returns a boolean value.
//3) checking whether a particular value exists in HashMap or not By using containsValue() method of HashMap class.