package SeleniumJava_JavaCorePractice;

import java.util.Arrays;
import java.util.Collections;

public class java02_sortTheListOfStrings {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String[] inputList = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "aug", "Sep", "Oct", "nov", "Dec" };

		// Display input un-sorted list.
		System.out.println("-------Input List-------");
		showList(inputList);

		// Call to sort the inputList in Ascending Order.
		Arrays.sort(inputList);

		// Display the sorted list in Ascending Order.
		System.out.println("\n-------Sorted List in Ascending Order-------");
		showList(inputList);

		// Reverse the Order of an Array to Descending Order.
		Arrays.sort(inputList, Collections.reverseOrder());

		// Display the sorted list in Descending Order.
		System.out.println("\n-------Sorted List in Descending Order-------");
		showList(inputList);

		// Call to sort the input list in case-sensitive order.
		Arrays.sort(inputList, String.CASE_INSENSITIVE_ORDER);

		// Display the sorted list.
		System.out.println("\n-------Sorted list (Case-Sensitive)-------");
		showList(inputList);
	}

	public static void showList(String[] array) {
		for (String str : array) {
			System.out.print(str + " ");
		}
		System.out.println();

	}

}
