import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
		    System.out.print("Enter a Number :");
		    int n = sc.nextInt();
		    if(n % 5 == 0){
		        continue;
		    }
		    else{
		          System.out.println(" "+n);
		    }
		}
		
	}
}