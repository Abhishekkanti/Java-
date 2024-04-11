public class Main {
	public static void main(String[] args) {
	    
	   StringBuffer s = new StringBuffer("Sachin");
	   System.out.println(s.capacity());
       s.setCharAt(1,'A');
       System.out.println(s.capacity());
	   System.out.println(s);
	}
}