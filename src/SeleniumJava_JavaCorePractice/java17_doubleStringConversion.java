package SeleniumJava_JavaCorePractice;

public class java17_doubleStringConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dnum = 88.999;
		String str = String.valueOf(dnum);

		System.out.println(str + 11.1); // should get 88.99911.1
	}

}

//conversion using valueOf() method