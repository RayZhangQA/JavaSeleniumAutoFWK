package coreJavaPractice;

public class cj13_balanceOfPraenthesisEnhanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inputStr = "blah((a)blah())()";

		System.out.println("The Given String: \"" + inputStr + "\" balance of parenthesis is: " + solution(inputStr));

	}

	public static boolean solution(String str) {

		char char1 = '(';
		char char2 = ')';
		int count1 = (int) countOccurences(str, char1);
		int count2 = (int) countOccurences(str, char2);

		return count1 == count2;
	}

	public static long countOccurences(String s, char c) {
		return s.chars().filter(ch -> ch == c).count();
	}

}
