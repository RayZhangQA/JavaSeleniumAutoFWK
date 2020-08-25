package coreJavaPractice;

public class cj13_balanceOfParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inputStr = "blah((a)blah()()";

		System.out.println("The Given String: \"" + inputStr + "\" balance of parenthesis is: " + solution(inputStr));

	}

	public static boolean solution(String str) {

		int count1 = (int) str.chars().filter(ch -> ch == '(').count();
		int count2 = (int) str.chars().filter(ch -> ch == ')').count();

		System.out.println("The count of '(' is " + count1);
		System.out.println("The count of ')' is " + count2);

		return count1 == count2;
	}
}

//Write a function which accepts a string and returns a boolean value 
//indicating whether the parenthesis are balanced.
//For example: Given s1="(()", your function should return false
//Given s1="blah((a)blah())()" your function should return true
