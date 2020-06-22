package SeleniumJava_JavaCorePractice;

import java.util.HashMap;

public class java10_countTheNumberOfCharactersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Thiscode is done by Ray Zhang who is doing this for the code interview";
		String[] split = str.split("");

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < split.length; i++) {
			if (map.containsKey(split[i])) {
				int count = map.get(split[i]);
				map.put(split[i], count + 1);
			} else {
				map.put(split[i], 1);
			}
		}
		System.out.println(map);
	}

}

//1. declare the string variable called str
//2. use split() function split the characters in a string
//3. declare HashMap 
//4. iterate use for loop. 
//5. Inside for loop, use if-else statement in which wherever at a particular position, 
//   the map contains a key, we set the counter at that position and add the object to the map.
//6. Each time, the counter is incremented by 1. Else, the counter is set to 1.
//7. Finally, we are printing the HashMap.