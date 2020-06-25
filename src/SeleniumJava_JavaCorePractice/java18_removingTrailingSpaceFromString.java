package SeleniumJava_JavaCorePractice;

public class java18_removingTrailingSpaceFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = " Java Coding Practice     ";
		int len = str.length();
		System.out.println("String Length: " + len);

		for (; len > 0; len--) {
			if (!Character.isWhitespace(str.charAt(len - 1)))
				break;
		}

		System.out.println(str.substring(0, len) + "The trailing whitespace is removed");
	}

}

//Trailing whitespace is any spaces or tabs after the last non-whitespace character on the line until the new line.