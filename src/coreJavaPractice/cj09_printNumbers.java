package coreJavaPractice;

public class cj09_printNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1 2 3 4
		// 5 6 7
		// 8 9
		// 10
		int a = 0;

		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= 5 - i; j++) {
				a++;
				System.out.print(a + "\t");
			}
			System.out.println();
		}

		// 1
		// 2 3
		// 4 5 6
		// 7 8 9 10

		int b = 0;

		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= i; j++) {
				b++;
				System.out.print(b + "\t");
			}
			System.out.println();
		}

		// 3
		// 6 9
		// 12 15 18

		int C = 0;

		for (int i = 1; i <= 3; i++) {

			for (int j = 1; j <= i; j++) {
				C = C + 3;
				System.out.print(C + "\t");
			}
			System.out.println();
		}

		// 1
		// 1 2
		// 1 2 3
		// 1 2 3 4

		for (int i = 1; i <= 4; i++) {
			int d = 0;
			for (int j = 1; j <= i; j++) {
				d = d + 1;
				System.out.print(d + "\t");
			}
			System.out.println();
		}

	}

}
