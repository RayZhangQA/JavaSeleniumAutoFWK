package SeleniumJava_JavaCorePractice;

import java.util.Arrays;
import java.util.Comparator;

public class java24_sortStringArrayUsingComparator {

	public static void main(String a[]) {
		// TODO Auto-generated method stub

		String[] strArr = { "Java", "C++", "Perl", "Struts", "Python", "Go" };
		Arrays.sort(strArr, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});

		for (String str : strArr) {
			System.out.println(str);
		}

	}

}

//One of the utility method Arrays.sort() helps us 
//to sort an Array of objects by passing Comparator object, 
//where Comparator holds the sorting logic. 
//Above example shows how to sort an array using Comparator.