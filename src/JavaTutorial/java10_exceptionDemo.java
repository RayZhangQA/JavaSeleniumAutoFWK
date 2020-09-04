package JavaTutorial;

public class java10_exceptionDemo {

	int a = 4;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b = 7;
		int c = 0;
		// int k = b / c; // it will throw exception of " / by zero" and stop the
		// execution
		// Add try method to handle the exception, will continue the execution of the
		// rest codes with proper error message
		// one try can be followed by multiple catch blocks
		// catch should be an immediate block after try.

		try {
			// int k = b / c;
			// System.out.print(k);
			int arr[] = new int[5];
			System.out.println(arr[7]);

		} catch (ArithmeticException et) {
			System.out.println("The Arthimetic Exception is Catched");

		} catch (IndexOutOfBoundsException ets) {
			System.out.println("The Index Out Of Bounds Exception is Catched");

		} catch (Exception e) {
			//
			System.out.println("I catched the error/exception");

		} finally {
			System.out.println("Delete Cookies");
			// This block is executed irrespective of exception thrown or not.
			// Finally can be used without any catch block just followed by try block.
			// A finally block will not executed due to other conditions like when JVM runs
			// out of memory
			// when our java process is killed forcefully from task manager or console
			// when our machine shuts down due to power failure and deadlock condition in
			// our try block.
		}

	}

}
