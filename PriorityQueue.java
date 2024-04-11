import java.util.*;

public class Main {
	public static void main(String[] args) {
		//it implements queue interface
		//Index based accessing is not allowed
       //Operation are performed at only one end
       //Elements cannot be added in between.
       
		PriorityQueue pq = new PriorityQueue();
		
		//it does not preserve order of insertion.
		//it follows min heap DS.
		//can have duplicate data.
		//cannot have mixed data.
		//doesn't allows null values.
		//highest priority ele is ready available in front.
		pq.add(500);
		pq.add(50);
		pq.add(200);
		pq.add(400);
		pq.add(100);
		
		System.out.println(pq);
	}
}