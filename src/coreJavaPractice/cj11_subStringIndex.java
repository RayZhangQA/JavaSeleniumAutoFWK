package coreJavaPractice;

import java.util.ArrayList;
import java.util.List;

public class cj11_subStringIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "babi thisisbaby whereisbaby bibyissleeping";
		String subStr = "is";

		solution(str, subStr);
	}

	public static List<Integer> solution(String sourceStr, String targetStr) {

		int index = sourceStr.indexOf(targetStr);// find out the index of subStr in str
		List<Integer> indexOfsubStr = new ArrayList<Integer>();

		while (index >= 0) { // if the subStr exists in str
			// System.out.println(index);
			indexOfsubStr.add(index); // add the index to indexOfsubStr
			index = sourceStr.indexOf(targetStr, index + 1);// find next index
		}
		System.out.println(indexOfsubStr);

		return indexOfsubStr;
	}

}

//Finds subString(subStr) in String(str) and return index of first character.
//Given str="babi thisisbaby whereisbaby bibyissleeping", subStr="baby", your return should be [11,23]
//if the subStr change to "is", your return should be [7,9,21,32]