package SeleniumJava_JavaCorePractice;

import java.util.Arrays;
import java.util.Collections;

public class java23_sortIntegersArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// sort entire array
		int[] arr = { 13, 7, 6, 45, 21, 9, 101, 102 };
		Arrays.sort(arr); // sort the entire array.
		System.out.println("Sort the entire Array in Ascending Order: " + Arrays.toString(arr));
		// System.out.printf("Modified arr[] : %s", Arrays.toString(arr));

		// only sort sub-array {7,6,45,21} and keep other elements as it is.
		int[] arr1 = { 13, 7, 6, 45, 21, 9, 2, 100 };
		Arrays.sort(arr1, 1, 5);
		System.out.println("Sort the sub-Array in Ascending Order: " + Arrays.toString(arr1));
		// System.out.printf("%nModified sub-arr[] : %s", Arrays.toString(arr1)); // %n
		// is the new line of printf method.

		// sort array in descending order.
		Integer[] arr2 = { 13, 7, 6, 45, 21, 9, 2, 100 };
		Arrays.sort(arr2, Collections.reverseOrder());
		System.out.println("Sort the Array in Descending Order :" + Arrays.toString(arr2));
		// System.out.printf("%nSort Array in Descending Order : %s",
		// Arrays.toString(arr2));

	}

}
