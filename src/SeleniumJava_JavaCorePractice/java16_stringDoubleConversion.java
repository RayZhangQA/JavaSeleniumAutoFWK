package SeleniumJava_JavaCorePractice;

public class java16_stringDoubleConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "100.222";
		double dnum = Double.parseDouble(str);

		System.out.println(dnum + 11.111); // Should get 111.333. Not 100.22211.111
	}

}
