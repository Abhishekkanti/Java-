abstract class Aeroplane {
    
    abstract public void takeOff();
    abstract public void fly();

}

class passPlane extends Aeroplane {
    
    public void takeOff(){
       System.out.println("Passengers plane taking off...");
    }
    
    public void fly(){
        System.out.println("Aeroplane is flies at medium height...");
    }
    
    public void Alert(){
        System.out.println("Alert Message.");
    }

}

class cargoPlane extends Aeroplane {
    
    public void takeOff(){
      System.out.println("Cargoplane taking off");
    }
    
    public void fly(){
        System.out.println("Cargo plane is flies at low height...");
    }

}

class fighterPlane extends Aeroplane {
    
    public void takeOff(){
       System.out.println("Fighter plane taking off...");
    }
    
    public void fly(){
        System.out.println("Fighter plane is flies at high height...");
    }
}


public class Main {
	public static void main(String[] args) {

		Aeroplane pp = new passPlane();
		pp.takeOff();
		pp.fly();
		
		/*you cannot called a method of an obj which is created using parent Data type if that method is not in parent class(ie:Specialized method).
		pp.Alert();

	    Downcasting:To fix this you can temporarily cast the obj to its child class. 
	    Eg:- ((cargoPlane) pp).alert();
		*/
		
		cargoPlane cp = new cargoPlane();
		cp.takeOff();
		cp.fly();
		
		fighterPlane fp = new fighterPlane();
		fp.takeOff();
		fp.fly();
		
/* As here all child class have their own overridden method the method in parent class has no use so we use abstract keyboard to hide and remove the block, and 
1)Each abstract class should have atleast one abstract method,
2) we can make reference of an Abstract class.
3) you cannot create an object for an Abstract class.eg:here you cannot make obj for Aeroplane class. 
4) Constructor & variables cannot be abstract.

Final Keyword before class is used to restricted a class from getting inherited through another class.

Final Keyword for method in parents class is used to restrict overriding of the that method but it can be accessed and used by child classes(cannot updated).

Final Keyword for variable is used to restrict the variable from updating or modification.

Final in StringBuffer or StringBuilder restricted string from overriding (change completly) but allow appending.
*/

	}
}