package coreJavaPractice;

public class cj04_stringReversePalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1. In for loop: i setup to s.length()-1 because the index start from 0.
		 * otherwise will get the "String index out of range: 8". 2. i>=0 means i start
		 * from 0. if use i>0, it will start 1 and will miss one char.
		 */

		String sourceString = "12345654321";
		// String sourceString = "RayZhang";
		System.out.println(sourceString);

		String targetString = "";
		for (int i = sourceString.length() - 1; i >= 0; i--) {
			// System.out.println(s.charAt(i));
			targetString = targetString + sourceString.charAt(i);
		}

		System.out.println(targetString);

		/*
		 * Check if the string is a Palindrome String. Do not use "s == t" to compare
		 * the 2 strings. It does not work. // Use equals to compare the 2 strings.
		 */

		if (sourceString.equals(targetString)) {
			System.out.println("The String " + sourceString + " is a Palindrome String.");
		} else {
			System.out.println("The String " + sourceString + " is NOT a Palindrome String.");
		}
	}

}

/*
 * A string is called to be a Palindrome If the String read from left to right
 * is equal to the string read from right to left.
 */
