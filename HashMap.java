import java.util.*;

public class Main {
	public static void main(String[] args) {

		
        //it is Non Synchronized means multiple threads cannot not work at same time.
		//Order Insertion is not assured.
		//key and value can be Null.
		//value can be repeated.
		//key should be unique
		//key and value can be of any datatype.
		HashMap hm = new HashMap();

		hm.put(01, "Virat"); //key,value
		hm.put("Leader", "Rahul");
		hm.put(03, "Rohit");
		hm.put("Captain", "Varun");

		//here Order of insertion is preseved
		LinkedHashMap lhm = new LinkedHashMap();

		lhm.put(01, "Virat");//entry
		lhm.put("Leader", "Rahul");
		lhm.put(03, "Rohit");
		lhm.put("Captain", "Varun");

		System.out.println(hm);
		System.out.println(hm.get(3));
		System.out.println();


		//Returns all keys in Set format
		System.out.println(hm.keySet());
		System.out.println("Or");
		Set k = hm.keySet();
		Iterator itk = k.iterator();

		while (itk.hasNext()) {
			System.out.println(itk.next());
		}
		System.out.println();


		//Returns all values in Collection format
		System.out.println(hm.values());
		System.out.println("Or");
		Collection c = hm.values();
		Iterator itc = c.iterator();

		while (itc.hasNext()) {
			System.out.println(itc.next());
		}
		System.out.println();
		
		
		//Returns all entries in Set format
		System.out.println(hm.entrySet());
		System.out.println("Or");
		Set e = hm.entrySet();
		Iterator ite = e.iterator();

		while (ite.hasNext()) {
			//System.out.println(ite.next());
			Map.Entry data = (Entry) ite.next();
			System.out.println(data.getKey() +":"+ data.getValue());
		}
	}
}