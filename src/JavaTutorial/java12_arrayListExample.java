package JavaTutorial;

import java.util.ArrayList;

public class java12_arrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ArrayList has dynamic size can grow dynamically where array has fixed size
		// Can accept duplicate values and access/insert any value in any index

		// ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<String> a = new ArrayList<String>();
		a.add("rahul");
		a.add("java");
		System.out.println(a);

		a.add(0, "student");
		System.out.println(a);

//		a.remove(1);
//		System.out.println(a);
//
//		a.remove("java");
//		System.out.println(a);

		System.out.println(a.get(2));
		System.out.println(a.indexOf("rahul"));
		System.out.println(a.contains("testing")); // Check if an specific String exists in the ArrayList
		System.out.println(a.isEmpty());
		System.out.println(a.size());
	}

}
