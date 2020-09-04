package JavaTutorial;

import java.text.SimpleDateFormat;
import java.util.Date;

public class java03_DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// current date and current time

		Date d = new Date();
		System.out.println(d.toString());

		// Print the Date format as: mm/dd/yyyy HH:MM:SS
		// https://www.tutorialspoint.com/java/java_date_time.htm
		SimpleDateFormat sdf = new SimpleDateFormat("M/dd/yyyy");
		System.out.println(sdf.format(d));

		SimpleDateFormat sd = new SimpleDateFormat("M/dd/yyyy hh:mm:ss");
		System.out.println(sd.format(d));
	}

}
