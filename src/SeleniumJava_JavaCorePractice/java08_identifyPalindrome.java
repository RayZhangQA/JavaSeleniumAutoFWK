package SeleniumJava_JavaCorePractice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class java08_identifyPalindrome {

	public static void main(String[] args) {
		/*
		 * A Palindrome is a word, number, phrase, or other sequence of characters /
		 * which reads the same backward as forward, such as madam, racecar. / There are
		 * also numeric palindrome, including date/time stamps / using short digits
		 * 11/11/11 11:11 and long digits 02/02/2020
		 */

		try {
			BufferedReader object = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Input number");
			int inputValue = Integer.parseInt(object.readLine());
			int n = inputValue;
			int rev = 0;
			System.out.println("Input value is : ");
			System.out.println(" " + inputValue);
			for (int i = 0; i <= inputValue; i++) {
				int r = inputValue % 10;
				inputValue = inputValue / 10;
				rev = rev * 10 + r;
				i = 0;
			}
			System.out.println("Post reversal : " + " ");
			System.out.println(" " + rev);
			if (n == rev) {
				System.out.print("Input value is a palindrome.");
			} else {
				System.out.println("Input value is not a palindrome.");
			}
		} catch (Exception e) {
			System.out.println("Out of Range.");
		}

	}

}
