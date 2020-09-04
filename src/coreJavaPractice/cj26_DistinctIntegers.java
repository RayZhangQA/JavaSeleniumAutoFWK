package coreJavaPractice;

import java.util.HashMap;

public class cj26_DistinctIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] A = { 2, 1, 1, 2, 3, 1 };
		// int[] A = { 2, 2, 2, 2, 2, 2, 2, 2 };
		// int[] A = {};
		int[] A = { 0, 1 };

		System.out.println("The array has " + solution(A) + " distinct values");

	}

	public static int solution(int[] A) {

		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();

		for (int i = 0; i < A.length; i++) {
			// System.out.println("A[" + i + "]=" + A[i]);
			if (hmap.containsKey(A[i])) {
				hmap.put(A[i], hmap.get(A[i]) + 1);
				// System.out.println(hmap);
			} else {
				hmap.put(A[i], 1);
				// System.out.println("A" + i + " - " + hmap);
			}
		}

		// System.out.println(hmap);

		return hmap.size();

	}
}

//Distinct
//
//Compute number of distinct values in an array.

//This solution get 100%. Task Score:100%, Correctness:100%, performance:100%

//Write a function
//
//class Solution { public int solution(int[] A); }
//
//that, given an array A consisting of N integers, returns the number of distinct values in array A.
//
//For example, given array A consisting of six elements such that:
//
// A[0] = 2    A[1] = 1    A[2] = 1
// A[3] = 2    A[4] = 3    A[5] = 1
//the function should return 3, because there are 3 distinct values appearing in array A, namely 1, 2 and 3.
//
//Write an efficient algorithm for the following assumptions:
//
//N is an integer within the range [0..100,000];
//each element of array A is an integer within the range [−1,000,000..1,000,000].