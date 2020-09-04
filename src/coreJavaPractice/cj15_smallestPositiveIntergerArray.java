package coreJavaPractice;

import java.util.Arrays;

public class cj15_smallestPositiveIntergerArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int[] array = { 1, 3, 6, 4, 1, 2 };
		int[] array = { 1, 2, 5, 4, 3 };
		// int[] array = { -1, -1000, -5 };

		System.out.println("The smallest positiveInteger not exist in Array is: " + solution(array));

	}

	public static int solution(int[] A) {

		int smallestInt = 1;

		if (A.length == 0) // if the array is empty, the smallestInt should be 1
			return smallestInt;

		Arrays.sort(A);
		// System.out.println(Arrays.toString(A));

		if (A[0] > 1) // if the 1st sorted item in the array is great than 1, the smallestInt should
						// be 1.
			return smallestInt;

		if (A[A.length - 1] <= 0) // if last sorted item in the array is less than 0, the smallestInt should be 1.
			return smallestInt;

		for (int i = 0; i < A.length; i++) { // check each array item

			// System.out.println("Array item " + i + " is " + A[i]);
			// System.out.println("SmallestInt is " + smallestInt);

			if (A[i] == smallestInt) { // if the value of the item equals to smallestInt, set up smallestInt++
				smallestInt++;
			}
		}

		return smallestInt;
	}

}
//MissingInteger
//Find the smallest positive integer that does not occur in a given sequence.
//This solution is scored 100%. Task Score: 100%, Correctness 100%, Performance: 100%

//This is a demo task.
//Write a function:
//class Solution { public int solution(int[] A); }
//that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
//For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
//Given A = [1, 2, 3], the function should return 4.
//Given A = [−1, −3], the function should return 1.
//Write an efficient algorithm for the following assumptions:
//N is an integer within the range [1..100,000];
//each element of array A is an integer within the range [−1,000,000..1,000,000].