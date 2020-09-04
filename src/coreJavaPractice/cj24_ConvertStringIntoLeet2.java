package coreJavaPractice;

import java.util.HashMap;

public class cj24_ConvertStringIntoLeet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputStr1 = "Let's have some fun.";
		String inputStr2 = "C is for cookie, that's good enough for me";
		String inputStr3 = "By the power of Grayskull!";

		System.out.println(inputStr1 + " -> " + solution(inputStr1));
		System.out.println(inputStr2 + " -> " + solution(inputStr2));
		System.out.println(inputStr3 + " -> " + solution(inputStr3));
	}

	public static String solution(String inputStr) {

		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		hmap.put('a', 4);
		hmap.put('A', 4);
		hmap.put('e', 3);
		hmap.put('E', 3);
		hmap.put('i', 1);
		hmap.put('I', 1);
		hmap.put('o', 0);
		hmap.put('O', 0);
		hmap.put('s', 5);
		hmap.put('S', 5);
		hmap.put('t', 7);
		hmap.put('T', 7);
		hmap.put('b', 5);
		hmap.put('D', 5);

		StringBuilder sb = new StringBuilder(inputStr);

		for (int i = 0; i < sb.length(); i++) {

			char currentChar = sb.charAt(i);
			// System.out.println("currentChar: " + currentChar);
			if (hmap.containsKey(currentChar)) {

				int replaceInt = hmap.get(currentChar);
				// System.out.println("replaceInt: " + replaceInt);
				char replaceChar = (char) (replaceInt + '0');
				// System.out.println("replaceChar: " + replaceChar);
				sb.setCharAt(i, replaceChar);
			}

		}

		return sb.toString();
	}

}

//Objective: to convert a String into Leet.
//
//Replace certain letters with the mapping below:
//
//[a,A] -> 4
//[e,E] -> 3
//[i,I] -> 1
//[o,O] -> 0
//[s,S] -> 5
//[t,T] -> 7
//[b,D] -> 5
//
//Examples
//
//Let's have some fun. -> L37'5 h4v3 50m3 fun.
//C is for cookie, that's good enough for me -> C 15 f0r c00k13, 7h47'5 g00d 3n0ugh f0r m3
//By the power of Grayskull! -> By 7h3 p0w3r 0f Gr4y5kull!
