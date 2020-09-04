package JavaTutorial;

import java.util.ArrayList;

public class java15_uniqueNumberIntArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 4, 5, 5, 5, 4, 6, 6, 9, 4, 10, 3, 3 };
		// Print unique number from the list

		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {

			int k = 0;

			if (!al.contains(a[i])) {

				al.add(a[i]);
				k++;

				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {

						k++;

					}
				}
				System.out.print("Array item: " + a[i]);
				System.out.println(" Repeated " + k + " times!");

				if (k == 1) {
					System.out.println(a[i] + " is the unique number in this Array!");
				}

			}

		}

		// 4 repeated 3 times, 5 repeated 3 times, 6 repeated 2 times, 9 repeated 1 time
		// 1. setup an Empty ArrayList

	}

}
