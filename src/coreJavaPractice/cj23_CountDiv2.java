package coreJavaPractice;

public class cj23_CountDiv2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int A = 6, B = 11, K = 2;
		int A = 11, B = 345, K = 17;
		// int A = 0, B = 0, K = 11;
		// int A = 0, B = 0, K = 1;
		// int A = 1, B = 1, K = 1;
		// int A = 10, B = 10, K = 5;
		// int A = 10, B = 10, K = 7;
		// int A = 10, B = 10, K = 20;
		// int A = 0, B = 2000000000, K = 1;

		System.out.println("The Count Div number is: " + solution(A, B, K));

	}

	public static int solution(int A, int B, int K) {

		if (A == 0 && B == 0) {
			return 1;
		} else if (A == 0) {
			return B / K + 1;
		}

		return (B / K - (A - 1) / K);
	}
}

//CountDiv
//Compute number of integers divisible by k in range [a..b].
//
//Write a function:
//
//class Solution { public int solution(int A, int B, int K); }
//
//that, given three integers A, B and K, returns the number of integers within the range [A..B] that are divisible by K, i.e.:
//
//{ i : A ≤ i ≤ B, i mod K = 0 }
//
//For example, for A = 6, B = 11 and K = 2, your function should return 3, because there are three numbers divisible by 2 within the range [6..11], namely 6, 8 and 10.
//
//Write an efficient algorithm for the following assumptions:
//
//A and B are integers within the range [0..2,000,000,000];
//K is an integer within the range [1..2,000,000,000];
//A ≤ B.
