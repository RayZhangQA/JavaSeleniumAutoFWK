package SeleniumJava_JavaCorePractice;

public class java04_checkPrimeNumberA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 29;
		boolean flag = false;
		for (int i = 2; i <= num / 2; ++i) {
			// condition for nonprime number
			if (num % i == 0) {
				flag = true;
				break;
			}
		}

		if (!flag)
			System.out.println(num + " is a prime number.");
		else
			System.out.println(num + " is not a prime number.");
	}

}

// Prime numbers are numbers that have only 2 factors:
// 1 and themselves. For example, the first 5 prime numbers are 2, 3, 5, 7, and 11.
// By contrast, numbers with more than 2 factors are call composite numbers.

//In the above program, for loop is used to determine if the given number num is prime or not. 
//We only have to loop through 2 to half of num, because no number is divisible by more than its half.

//Inside the for loop, we check if the number is divisible by any number in the given range (2..num/2). 
//If it is, flag is set to true and we break out of the loop. This determines num is not a prime number.