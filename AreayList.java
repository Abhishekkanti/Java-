import java.util.*;

public class Main {
	public static void main(String[] args) {
		//implements List interface 
		ArrayList al = new ArrayList();
		
		al.add(100);
		al.add(200);
		al.add("hello");
		al.add('I');
		al.add(2.1);
		System.out.println(al);
		
	//Or 
	//List<Integer> al2=Arrays.asList(2,4,6,8);
	//System.out.println(al2);
	
		//Return Index
		System.out.println(al.indexOf(200));
		//Checks Element.
		System.out.println(al.contains('I'));
		System.out.println(al);
		//return size
		System.out.println(al.size());
		//Add element at specific index(add element will shift forward)
		al.add(2,300);
		System.out.println(al);
		//Return ele of given index
		System.out.println(al.get(0));
		//Clear all items
		al.clear();
		System.out.println(al);
		
		
		
		
	}
}