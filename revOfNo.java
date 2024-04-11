import java.util.*;

public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int lastDigit =n;
		int rev =0;
		while(n>0){
		    lastDigit = n % 10;
		    rev = (rev*10)+lastDigit;
		    n = n / 10;
	
		}
		System.out.println(rev);
	}
}