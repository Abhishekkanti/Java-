import java.util.*;

public class Main {
	public static void main(String[] args) {
		//it implements sorted set interface which implements set interface.
		//Index based accessing is not allowed
       //Elements cannot be added in between.
       
		TreeSet ts = new TreeSet();
		
		//it does not preserve order of insertion.
		//it follows Binary Search Tree DS.
		//it follows In Order Traversals(LVR).
		//cannot have duplicate data.
		//cannot have mixed data.
		//doesn't allows null values.
		ts.add(500);
		ts.add(50);
		ts.add(200);
		ts.add(400);
		ts.add(100);
		System.out.println(ts);
		//Returns the Higher ele then given one.(the given ele must be present in ts).
		System.out.println(ts.higher(100));
		//Returns the Lower ele then given one.
		System.out.println(ts.lower(100));
		
		//Return higher/lower value then given one,if the given ele is part of ts then returns same ele else it return next higher/lower.
		System.out.println(ts.ceiling(110));
		System.out.println(ts.floor(110));
	}
}