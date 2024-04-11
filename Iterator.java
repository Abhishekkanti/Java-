import java.util.*;
import java.util.concurrent.*;

public class Main {
	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add(100);
		al.add(200);
		al.add("hello");
		al.add('I');
		al.add(2.1);
		System.out.println(al);

		System.out.println("*********************");

		//For Loop
		for (int i = 0; i < al.size(); i++) {
			//used object data type because ele are stored in form of objects.
			Object o = al.get(i);
			System.out.println(o);

		}

		System.out.println("*********************");
		//for each
		for (Object o : al) {
			System.out.println(o);
		}
		
		System.out.println("*********************");
//Iterator: it can be used to access data from collections where we cannot access ele using index.
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("*********************");
		
		//can only work with List
		//can traverse in reverse.
		ListIterator li = al.listIterator(al.size());
		while (li.hasPrevious()) {
			System.out.println(li.previous());
		}
		
		//while using for/foreach loop for accessing ele of collections, it could be stuck in infinite loop while modifing it during runtime(adding ele) and this could result in an failfast error.
		
		//FailFast : if while iterating over a AL using Iterator if we dynamic modify the array while accessing it it will raise a exception.
		System.out.println("Fail Safe");
		//FailSafe : to address this issue and ignore error we use a CopyOfWriteArrayList array list and iterate over it, by using this it will ignore the error. CopyOnWriteArrayList cal = new CopyOnWriteArrayList();
		
		CopyOnWriteArrayList cal = new CopyOnWriteArrayList();
		
		cal.add(100);
		cal.add(200);
		cal.add("hello");
		cal.add('I');
		cal.add(2.1);
		
		System.out.println(al);
		
		Iterator cit = cal.iterator();
		
		while(cit.hasNext()){
		    System.out.println(cit.next());
		}
		
	}
}