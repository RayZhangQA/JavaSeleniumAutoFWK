package SeleniumJava_JavaCorePractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class java19_findingDuplicateCharInString {

	public void findIt(String str) {
		Map<Character, Integer> baseMap = new HashMap<Character, Integer>();
		// Convert the String to char array
		char[] charArray = str.toCharArray();

		for (Character ch : charArray) {
			if (baseMap.containsKey(ch)) {
				baseMap.put(ch, baseMap.get(ch) + 1);
			} else {
				baseMap.put(ch, 1);
			}
		}

		Set<Character> keys = baseMap.keySet();
		for (Character ch : keys) {
			if (baseMap.get(ch) > 1) {
				System.out.println(ch + "  is " + baseMap.get(ch) + " times");
			}
		}
	}

	public static void main(String a[]) {
		// TODO Auto-generated method stub
		java19_findingDuplicateCharInString fdc = new java19_findingDuplicateCharInString();
		fdc.findIt("The core java coding practice!");
	}

}
