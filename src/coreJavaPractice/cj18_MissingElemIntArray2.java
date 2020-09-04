package coreJavaPractice;

import java.util.Arrays;

public class cj18_MissingElemIntArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int[] A = { 2, 3, 1, 5 };
		// int[] A = {};
		int[] A = { 1, 2, 3, 4, 5, 7 };
		// int[] A = { 2, 3, 4 };
		// int[] A = { 2 };

		System.out.println("The missing element is: " + solution(A));

	}

	public static int solution(int[] A) {
		int arrayLength = A.length;
		Arrays.sort(A);

		if (arrayLength == 0)
			return 1;
		if (arrayLength == 1) {
			if (A[0] == 1) {
				return A[0] + 1;
			} else {
				return A[0] - 1;
			}
		}

		for (int i = 1; i <= arrayLength; i++) {
			if (A[i - 1] != i) {
				return i;
			}
		}
		return A[arrayLength - 1] + 1;
	}

}

//An array A consisting of N different integers is given. 
//The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.
//
//Your goal is to find that missing element.
//
//given an array A, returns the value of the missing element.
//
//For example, given array A such that:
//
//  A[0] = 2
//  A[1] = 3
//  A[2] = 1
//  A[3] = 5
//the function should return 4, as it is the missing element.
//
//Write an efficient algorithm for the following assumptions:
//
//N is an integer within the range [0..100,000];
//the elements of A are all distinct;
//each element of array A is an integer within the range [1..(N + 1)].