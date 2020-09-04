package coreJavaPractice;

import java.util.Arrays;

public class cj14_rightRotateArrayNtimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int[] intArray = { 3, 8, 9, 7, 6, 1, -5, 2, 0, 11, 15, 18, 29, 222, 456,
		// 122};
		// int[] intArray = {};
		// int[] intArray = {0};
		int[] intArray = { 5, 8 };
		int rotateNum = 1;

		System.out.println("The original array: " + Arrays.toString(intArray));
		// System.out.println("Array Length is: " + intArray.length);

		System.out.println("The rotated array: " + Arrays.toString(rigthRotateArray(intArray, rotateNum)));
	}

	public static int[] rigthRotateArray(int[] array, int num) {

		for (int j = 1; j <= num; j++) { // right rotate the array by num times.

			if (array.length <= 1) {
				return array;
			}

			int temp = array[array.length - 1];
			for (int i = array.length - 1; i >= 1; i--) { // right rotate the array by 1 item.
				array[i] = array[i - 1];
			}
			array[0] = temp;
			// System.out.println("The " + j + " rotate: " + Arrays.toString(array));
		}
		return array;
	}
}

/*
 * An array A consisting of N integers is given. Rotation of the array means
 * that each element is shifted right by one index, and the last element of the
 * array is moved to the first place. For example, the rotation of array A = [3,
 * 8, 9, 7, 6] is [6, 3, 8, 9, 7] (elements are shifted right by one index and 6
 * is moved to the first place).
 * 
 * The goal is to rotate array A K times; that is, each element of A will be
 * shifted to the right K times.
 * 
 * Write a function:
 * 
 * class Solution { public int[] solution(int[] A, int K); }
 * 
 * that, given an array A consisting of N integers and an integer K, returns the
 * array A rotated K times.
 * 
 * For example, given
 * 
 * A = [3, 8, 9, 7, 6] K = 3
 * 
 * the function should return [9, 7, 6, 3, 8]. Three rotations were made:
 */
//[3, 8, 9, 7, 6] -> [6, 3, 8, 9, 7] 
//[6, 3, 8, 9, 7] -> [7, 6, 3, 8, 9]
//[7, 6, 3, 8, 9] -> [9, 7, 6, 3, 8]
/*
 * For another example, given
 * 
 * A = [0, 0, 0] K = 1 the function should return [0, 0, 0]
 * 
 * Given
 * 
 * A = [1, 2, 3, 4] K = 4 the function should return [1, 2, 3, 4]
 * 
 * Assume that:
 * 
 * N and K are integers within the range [0..100]; each element of array A is an
 * integer within the range [−1,000..1,000]. In your solution, focus on
 * correctness. The performance of your solution will not be the focus of the
 * assessment.
 */