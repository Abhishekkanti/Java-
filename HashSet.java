import java.util.*;

public class Main {
	public static void main(String[] args) {
		//it implements set interface.
		//Index based accessing is not allowed
		//Elements cannot be added in between.
		HashSet hs = new HashSet();

		//it does not preserve order of insertion.
		//it follows hash table to store data.
		//it has default capacity of 16 as 75% of it gets filled it doubles the capacity.
		//cannot have duplicate data.
		//can have mixed data.
		//doesn't allows null values.
		hs.add(500);
		hs.add(50);
		hs.add(200);
		hs.add(400);
		hs.add(100);

		System.out.println(hs);

System.out.println("**************************");
		//Linked Hash Set extends HashSet class.
		//it follows Hash table with Linked List.
		LinkedHashSet lhs = new LinkedHashSet();        
		lhs.add(500);
		lhs.add(50);
		lhs.add(200);
		lhs.add(400);
		lhs.add(100);

		System.out.println(lhs);

	}
}