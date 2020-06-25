package SeleniumJava_JavaCorePractice;

import java.util.ArrayList;
import java.util.Collections;

public class java24_sortArrayListObject {

	@SuppressWarnings("unchecked")
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		ArrayList<Student> arraylist = new ArrayList<Student>();
//		arraylist.add(new Student(223, "Chaitanya", 26));
//		arraylist.add(new Student(245, "Rahul", 24));
//		arraylist.add(new Student(209, "Ajeet", 32));

		Collections.sort(arraylist);

		for (Student str : arraylist) {
			System.out.println(str);
		}
	}

	@SuppressWarnings("rawtypes")
	public class Student implements Comparable {
		private String studentname;
		private int rollno;
		private int studentage;

		public Student(int rollno, String studentname, int studentage) {
			this.rollno = rollno;
			this.studentname = studentname;
			this.studentage = studentage;
		}

		public String getStudentname() {
			return studentname;
		}

		public void setStudentname(String studentname) {
			this.studentname = studentname;
		}

		public int getRollno() {
			return rollno;
		}

		public void setRollno(int rollno) {
			this.rollno = rollno;
		}

		public int getStudentage() {
			return studentage;
		}

		public void setStudentage(int studentage) {
			this.studentage = studentage;
		}

		public int compareTo(Student comparestu) {
			int compareage = ((Student) comparestu).getStudentage();
			/* For Ascending order */
			return this.studentage - compareage;

			/* For Descending order do like this */
			// return compareage-this.studentage;
		}

		@Override
		public String toString() {
			return "[ rollno=" + rollno + ", name=" + studentname + ", age=" + studentage + "]";
		}

		@Override
		public int compareTo(Object o) {
			// TODO Auto-generated method stub
			return 0;
		}
	}

}
