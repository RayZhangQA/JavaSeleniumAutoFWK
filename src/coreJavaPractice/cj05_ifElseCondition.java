package coreJavaPractice;

public class cj05_ifElseCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * If/else Loop only runs one time. The condition is true, goes to if loop. The
		 * condition is false, goes to else loop. For Loop will be continuously running
		 */

		int a = 3;
		if (5 > a) {
			System.out.println("Success");
		} else {
			System.out.println("Failed");
		}

		for (int i = 0; i < 20; i = i + 2) {
			if (i == 8)
				System.out.println(i + " - 8 is Displayed.");
			else
				System.out.println(i + " - 8 is NOT Displayed.");
		}

		// Running Debug Mode in Eclipse - Double click the below line number to create
		// the breakpoint of Debug mode.
		// Then click
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
	}
}
