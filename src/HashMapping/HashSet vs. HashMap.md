Difference between ArrayList and HashMap in Java
BY CHAITANYA SINGH | FILED UNDER: JAVA COLLECTIONS

ArrayList and HashMap are two commonly used collection classes in Java. 
Even though both are the part of collection framework, the way they store and process the data is entirely different. 
In this post we will see the main differences between these two collections.

ArrayList vs HashMap in Java
1) 	Implementation: ArrayList implements List Interface while HashMap is an implementation of Map interface. 
	List and Map are two entirely different collection interfaces.

2) 	Memory consumption: ArrayList stores the element’s value alone and internally maintains the indexes for each element.

	ArrayList<String> arraylist = new ArrayList<String>();
	//String value is stored in array list
 	arraylist.add("Test String");

HashMap stores key & value pair. For each value there must be a key associated in HashMap. 
That clearly shows that memory consumption is high in HashMap compared to the ArrayList.

	HashMap<Integer, String> hmap= new HashMap<Integer, String>();
	//String value stored along with the key value in hash map
 	hmap.put(123, "Test String");
 	
3) Order: ArrayList maintains the insertion order while HashMap doesn’t. 
Which means ArrayList returns the list items in the same order in which they got inserted into the list. 
On the other side HashMap doesn’t maintain any order, the returned key-values pairs are not sorted in any kind of order.

4) Duplicates: ArrayList allows duplicate elements but HashMap doesn’t allow duplicate keys (It does allow duplicate values).

5) Nulls: ArrayList can have any number of null elements. HashMap allows one null key and any number of null values.

6) get method: In ArrayList we can get the element by specifying the index of it. In HashMap the elements is being fetched by specifying the corresponding key.