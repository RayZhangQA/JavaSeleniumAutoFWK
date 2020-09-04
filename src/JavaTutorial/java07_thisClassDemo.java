package JavaTutorial;

public class java07_thisClassDemo {

	int a = 2;

	public void getData() {

		int a = 3;
		System.out.println(a);

		System.out.println(this.a);
		// This refers to current object scope lies in class level
		System.out.println(a + this.a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java07_thisClassDemo td = new java07_thisClassDemo();
		td.getData();

	}

}
