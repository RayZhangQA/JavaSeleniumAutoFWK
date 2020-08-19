package SeleniumJava_JavaCorePractice;

import java.util.Scanner;

public class java09_swap2NumsUse3rdVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x, y, temp;
		System.out.println("Enter x and y");
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		y = in.nextInt();
		System.out.println("Before Swapping: x=" + x + ", y=" + y);
		temp = x;
		x = y;
		y = temp;
		System.out.println("After Swapping: x=" + x + ", y=" + y);
	}

}

// 1. assigning temp or third variable with the value of x, 
// 2. assigning x with the value of y 
// 3. assigning y with the value of temp. 
//So, after the first complete iteration, 
// temp has a value of x, 
// x has a value of y 
// y has a value of temp (which is x).