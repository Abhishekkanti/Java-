public class Main {
		public static void main(String[] args){
		int arr[][] = { {1,2,3,4}, 
		                     {5,6,7,8}, 
		                     {9,10,11,12}};
		                     
        for(int a[] : arr){
            for(int b : a){
                System.out.print(b+" ");
            }
            System.out.println();
        }		
        
	}
}