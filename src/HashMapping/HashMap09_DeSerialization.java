package HashMapping;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap09_DeSerialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> map = null;

		try {

			FileInputStream fis = new FileInputStream("hashmap.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);

			map = (HashMap) ois.readObject();
			ois.close();
			fis.close();

		} catch (IOException ioe) {

			ioe.printStackTrace();
			return;

		} catch (ClassNotFoundException c) {

			System.out.println("Class Not Found");
			c.printStackTrace();
			return;

		}

		System.out.println("Deserialized HashMap...");

		Set set = map.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry mentry = (Map.Entry) iterator.next();
			System.out.println("key: " + mentry.getKey() + ", Value: " + mentry.getValue());
		}

	}

}
