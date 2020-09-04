package JavaTutorial;

public class java08_staticVar {

	String name; // Instance Variables
	String address;
	static String city = "Bangalore"; // Static Variables - save memories, class variables
	static int i = 0;

	java08_staticVar(String name, String address) {

		this.name = name;
		this.address = address;

		i++;
		System.out.println(i);

	}

	public void getAddress() {
		System.out.println(address + ", " + city);
		// return address;
	}

	public static void getCity() {
		System.out.println(city); // Static method only able to call static variables.
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java08_staticVar obj = new java08_staticVar("Bob", "Marthalli");
		java08_staticVar obj1 = new java08_staticVar("Ram", "Jayangar");
		java08_staticVar obj2 = new java08_staticVar("Ram", "Jayangar");
		obj.getAddress();
		obj1.getAddress();

		java08_staticVar.getCity();
		java08_staticVar.i = 4;

	}

}
