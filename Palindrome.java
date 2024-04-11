import java.util.*;

public class Main {
   public static void isPalindrome(String args[]){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		int rem, temp, sum = 0;
		temp = x;

		while (x > 0) {
			rem = x % 10;
			sum = (sum * 10) + rem;
			x = x / 10;
		}
			if (temp == sum)
				System.out.println("Is Palindrome");
			else
			     System.out.println("Not Palindrome");
		
	}

}
