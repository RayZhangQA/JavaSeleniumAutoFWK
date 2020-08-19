package SeleniumJava_JavaCorePractice;

public class java03_reverseNumbersSample {

	public static void main(String[] args) {
		int number = 1234, reverse = 0;
		System.out.println("Input value : " + number);

		while (number != 0) {
			int digit = number % 10;
			reverse = reverse * 10 + digit;
			number /= 10;
		}

		System.out.println("Inverted value : " + reverse);

	}

}
