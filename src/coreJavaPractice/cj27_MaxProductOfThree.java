package coreJavaPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class cj27_MaxProductOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] A = { -3, 1, 2, -2, 5, 6 };
		// int[] A = { -3, 1, -100, 2, -2, 5, 6 };
		// int[] A = {-3, 1, -100};
		// int[] A = { -3, 1, 0, -100};
		// int[] A = {-3, 1, 2, 0, -100}
		int[] A = { 10, 10, 10 };

		System.out.println("The maximal product of any triplet is: " + solution(A));

	}

	public static int solution(int[] A) {
		List<Integer> aList = new ArrayList();
		for (int i = 0; i < A.length; i++) {
			aList.add(A[i]);
		}

		Collections.sort(aList);
		int product1, product2, product3, product4 = 0;

		product1 = aList.get(0) * aList.get(1) * aList.get(2); // first 3 elements
		product2 = aList.get(aList.size() - 3) * aList.get(aList.size() - 2) * aList.get(aList.size() - 1); // last 3
																											// elements
		product3 = aList.get(0) * aList.get(1) * aList.get(aList.size() - 1); // first 2 and last element
		product4 = aList.get(0) * aList.get(aList.size() - 2) * aList.get(aList.size() - 1); // first and last 2
																								// elements

		int max1 = Math.max(product1, product2);
		int max2 = Math.max(product3, product4);

		return Math.max(max1, max2);
	}

}

//MaxProductOfThree
//
//Maximize A[P] * A[Q] * A[R] for any triplet (P, Q, R).
//
//A non-empty array A consisting of N integers is given. The product of triplet (P, Q, R) equates to A[P] * A[Q] * A[R] (0 ≤ P < Q < R < N).
//
//For example, array A such that:
//
//  A[0] = -3
//  A[1] = 1
//  A[2] = 2
//  A[3] = -2
//  A[4] = 5
//  A[5] = 6
//contains the following example triplets:
//
//(0, 1, 2), product is −3 * 1 * 2 = −6
//(1, 2, 4), product is 1 * 2 * 5 = 10
//(2, 4, 5), product is 2 * 5 * 6 = 60
//Your goal is to find the maximal product of any triplet.
//
//Write a function:
//
//class Solution { public int solution(int[] A); }
//
//that, given a non-empty array A, returns the value of the maximal product of any triplet.
//
//For example, given array A such that:
//
//  A[0] = -3
//  A[1] = 1
//  A[2] = 2
//  A[3] = -2
//  A[4] = 5
//  A[5] = 6
//the function should return 60, as the product of triplet (2, 4, 5) is maximal.
//
//Write an efficient algorithm for the following assumptions:
//
//N is an integer within the range [3..100,000];
//each element of array A is an integer within the range [−1,000..1,000].
