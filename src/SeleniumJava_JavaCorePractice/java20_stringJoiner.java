package SeleniumJava_JavaCorePractice;

import java.util.StringJoiner;

public class java20_stringJoiner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringJoiner mystring = new StringJoiner("-");
		// Passing Hyphen(-) as delimiter

		mystring.add("edureka");
		// Joining multiple string by using add() method
		mystring.add("YouTube");
		mystring.add("Cheat Sheet");

		System.out.println(mystring);
	}

}
