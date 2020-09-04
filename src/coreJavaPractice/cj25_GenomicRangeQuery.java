package coreJavaPractice;

import java.util.Arrays;
import java.util.HashMap;

public class cj25_GenomicRangeQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String S = "CAGCCTA";
		int[] P = { 2, 5, 0 };
		int[] Q = { 4, 5, 6 };

		System.out.println("The Result is: " + Arrays.toString(solution(S, P, Q)));

	}

	public static int[] solution(String S, int[] P, int[] Q) {
		HashMap<Character, Integer> nucMap = new HashMap<Character, Integer>();
		nucMap.put('A', 1);
		nucMap.put('C', 2);
		nucMap.put('G', 3);
		nucMap.put('T', 4);

		// List<Integer> minimalImpactFactor = new ArrayList<Integer>();
		int[] minimalImpactFactor = new int[P.length];

		System.out.println("Input String: " + S);

		for (int i = 0; i < P.length; i++) {
			int beginIndex = P[i];
			int endIndex = Q[i] + 1;
			// System.out.println("beginIndex: " + beginIndex + ", endIndex: " + endIndex);
			String nucStr = S.substring(beginIndex, endIndex);
			// System.out.print("i" + i + " - nucStr: " + nucStr);
			// System.out.println();

			if (nucStr.indexOf('A') != -1) {
				int nucInt = nucMap.get('A');
				minimalImpactFactor[i] = nucInt;
			} else if (nucStr.indexOf('C') != -1) {
				int nucInt = nucMap.get('C');
				// System.out.println("i=" + i + ", nucInt=" + nucInt);
				minimalImpactFactor[i] = nucInt;
			} else if (nucStr.indexOf('G') != -1) {
				int nucInt = nucMap.get('G');
				minimalImpactFactor[i] = nucInt;
			} else if (nucStr.indexOf('T') != -1) {
				int nucInt = nucMap.get('T');
				minimalImpactFactor[i] = nucInt;
			}
		}
		return minimalImpactFactor;
	}

}

//GenomicRangeQuery
//
//Find the minimal nucleotide from a range of sequence DNA.
//
//A DNA sequence can be represented as a string consisting of the letters A, C, G and T, which correspond to the types of successive nucleotides in the sequence. Each nucleotide has an impact factor, which is an integer. Nucleotides of types A, C, G and T have impact factors of 1, 2, 3 and 4, respectively. You are going to answer several queries of the form: What is the minimal impact factor of nucleotides contained in a particular part of the given DNA sequence?
//
//The DNA sequence is given as a non-empty string S = S[0]S[1]...S[N-1] consisting of N characters. There are M queries, which are given in non-empty arrays P and Q, each consisting of M integers. The K-th query (0 ≤ K < M) requires you to find the minimal impact factor of nucleotides contained in the DNA sequence between positions P[K] and Q[K] (inclusive).
//
//For example, consider string S = CAGCCTA and arrays P, Q such that:
//
//    P[0] = 2    Q[0] = 4
//    P[1] = 5    Q[1] = 5
//    P[2] = 0    Q[2] = 6
//The answers to these M = 3 queries are as follows:
//
//The part of the DNA between positions 2 and 4 contains nucleotides G and C (twice), whose impact factors are 3 and 2 respectively, so the answer is 2.
//The part between positions 5 and 5 contains a single nucleotide T, whose impact factor is 4, so the answer is 4.
//The part between positions 0 and 6 (the whole string) contains all nucleotides, in particular nucleotide A whose impact factor is 1, so the answer is 1.
//Write a function:
//
//class Solution { public int[] solution(String S, int[] P, int[] Q); }
//
//that, given a non-empty string S consisting of N characters and two non-empty arrays P and Q consisting of M integers, returns an array consisting of M integers specifying the consecutive answers to all queries.
//
//Result array should be returned as an array of integers.
//
//For example, given the string S = CAGCCTA and arrays P, Q such that:
//
//    P[0] = 2    Q[0] = 4
//    P[1] = 5    Q[1] = 5
//    P[2] = 0    Q[2] = 6
//the function should return the values [2, 4, 1], as explained above.
//
//Write an efficient algorithm for the following assumptions:
//
//N is an integer within the range [1..100,000];
//M is an integer within the range [1..50,000];
//each element of arrays P, Q is an integer within the range [0..N − 1];
//P[K] ≤ Q[K], where 0 ≤ K < M;
//string S consists only of upper-case English letters A, C, G, T.