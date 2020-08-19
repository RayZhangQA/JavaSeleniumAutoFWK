package coreJavaPractice;

public class cj01_firstClass {

	int a = 5;
	String b = "This the string coming from 1st class!";

	// Methods can not be written inside the Main Method block. But need to be
	// inside the Class.
	// you need create an object to call the method
	// object are the instances/references of a class
	public String getData() {

		System.out.println("I am in firstClass Method.");
		return "hello";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.print("hi");
		// System.out.println("hello world!");

		cj01_firstClass fn = new cj01_firstClass();
		fn.getData();

		System.out.println(fn.b + fn.a);

		cj02_secondClass sn = new cj02_secondClass();
		sn.setData();
		// println mean print in a new line.
		// if you want to print something in the same line, just using print instead of
		// println
		System.out.println("Hello world!");
		// System.out.println(a);
	}

}
