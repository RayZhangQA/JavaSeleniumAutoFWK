package coreJavaPractice;

public class cj10_reverseNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 12345678, reverse = 0;
		System.out.println("Input value : " + number);

		while (number != 0) {
			int digit = number % 10;
			reverse = reverse * 10 + digit;
			number /= 10;
		}
		System.out.println("Inverted value : " + reverse);

	}

}
