package JavaTutorial;

public class java05_constructDemo {

	// Construct will not return values
	// Name of constructor should be the class name
	public java05_constructDemo() {
		System.out.println("I am in the constructor");
		System.out.println("I am in the constructor lecture 1");
	}

	// Parameterized constructor
	public java05_constructDemo(int a, int b) {
		System.out.println("I am in the patameterized constructor");
		System.out.println(a + b);
	}

	public java05_constructDemo(String str) {
		System.out.println(str);
	}

	public void getdata() {
		System.out.println("I am the method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java05_constructDemo cd = new java05_constructDemo();
		// compiler will call implicit constructor if you have not define any construct
		// when ever you create an object constructor is called
		// block of code when ever an object is created.

		java05_constructDemo cdp = new java05_constructDemo(4, 5);

		java05_constructDemo cdps = new java05_constructDemo("Hello, world");

	}

}
