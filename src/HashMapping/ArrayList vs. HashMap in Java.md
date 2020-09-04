Difference between HashSet and HashMap
BY CHAITANYA SINGH | FILED UNDER: JAVA.UTIL PACKAGE

In this article we are gonna discuss the differences between HashSet and HashMap classes.

HashSet vs HashMap
Differences:

				HASHSET													HASHMAP
HashSet class implements the Set interface					HashMap class implements the Map interface

In HashSet we store objects(elements or values) e.g. 		HashMap is used for storing key & value pairs. 
If we have a HashSet of string elements 					In short it maintains the mapping of key & value
then it could depict a set of HashSet elements:				(The HashMap class is roughly equivalent to Hashtable, 
 {“Hello”, “Hi”, “Bye”, “Run”}								except that it is unsynchronized and permits nulls.) 
 															This is how you could represent HashMap elements
 															if it has integer key and value of String type:
 															e.g. {1->”Hello”, 2->”Hi”, 3->”Bye”, 4->”Run”}															
 
HashSet does not allow duplicate elements that means 		HashMap does not allow duplicate keys however
you can not store duplicate values in HashSet.				it allows to have duplicate values.
 
HashSet permits to have a single null value.				HashMap permits single null key and any number of null values.

Similarities:
1) Both HashMap and HashSet are not synchronized which means they are not suitable for thread-safe operations 
unitl unless synchronized explicitly. This is how you can synchronize them explicitly:

	HashSet:
		Set s = Collections.synchronizedSet(new HashSet(...));

	HashMap:
		Map m = Collections.synchronizedMap(new HashMap(...));
		
2) Both of these classes do not guarantee that the order of their elements will remain constant over time.

3) If you look at the source code of HashSet then you may find that it is backed up by a HashMap. 
So basically it internally uses a HashMap for all of its operations.

4) They both provide constant time performance for basic operations such as adding, removing element etc.

HashSet example
		import java.util.HashSet;
		class HashSetDemo{ 
		  public static void main(String[] args) {
		     // Create a HashSet
		     HashSet<String> hset = new HashSet<String>();
		 
		     //add elements to HashSet
		     hset.add("AA");
		     hset.add("BB");
		     hset.add("CC");
		     hset.add("DD");
		 
		     // Displaying HashSet elements
		     System.out.println("HashSet contains: ");
		     for(String temp : hset){
		        System.out.println(temp);
		     }
		  }
		}
Output:
	HashSet contains: 
	AA
	BB
	CC
	DD

HashMap example
			import java.util.HashMap;
			class HashMapDemo{ 
			  public static void main(String[] args) {
			     // Create a HashMap
			     HashMap<Integer, String> hmap = new HashMap<Integer, String>();
			 
			     //add elements to HashMap
			     hmap.put(1, "AA");
			     hmap.put(2, "BB");
			     hmap.put(3, "CC");
			     hmap.put(4, "DD");
			 
			     // Displaying HashMap elements
			     System.out.println("HashMap contains: "+hmap);
			  }
			}
Output:
	HashMap contains: {1=AA, 2=BB, 3=CC, 4=DD}