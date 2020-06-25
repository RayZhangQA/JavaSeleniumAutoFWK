package SeleniumJava_JavaCorePractice;

import java.util.Scanner;

public class java21_stringReverse {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter string to reverse:");

		Scanner read = new Scanner(System.in);
		String str = read.nextLine();
		String reverse = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}

		System.out.println("Reversed string is:");
		System.out.println(reverse);
	}

}

// Enter a string to reverse
//In the above code, we are basically reading in a String from the user 
//begin an iteration loop that will build the new reversed String. 
//in the “for” loop by obtaining the characters of the original String individually from the end by using the “charAt” function of the String class 
//and concatenating them to a new String by using the “+” operator.