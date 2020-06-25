package SeleniumJava_JavaCorePractice;

import java.util.Scanner;

public class java21_stringReverseStringBuilderReverse {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter string to reverse:");

		Scanner read = new Scanner(System.in);
		String str = read.nextLine();

		StringBuilder sb = new StringBuilder(str);

		System.out.println("Reversed string is:");
		System.out.println(sb.reverse().toString());
	}

}

//simply use the Java StringBuilder class “reverse” function.