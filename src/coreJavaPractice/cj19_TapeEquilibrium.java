package coreJavaPractice;

public class cj19_TapeEquilibrium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = { 999, -1000 };

		System.out.println("The minimal difference is: " + solution(A));

	}

	public static int solution(int[] A) {

		int minDiff = 0;
		int difference = 0;

		for (int i = 1; i < A.length; i++) {
			long sumPart1 = 0;
			long sumPart2 = 0;

			for (int x = 0; x < i; x++) {
				sumPart1 = sumPart1 + A[x];
				// System.out.println("x-" + x + " value: " + A[x]);
			}
			// System.out.println("loop " + i + " sumPart1: " + sumPart1);

			for (int y = i; y < A.length; y++) {
				sumPart2 = sumPart2 + A[y];
				// System.out.println("y-" + y + " value: " + A[y]);
			}
			// System.out.println("loop " + i + " sumPart2: " + sumPart2);

			difference = (int) Math.abs(sumPart1 - sumPart2);
			// System.out.println("loop " + i + " - the difference is: " + difference);

			if (i == 1) {
				minDiff = difference;
			} else {
				if (difference < minDiff) {
					minDiff = difference;
				}
			}
			// System.out.println("loop " + i + " minimal difference is " + minDiff);

		}

		return minDiff;

	}

}

// This solution Total Score: 53%. Task Score:53%, Correctness: 100%, Performance: 0% 

//Task description
//A non-empty array A consisting of N integers is given. Array A represents numbers on a tape.
//
//Any integer P, such that 0 < P < N, splits this tape into two non-empty parts: A[0], A[1], ..., A[P − 1] and A[P], A[P + 1], ..., A[N − 1].
//
//The difference between the two parts is the value of: |(A[0] + A[1] + ... + A[P − 1]) − (A[P] + A[P + 1] + ... + A[N − 1])|
//
//In other words, it is the absolute difference between the sum of the first part and the sum of the second part.
//
//For example, consider array A such that:
//
//  A[0] = 3
//  A[1] = 1
//  A[2] = 2
//  A[3] = 4
//  A[4] = 3
//We can split this tape in four places:
//
//P = 1, difference = |3 − 10| = 7
//P = 2, difference = |4 − 9| = 5
//P = 3, difference = |6 − 7| = 1
//P = 4, difference = |10 − 3| = 7
//Write a function:
//
//class Solution { public int solution(int[] A); }
//
//that, given a non-empty array A of N integers, returns the minimal difference that can be achieved.
//
//For example, given:
//
//  A[0] = 3
//  A[1] = 1
//  A[2] = 2
//  A[3] = 4
//  A[4] = 3
//the function should return 1, as explained above.
//
//Write an efficient algorithm for the following assumptions:
//
//N is an integer within the range [2..100,000];
//each element of array A is an integer within the range [−1,000..1,000].