import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter your Number: ");
		int n = sc.nextInt();
		int fact = 1;
		
		for(int i=1;i<=n;i++){
		    fact *= i;
		}
		
		System.out.println("Factorial of no :"+fact);
	}
}