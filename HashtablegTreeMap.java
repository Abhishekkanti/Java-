import java.util.*;

public class Main {
	public static void main(String[] args) {

		//it is Synchronized means multiple threads can work same time
		//Insertion Order is not assured.
		//key and value cannot be Null.
		//value can be repeated.
		//key should be unique
		//key and value can be of any datatype.
		Hashtable ht = new Hashtable();
		ht.put(01, "Chahal"); //key,value
		ht.put("Leader", "Hardik");
		ht.put(03, "Rohit");
		ht.put("Captain", "Iyer");
		System.out.println(ht);

		//Adds if not present else ignores it
		ht.putIfAbsent(03, "Rohit");
System.out.println();


		TreeMap tm = new TreeMap();
		//Insertion Order is not maintained but Sorts the keys in ascending.
		tm.put(01, "Chahal"); //key,value
		tm.put(04, "Hardik");
		tm.put(03, "Rohit");
		tm.put(02, "Iyer");
		System.out.println(tm);

	}
}