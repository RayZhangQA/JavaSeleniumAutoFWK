package coreJavaPractice;

public class cj12_longestGapOfBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int inputNumber = 1041; //10000010001
		int inputNumber1 = 248016; // 111100100011010000
		int inputNumber2 = 144447; // 100011010000111111
		// int inputNumber = 18055; // 100011010000111

		// solution(inputNumber);

		System.out.println(inputNumber1 + " longest binary gap is " + solution(inputNumber1));
		System.out.println(inputNumber1 + " longest binary gap is " + solution(inputNumber2));

	}

	public static int solution(int N) {

		String str = Integer.toBinaryString(N);
		System.out.println("The binary String is " + str);

		int countGap = 0;
		int gapLength = 0;
		int longestGap = 0;

		for (int i = 0; i < str.length() - 1; i++) {

			char charI = str.charAt(i);
			// System.out.println("The " + i + " char is: " + str.charAt(i));

			if (str.charAt(i) == '0') { // if the char is 0, start counting the gap
				countGap = countGap + 1;

				if (str.charAt(i + 1) == '1') { // if the char is 0 and followed by 1, end counting the gap
					gapLength = countGap;

					if (gapLength > longestGap) { // find the longestGap
						longestGap = gapLength;
					}
				}
			} else {
				countGap = 0; // reset countGap,
			}
		}
		return longestGap;

	}
}
