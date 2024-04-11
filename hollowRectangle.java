import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter your Number: ");
		int n = sc.nextInt();
		System.out.println();
		
		for(int i=1;i<=n;i++){
		    //for print * in first and last row
		    if(i == 1 || i == n){
		        for(int j=1;j<=n;j++){ 
		            System.out.print(" * ");
	 	        }
	 	        
		    }
		    else {
		        System.out.print(" * ");
		        //for Spaces in all inside rows
		        for(int sp = 2; sp <= n-1; sp++){
		            System.out.print("   ");
		         }
		        System.out.print(" * ");
		    }
		    //New Line
		    System.out.println();
	    
		}

    }
}