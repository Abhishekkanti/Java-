import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter your Number: ");
		int n = sc.nextInt();
    	System.out.println();
        
System.out.println("Method 1 :\n");
		for(int i=1; i<=n; i++){
		    for(int j=n; j>=i; j--){
		        System.out.print(" * ");
	 	    }
		    System.out.println();
	     }
	    
System.out.println("Method 2 :\n");

	     for(int row=n; row>=1 ;row--){
	         for(int col=1; col<=row; col++){
	             System.out.print(" * ");
	             }
	         System.out.println();
	      }

    }
}