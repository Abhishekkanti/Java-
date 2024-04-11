/*
A class inside a class is called a inner class.
There are 3 types of inner class:-
1) member : A normal class inside a class. you cannot directly call inner class method first you have to create the method format.

2) static : A static class inside a class.

3) Anonymous : when we want to implement a interface for using its method but only for once  we can use anonymous class. 

*/

class A{
    
    public void show(){
        System.out.println("Show method...");
    }
    //Inner Class
    class B{
          public void Display(){
              System.out.println("Display Method...");
          }
    }
}

public class Main {
	public static void main(String[] args) {
		A obj1 = new A();
		obj1.show();
		
		A.B obj2 = obj1.new B();
		//For Static Class
		//A.B obj2 = new A.B();
		obj2.Display();
	}
}