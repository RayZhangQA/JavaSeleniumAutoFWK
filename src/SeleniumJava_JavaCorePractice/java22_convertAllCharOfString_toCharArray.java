package SeleniumJava_JavaCorePractice;

public class java22_convertAllCharOfString_toCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Welcome!";
		char[] ch = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			System.out.println("char at " + i + " index is: " + ch[i]);
		}
	}
}
