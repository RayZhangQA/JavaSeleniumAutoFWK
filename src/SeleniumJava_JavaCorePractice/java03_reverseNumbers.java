package SeleniumJava_JavaCorePractice;

public class java03_reverseNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long lnum = 654321;
		java03_reverseNumbers input = new java03_reverseNumbers();

		System.out.println("Input value : " + lnum);
		System.out.println("Inverted value : " + input.doInvert(lnum));

	}

	public long doInvert(long number) {

		long invert = 0;
		while (number != 0) {
			invert = (invert * 10) + (number % 10);
			number = number / 10;
		}
		return invert;
	}

}
