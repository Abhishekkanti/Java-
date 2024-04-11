import java.util.*;

public class Main {
	public static void main(String[] args) {
        //It implements ArrayDeque and ArrayQueue Interface.
        //It uses double ended queue
        //Index based accessing is not allowed
       //Operation are performed at only one end
       //Elements cannot be added in between.
		ArrayDeque ad = new ArrayDeque();
		
		//Adding ele to deque
		ad.add(100);
		ad.add(200);
		
	    //Add element at first position.
		ad.addFirst(50);
		//Add element at last position.
		ad.addLast(300);
		
		
		System.out.println(ad);
		
		
	}
}