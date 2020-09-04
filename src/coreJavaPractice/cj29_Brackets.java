package coreJavaPractice;

import java.util.Stack;

public class cj29_Brackets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String S = "{[()()](){[]}}";

		System.out.println("The Given String: " + S + " is properly nested!" + solution(S));

	}

	public static int solution(String S) {

		if (S.length() % 2 != 0)
			return 0;

		Stack charStack = new Stack();

		for (int i = 0; i < S.length(); i++) {

			char currentChar = S.charAt(i);
			if (isOpeningBracket(currentChar)) {
				charStack.push(currentChar);
			} else {
				if (charStack.size() == 0) {
					return 0;
				}
				char poppedChar = (char) charStack.pop();
				if (isBracketMatch(poppedChar, currentChar)) {
					continue;
				} else
					return 0;
			}
		}

		if (charStack.isEmpty())
			return 1;

		return 0;
	}

	private static boolean isBracketMatch(char poppedChar, char currentChar) {
		// TODO Auto-generated method stub
		if (poppedChar == '(' && currentChar == ')')
			return true;
		if (poppedChar == '[' && currentChar == ']')
			return true;
		if (poppedChar == '{' && currentChar == '}')
			return true;

		return false;
	}

	private static boolean isOpeningBracket(char currentChar) {
		// TODO Auto-generated method stub
		if (currentChar == '(' || currentChar == '[' || currentChar == '{') {
			return true;
		}
		return false;
	}
}
