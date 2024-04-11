import java.util.*; 

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your Number: ");             int n = sc.nextInt();
        boolean isPrime = true; 
   
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                isPrime = false;
                } 
        } 
        
        if(isPrime){
            System.out.println("Number is Prime ");
        }
        else{
            System.out.println("No. is Not Prime ");
        }
        
	}
}