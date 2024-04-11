import java.util.*;

public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int lastDigit =n;
		while(n>0){
		    lastDigit = n % 10;
		    System.out.print(lastDigit);
		    n = n / 10;
	
		}
	}
}