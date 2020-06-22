package SeleniumJava_JavaCorePractice;

public class java05_findTwoMaxValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int list[] = { 15, 24, 48, 21, 43, 11, 79, 93 };

		java05_findTwoMaxValues max = new java05_findTwoMaxValues();
		max.GetTwoMaxValues(list);
	}

	public void GetTwoMaxValues(int[] nums) {

		int maxOne = 0;
		int maxTwo = 0;
		for (int n : nums) {
			if (maxOne < n) {
				maxTwo = maxOne;
				maxOne = n;
			} else if (maxTwo < n) {
				maxTwo = n;
			}

		}

		System.out.println("Max1 - " + maxOne);
		System.out.println("Max2 - " + maxTwo);
	}

}
