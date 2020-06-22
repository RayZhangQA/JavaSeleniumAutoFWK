package SeleniumJava_JavaCorePractice;

public class java09_swap2NumsNo3rdVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numX = 10;
		int numY = 20;
		System.out.println("Pre-swapping state:");
		System.out.println("numX value: " + numX);
		System.out.println("numY value: " + numY);

		System.out.println("");

		numX = numX + numY;
		numY = numX - numY;
		numX = numX - numY;
		System.out.println("Post-swapping state:");
		System.out.println("numX value: " + numX);
		System.out.println("numY value: " + numY);

	}

}

// 1. assigning x with the value x + y, means x has the sum of both x and y
// 2. assigning y with the value x – y, here, x has the sum, y has the value of x
// 3. assigning x with the value x – y, finally, x get the value of y.