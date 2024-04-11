/*
Anonymous Class : when we want to implement a interface for using its method but don't want to create a while class for a single use purpose we can use anonymous class during creatiin of objects.
Or when we want to create an object of an Interface.
It can be used once.

Anonymous Object : when we want to call an object for for once.
Syntax:- new Classname.method();
Eg:- new Demo.Show();

Lambda Expression: It is a simplified version for Anonymous Class. It can only be used on functional interface(interface with single method).
Syntax: (para) -> { statement};

if single statement then no need to use {}
*/

interface A{
    
    void drive(int avg);
    
}


public class Main {
	public static void main(String[] args) {
		
		//Anonymous Class 
//            A obj = new A(){
//		    public void drive(){
//		        System.out.println("Driving...");
//		    }
//	    };
	    
	    A obj = (avg) -> System.out.println("Driving..."+avg);
	    
	    obj.drive(16);
	}
}