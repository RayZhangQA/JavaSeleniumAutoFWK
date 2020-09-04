package coreJavaPractice;

import java.util.Arrays;

public class cj16_OddOccurrencesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int[] array = { 9, 3, 9, 3, 9, 7, 9 };
		// int[] array = { 8 };
		int[] array = { 3, 3, 5, 2, 2 };
		// int[] array = { 1, 2, 3, 6, 9, 15, 18, 15, 9, 1, 2, 3, 6 };

		System.out.println("The Odd Occurrences In Array is: " + solution(array));

	}

	public static int solution(int[] A) {
		Arrays.sort(A);
		System.out.println(Arrays.toString(A));
		int i;
		int counter = 1;

		for (i = 1; i < A.length; i++) {
			if (A[i - 1] != A[i]) {
				if ((counter % 2) == 1)
					break;
				counter = 1;
			} else
				counter++;
		}
		return A[i - 1];
	}

}

//A non-empty array A consisting of N integers is given. The array contains an odd number of elements, 
//and each element of the array can be paired with another element that has the same value, 
//except for one element that is left unpaired.
//
//For example, in array A such that:
//
//A[0] = 9  A[1] = 3  A[2] = 9  A[3] = 3  A[4] = 9  A[5] = 7  A[6] = 9
//the elements at indexes 0 and 2 have value 9,
//the elements at indexes 1 and 3 have value 3,
//the elements at indexes 4 and 6 have value 9,
//the element at index 5 has value 7 and is unpaired.
//Write a function:
//
//class Solution { public int solution(int[] A); }
//
//that, given an array A consisting of N integers fulfilling the above conditions, returns the value of the unpaired element.
//
//For example, given array A such that:
//
//  A[0] = 9  A[1] = 3  A[2] = 9
//  A[3] = 3  A[4] = 9  A[5] = 7
//  A[6] = 9
//the function should return 7, as explained in the example above.
//
//Write an efficient algorithm for the following assumptions:
//
//N is an odd integer within the range [1..1,000,000];
//each element of array A is an integer within the range [1..1,000,000,000];
//all but one of the values in A occur an even number of times.