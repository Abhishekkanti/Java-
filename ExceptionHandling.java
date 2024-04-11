public class Main {
	public static void main(String[] args) {
		int num1 = 6;
		int num2 = 4;
		int result = 0;
		int[] arr = {0,3,5,6,9};
	
	 try{
		    result = num1/ num2; 
		    System.out.println(arr[8]);
	}
	 catch(ArithmeticException a){
	        System.out.println("Zero Division Error");
	}
	catch(ArrayIndexOutOfBoundsException e){
		   System.out.println("Array Out Of Bound");
     }
    catch(Exception e){
		    System.out.println("Error Occurred:"+e);
	}
		
    finally{
		System.out.println(result);
	}
	
  }
}