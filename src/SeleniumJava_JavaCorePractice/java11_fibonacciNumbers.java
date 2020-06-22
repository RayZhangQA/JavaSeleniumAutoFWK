package SeleniumJava_JavaCorePractice;

import java.util.Scanner;

public class java11_fibonacciNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num, a = 0, b = 0, c = 1;
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of times");
		num = in.nextInt();
		System.out.println("Fibonacci Series of the number is:");
		for (int i = 0; i < num; i++) {
			a = b;
			b = c;
			c = a + b;
			System.out.println(a + ""); // if you want to print on the same line, use print()
		}

	}

}

//Fibonacci series is a series of numbers where after the initial two numbers, 
//every occurring number is the sum of two preceding numbers.
//For Example 0,1,1,2,3,5,8,13,21………

//1. use Scanner class again with nextInt (discussed above). 
//2. enter (through command line) the number of times the Fibonacci has to iterate. 
//3. declare the integer num and initialized a,b with zero and c with one. 
//4. use for loop to iterate.
//5. a is set with the value of b which is 0, 
//6. b is set with the value of c which is 1. 
//7. c is set with the sum of both a and b.