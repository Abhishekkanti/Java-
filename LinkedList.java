import java.util.*;

public class Main {
	public static void main(String[] args) {
		//It implements List and deque interface 
		//It uses doubly Linked List
		LinkedList ll = new LinkedList();
		
		ll.add(100);
		ll.add(200);
		ll.add("hello");
		ll.add('I');
		ll.add(2.1);
		System.out.println(ll);
		
		//Return Index
		System.out.println(ll.indexOf(200));
		
		//Add element at first position.
		ll.addFirst("first");
		//Add element at last position.
		ll.addLast("last");
		
		//returns element at first position.
		System.out.println(ll.getFirst());
		//returns element at last position.
		System.out.println(ll.getLast());
		
		System.out.println(ll);
		//return size 
		System.out.println(ll.size());
		
		//Adds ele to specific index(No shifting is done,instead new node is created & connected)
		ll.add(3,300);
		System.out.println(ll);
		
		//Return ele of given index
		System.out.println(ll.get(0));
		
		//returns first element of LL(doesn't have any change in LL after operation)
		System.out.println(ll.peek());
		System.out.println(ll);
		
		//return first element of LL and pop it from the LL
		System.out.println(ll.poll());
		System.out.println(ll);
		
		
	}
}