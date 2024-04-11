import java.util.*;

public class Main {
	
	//Function for Factorial:
	public static int Fact(int num){
	    int fact = 1;
	    for(int i=1; i<=num; i++){
	         fact *= i; 
	    }
	    return fact;
	}
	
	//Function for Binomial Coefficient:
	public static int binoCoeff(int n, int r){
	    int a = Fact(n);
	    int b = Fact(r);
	    int c = Fact(n-r);
	    int res = a/(b*c);
	    return res;
	    }
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Value of N: ");
		int n = sc.nextInt();
		
	    System.out.print("Enter Value of R: ");
		int r = sc.nextInt();
		
		
		System.out.println("Binomial Coeff: "+binoCoeff(n,r));
		
		
	}
}