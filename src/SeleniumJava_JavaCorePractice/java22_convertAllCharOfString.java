package SeleniumJava_JavaCorePractice;

public class java22_convertAllCharOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Welcome to Veeva!";
		for (int i = 0; i < str.length(); i++) {
			char character = str.charAt(i);
			System.out.println("char at " + i + " index is: " + character);
		}

	}

}
