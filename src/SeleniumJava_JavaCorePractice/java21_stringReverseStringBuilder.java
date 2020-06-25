package SeleniumJava_JavaCorePractice;

import java.util.Scanner;

public class java21_stringReverseStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter string to reverse:");

		Scanner read = new Scanner(System.in);
		String str = read.nextLine();

		StringBuilder sb = new StringBuilder();

		for (int i = str.length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}

		System.out.println("Reversed string is:");
		System.out.println(sb.toString());

	}

}

//Very similar to the previous method, the only difference is that
//we are using the “append” function of the Java StringBuilder class 
//in the iteration loop instead to concatenate the characters to form the reversed String.