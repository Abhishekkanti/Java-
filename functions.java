import java.util.*;

public class func {

    public static int Sum(int a,int b){
    	return a+b;
	}
	
	//call by value
	public static void printN(int a){
	    a*=2;
	    System.out.println("Function value: "+a);
	    }
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        
        System.out.print(" Sum :"+Sum(a,b)+"\n");
        
        int n = 4;
        System.out.println("Original value: "+n);
        printN(n);
        System.out.println("Original value: "+n);
        
	}
}