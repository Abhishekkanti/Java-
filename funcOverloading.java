public class Main {

	public static int Sum(int a, int b) {
		System.out.println("From int1");
		return a + b;
	}

	public static int Sum(int a, int b, int c) {
		System.out.println("Sum of 3: ");
		return a + b + c;
	}

   public static double Sum(double a, double b){
		System.out.println("From Double");
		return a + b;
	}
	
	public static void Sum(int[] arr){
		System.out.println("Anonymous Array");
	
		for(int n : arr){
		    System.out.print(n+" ");
		}
	}

	public static void main(String[] args) {
	     System.out.println(Sum(10, 25,40));
		//Anon Array or args 
		Sum(new int[] {1,2,3,6,5,4});
	}
}