package coreJavaPractice;

public class cj05_ifElseCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * If/else Loop only runs one time. The condition is true, goes to if loop. The
		 * condition is false, goes to else loop. For Loop will be continuously running
		 */

		/*
		 * if (5>2) { System.out.printin("Success"); } else {
		 * System.out.println("Failed"); }
		 */

		for (int i = 0; i < 10; i = i + 2) {
			if (i == 8)
				System.out.print("8 is Displayed.");
			else
				System.out.print("8 is not Displayed.");
		}
	}

}
