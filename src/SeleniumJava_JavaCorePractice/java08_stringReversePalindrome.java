package SeleniumJava_JavaCorePractice;

public class java08_stringReversePalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1. In for loop: i setup to s.length()-1 because the index start from 0.
		 * otherwise will get the "String index out of range: 8" 2. i>=0 means i start
		 * from 0. if use i>0, it will start 1 and will miss one char.
		 */
		String s = "RayZhang";
//		String s = "12345654321";
		System.out.println(s);

		String t = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			// System.out.println(s.charAt(i));
			t = t + s.charAt(i);
		}

		System.out.println(t);

		// Check if the string is a Palindrome String
		// Do not use "s == t" to compare the 2 strings. It does not work.
		// Use equals to compare the 2 strings.

		if (s.equals(t)) {
			System.out.println("The String " + s + " is a Palindrome String.");
		} else {
			System.out.println("The String " + s + " is NOT a Palindrome String.");
		}
	}

}
