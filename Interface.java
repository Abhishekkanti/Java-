interface A{
    
    int num = 9;
    void show();
    
    default void abc(){
        System.out.println("Non Static method");
    }
    
    static void pqr(){
        System.out.println("Static Method...");
    }
    
}

interface B{
    
    void show2();
}

class C implements A,B{
    
    public void show(){
        System.out.println("Show from C...");
    }
    
    public void show2(){
        System.out.println("Show from C,2...");
    }
}

public class Main {
	public static void main(String[] args) {
		System.out.println(A.num);
		
		C obj = new C();
		obj.show();
		
		obj.abc();
		A.pqr();
		

/*
1)All methods in interface a Abstract. And they are public static final. and same for variables.
2)you cannot instanciate interface(create obj).
3)To access a variable from interface into another class you need to access it using interface name(eg: A.num ). and you cannot update it after accessing it.
4)It is used to Create a design or base and reduce dependencies.
5)It is used to implement Multiple Inheritance.
6)It is implemented in a class using "implements" keyword.
7)you can create class with multiple interface implemented on it but that class should consists all the method that are present in both interfaces.
8) if you create obj of a class which has multiple interface implemented then it's type should be class name not name of interface(eg: A obj = new C(); wrong) if you want to use method from both interfaces because it implements both interfaces this cannot have 
single interface as type.
9) An interface can inherit another interface.
10) In java8 feature you can now define methods in interface using default and static type.
11) you can even override the default and static methods from ok interfaces.
*/
	}
}