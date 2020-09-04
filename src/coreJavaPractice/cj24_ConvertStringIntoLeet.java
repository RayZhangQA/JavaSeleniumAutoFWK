package coreJavaPractice;

public class cj24_ConvertStringIntoLeet {

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

		StringBuilder sb = new StringBuilder(inputStr);

		for (int i = 0; i < sb.length(); i++) {

			char currentChar = sb.charAt(i);

			switch (currentChar) {
			case 'a':
				sb.setCharAt(i, '4');
				break;
			case 'A':
				sb.setCharAt(i, '4');
				break;
			case 'e':
				sb.setCharAt(i, '3');
				break;
			case 'E':
				sb.setCharAt(i, '3');
				break;
			case 'i':
				sb.setCharAt(i, '1');
				break;
			case 'I':
				sb.setCharAt(i, '1');
				break;
			case 'o':
				sb.setCharAt(i, '0');
				break;
			case 'O':
				sb.setCharAt(i, '0');
				break;
			case 's':
				sb.setCharAt(i, '5');
				break;
			case 'S':
				sb.setCharAt(i, '5');
				break;
			case 't':
				sb.setCharAt(i, '7');
				break;
			case 'T':
				sb.setCharAt(i, '7');
				break;
			case 'b':
				sb.setCharAt(i, '5');
				break;
			case 'D':
				sb.setCharAt(i, '5');
				break;
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
