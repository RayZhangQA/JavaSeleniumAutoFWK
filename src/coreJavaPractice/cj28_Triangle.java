package coreJavaPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class cj28_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = { 10, 2, 5, 1, 8, 20 };

		System.out.println("The Array has a triangular triple: " + solution(A));

	}

	public static int solution(int[] A) {

		List<Integer> aList = new ArrayList();
		for (int i = 0; i < A.length; i++) {
			aList.add(A[i]);
		}

		Collections.sort(aList);
		// made long array because each int element can be as high as Integer.MAX_VALUE
		// so when add them //can overflow int
		long[] aOrdered = new long[A.length];
		int index = 0;
		for (Integer i : aList) {
			aOrdered[index++] = i;
		}

		// start from the end (largest) //if previous 2 elements have sum > current
		// element, found a triangle
		for (int i = aOrdered.length - 1; i >= 2; i--) {
			if (aOrdered[i - 1] + aOrdered[i - 2] > aOrdered[i]) {
				return 1;
			}
		}
		return 0;

	}

}

//Triangle
//
//Determine whether a triangle can be built from a given set of edges.
//
//An array A consisting of N integers is given. A triplet (P, Q, R) is triangular if 0 ≤ P < Q < R < N and:
//
//A[P] + A[Q] > A[R],
//A[Q] + A[R] > A[P],
//A[R] + A[P] > A[Q].
//For example, consider array A such that:
//
//  A[0] = 10    A[1] = 2    A[2] = 5
//  A[3] = 1     A[4] = 8    A[5] = 20
//Triplet (0, 2, 4) is triangular.
//
//Write a function:
//
//class Solution { public int solution(int[] A); }
//
//that, given an array A consisting of N integers, returns 1 if there exists a triangular triplet for this array and returns 0 otherwise.
//
//For example, given array A such that:
//
//  A[0] = 10    A[1] = 2    A[2] = 5
//  A[3] = 1     A[4] = 8    A[5] = 20
//the function should return 1, as explained above. Given array A such that:
//
//  A[0] = 10    A[1] = 50    A[2] = 5
//  A[3] = 1
//the function should return 0.
//
//Write an efficient algorithm for the following assumptions:
//
//N is an integer within the range [0..100,000];
//each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].
