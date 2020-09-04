package coreJavaPractice;

import java.util.Arrays;

public class cj21_MaxCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Some testcases
		// (1,[1,2,3]) = [1]
		// (1,[1]) = [1]
		// (1,[5]) = [0]
		// (1,[1,1,1,2,3]) = 3
		// (2,[1,1,1,2,3,1]) = [4,3]
		// (5, [3, 4, 4, 5, 1, 4, 4]) = (1, 0, 1, 4, 1)
		int[] A = { 3, 4, 4, 5, 1, 4, 4 };
		int N = 5;

		System.out.println("The counters are: " + Arrays.toString(solution(N, A)));

	}

	public static int[] solution(int N, int[] A) {

		int[] counters = new int[N];
		// The Max value between all counters at a given time
		int max = 0;

		// The base Max that all counter should have after the "max counter" operation
		// happens
		int baseMax = 0;

		for (int i = 0; i < A.length; i++) {

			// max counter Operation ==> updating the baseMax
			if (A[i] > N) {
				// Set The Base Max that all counters should have
				baseMax = max;
			}

			// Verify if the value is bigger than the last baseMax because at any time a
			// "max counter" operation can happen and the counter should have the max value
			if (A[i] <= N && counters[A[i] - 1] < baseMax) {
				counters[A[i] - 1] = baseMax;
			}

			// increase(X) Operation => increase the counter value
			if (A[i] <= N) {
				counters[A[i] - 1] = counters[A[i] - 1] + 1;

				// Update the max
				max = Math.max(counters[A[i] - 1], max);
			}
		}

		// Set The remaining values to the baseMax as not all counters are guaranteed to
		// be affected by an increase(X) operation in "counters[A[i] - 1] = baseMax;"
		for (int j = 0; j < N; j++) {
			if (counters[j] < baseMax)
				counters[j] = baseMax;
		}

		return counters;
	}
}

//MaxCounters
//Calculate the values of counters after applying all alternating operations: increase counter by 1; set value of all counters to current maximum.

//You are given N counters, initially set to 0, and you have two possible operations on them:
//
//increase(X) − counter X is increased by 1,
//max counter − all counters are set to the maximum value of any counter.
//A non-empty array A of M integers is given. This array represents consecutive operations:
//
//if A[K] = X, such that 1 ≤ X ≤ N, then operation K is increase(X),
//if A[K] = N + 1 then operation K is max counter.
//For example, given integer N = 5 and array A such that:
//
//    A[0] = 3
//    A[1] = 4
//    A[2] = 4
//    A[3] = 6
//    A[4] = 1
//    A[5] = 4
//    A[6] = 4
//the values of the counters after each consecutive operation will be:
//
//    (0, 0, 1, 0, 0)
//    (0, 0, 1, 1, 0)
//    (0, 0, 1, 2, 0)
//    (2, 2, 2, 2, 2)
//    (3, 2, 2, 2, 2)
//    (3, 2, 2, 3, 2)
//    (3, 2, 2, 4, 2)
//The goal is to calculate the value of every counter after all operations.
//
//Write a function:
//
//class Solution { public int[] solution(int N, int[] A); }
//
//that, given an integer N and a non-empty array A consisting of M integers, returns a sequence of integers representing the values of the counters.
//
//Result array should be returned as an array of integers.
//
//For example, given:
//
//    A[0] = 3
//    A[1] = 4
//    A[2] = 4
//    A[3] = 6
//    A[4] = 1
//    A[5] = 4
//    A[6] = 4
//the function should return [3, 2, 2, 4, 2], as explained above.
//
//Write an efficient algorithm for the following assumptions:
//
//N and M are integers within the range [1..100,000];
//each element of array A is an integer within the range [1..N + 1].