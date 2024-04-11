import java.util.*;


public class Main {
	public static void main(String[] args) {
		Vector v = new Vector();
		
		v.add(100);
		v.add(200);
		v.add(300);
		v.add(400);
		v.add(500);
		
		//System.out.println(v);
		
		//Enumeration: it is similar to Iterator but it only can iterate over stack and vector collections.
		Enumeration ev = v.elements();
		
		while(ev.hasMoreElements()){
		    System.out.println(ev.nextElement());
		} 
		
	}
}