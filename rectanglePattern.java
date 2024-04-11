import java.util.*;

public class whileloop{
   public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
      
       System.out.println("Enter no. of Rows:");
       int row = sc.nextInt();
       
       System.out.println("Enter no. of Col:");
       int col = sc.nextInt();
       
   
       int i = 0;
       while(i<=row){
           int j = 0;
           while(j<=col){
               System.out.print("*");
               j++;
           }
           i++;
           System.out.println();
       }
}
}