class Aeroplane {
    
    public void takeOff(){
       System.out.println("Aeroplane taking off.");
    }
    
    public void fly(){
        System.out.println("Aeroplane is flying...");
    }

}

class passPlane extends Aeroplane {
    
    public void takeOff(){
       System.out.println("Passengers plane taking off...");
    }
    
    public void fly(){
        System.out.println("Aeroplane is flies at medium height...");
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

class Airport extends Aeroplane{
    public void poly(Aeroplane ref){
        System.out.println("----------------------------------");
        
        ref.takeOff();
        ref.fly();
        
        System.out.println("----------------------------------");
    }
}


public class Main {
	public static void main(String[] args) {
		
		/*you also use parent class as data type for object.
		Aeroplane pp = new passPlane();*/
		passPlane pp = new passPlane();
		
		cargoPlane cp = new cargoPlane();
		
		fighterPlane fp = new fighterPlane();
		
		/* 
		pp.takeoff();
		pp.fly();
		
		Instead of writing multiple times create class and pass the Parent reference as parameter*/
		
		Airport aa = new Airport();
		aa.poly(pp);
		aa.poly(cp);
		aa.poly(fp);
		
		
	   /* You can create reference of a parent class and assign any child class to it and call it's all functions:
	  Aeroplane ref;
		
		ref = cp;
		ref.takeOff();
		ref.fly();
		*/
	}
}