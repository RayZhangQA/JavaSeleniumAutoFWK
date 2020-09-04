package coreJavaPractice;

import java.util.Arrays;

public class cj22_PermCheck2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int[] A = { 4, 1, 3, 2, 3, 2, 3 };
		// int[] A = { 4, 2, 3 };
		// int[] A = { 1 };
		// int[] A = { 100000 };
		// int[] A = { 4, 4, 4, 4, 4, 4, 4 };
		// int[] A = { 3, 5 };
		int[] A = { 2, 3, 4, 5, 6 };

		System.out.println("The given int array is a permutation array: " + solution(A));

	}

	public static int solution(int[] A) {

		Arrays.sort(A);

		for (int i = 0; i < A.length; i++) {
			if (A[i] != i + 1)
				return 0;
		}
		return 1;
	}

}

//PermCheck
//Check whether array A is a permutation.

//This solution is scored 100%. Task Score: 100%, Correctness: 100%, Performance 100%.

//Task description
//A non-empty array A consisting of N integers is given.
//
//A permutation is a sequence containing each element from 1 to N once, and only once.
//
//For example, array A such that:
//
//    A[0] = 4
//    A[1] = 1
//    A[2] = 3
//    A[3] = 2
//is a permutation, but array A such that:
//
//    A[0] = 4
//    A[1] = 1
//    A[2] = 3
//is not a permutation, because value 2 is missing.
//
//The goal is to check whether array A is a permutation.
//
//Write a function:
//
//class Solution { public int solution(int[] A); }
//
//that, given an array A, returns 1 if array A is a permutation and 0 if it is not.
//
//For example, given array A such that:
//
//    A[0] = 4
//    A[1] = 1
//    A[2] = 3
//    A[3] = 2
//the function should return 1.
//
//Given array A such that:
//
//    A[0] = 4
//    A[1] = 1
//    A[2] = 3
//the function should return 0.
//
//Write an efficient algorithm for the following assumptions:
//
//N is an integer within the range [1..100,000];
//each element of array A is an integer within the range [1..1,000,000,000].