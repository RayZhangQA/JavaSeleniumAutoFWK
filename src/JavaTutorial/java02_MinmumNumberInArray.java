package JavaTutorial;

import java.util.Arrays;

public class java02_MinmumNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[][] = { { 2, 4, 5, 145 }, { 3, 0, 7, 9 }, { 1, 2, 9, 56 } };
		int minNum = array[0][0];
		int maxNum = array[0][0];
		int colNum = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (array[i][j] < minNum) {
					minNum = array[i][j];
					colNum = j;
				}
			}
			System.out.println(Arrays.toString(array[i]));
		}

		for (int k = 0; k < 3; k++) {
			if (array[k][colNum] > maxNum) {
				maxNum = array[k][colNum];
			}
		}
		System.out.println("The minmum number in the Array is: " + minNum);
		System.out.println("The maxNum in the same col of minNum is :" + maxNum);
	}

}
