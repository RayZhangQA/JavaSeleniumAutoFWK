package coreJavaPractice;

public class cj03_stringClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * String: it is one of the prebuilt class in java. There are 2 ways to define
		 * the String object 1. String literal 2. by creating object of string
		 */

		/*
		 * String a = "hello"; //String literal String ab = new String("hello");
		 * //String Class
		 * 
		 * String a1 = "World"; String a2 = "World"; // with String literal a2 and a1
		 * with the same Value of the String are point to the same object in the
		 * backend.
		 * 
		 * String b1 = new String("Morning"); String b2 = new String("Morning"); // with
		 * String class, it is forced to create the new object in the backend.
		 * 
		 */
		String a = " Java Training ";

		// index, substring
		System.out.println(a.charAt(2));
		System.out.println(a.indexOf("e")); // if the char is not found in the String, it will print "-1"
		System.out.println(a.indexOf("a")); // The multiple chars will print the first found value.
		System.out.println(a.substring(3, 6)); // starting 3 and ending 6
		System.out.println(a.substring(5)); // starting 5 and ending to the end of the String.

		// trim, concat
		System.out.println(a.concat("-RayZhang"));
		System.out.println(a.trim()); // trim() will remove the white spaces in front and end of the String.
		String b = a.trim();
		System.out.println(b.concat("-RayZhang"));

		// Convert to upperCase and lowerCase
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());

		// split
		String c = "Java/Training/By/Ray/Zhang";
		String arr[] = c.split("/");
		System.out.println(arr[0]);
		System.out.println(arr[4]);
		System.out.println(arr[3]);

		// replace
		System.out.println(c.replace("a", "6"));

	}

}
