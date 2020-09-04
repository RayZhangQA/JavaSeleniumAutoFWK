package JavaTutorial;

public class java06_childDemo extends java06_parentDemo {

	String name = "QAClickAcademy";

	public java06_childDemo() {
		super(); // This should be always be at first line.
		System.out.println("Child Class Constructor");
	}

	public void getStringdata() {
		System.out.println(name);
		System.out.println(super.name);
	}

	public void getData() {
		super.getData();
		System.out.println("I am in child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java06_childDemo cd = new java06_childDemo();

		cd.getStringdata();
		cd.getData();
	}

}
