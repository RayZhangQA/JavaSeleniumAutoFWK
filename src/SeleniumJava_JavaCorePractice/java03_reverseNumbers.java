package SeleniumJava_JavaCorePractice;

public class java03_reverseNumbers {

	public static void main(String[] args) {
		long number = 123456325;
		java03_reverseNumbers input = new java03_reverseNumbers();

		System.out.println("Input value : " + number);
		System.out.println("Inverted value : " + input.doInvert(number));

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
