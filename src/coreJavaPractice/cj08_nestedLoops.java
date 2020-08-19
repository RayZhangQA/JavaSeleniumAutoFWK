package coreJavaPractice;

public class cj08_nestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Nested loops works
		for (int i = 1; i <= 4; i++) { // Outer for Loop - This block will loop for 4 times

			System.out.println("Outer Loop started" + i);
			for (int j = 1; j <= 4; j++) { // Inner for Loop
				System.out.println("Inner Loop" + j);
			}
			System.out.println("Outer Loop finished" + i);
		}
	}

}
