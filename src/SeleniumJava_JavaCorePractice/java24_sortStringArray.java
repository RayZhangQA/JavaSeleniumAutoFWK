package SeleniumJava_JavaCorePractice;

import java.util.Arrays;
import java.util.Collections;

public class java24_sortStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fruits[] = { "Orange", "Grape", "Apple", "Lemon", "Banana" };

		// Sorts fruits[] in ascending order
		Arrays.sort(fruits);
		System.out.printf("Sort arr[] in Ascending Order: \n%s\n\n", Arrays.toString(fruits));

		// Sorts fruits[] in descending order
		Arrays.sort(fruits, Collections.reverseOrder());
		System.out.printf("Sort arr[] in Descending Order: \n%s\n\n", Arrays.toString(fruits));

	}

}
