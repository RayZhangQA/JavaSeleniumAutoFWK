package coreJavaPractice;

public class cj01_firstClass {

	int a = 5;

	// Methods can not be written inside the Main Method block. But need to be
	// inside the Class.
	// you need create an object to call the method
	// object are the instances/references of a class
	public String getDate() {

		System.out.println("I am in firstClass Method.");
		return "hello";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		cj01_firstClass fn = new cj01_firstClass();
		fn.getDate();
		System.out.println(fn.a);

		cj02_secondClass sn = new cj02_secondClass();
		sn.setDat();
		// println mean print in a new line.
		// if you want to print something in the same line, just using print instead of
		// println
		System.out.println("Hello world!");
		// System.out.println(a);
	}

}
