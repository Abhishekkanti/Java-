import java.util.*;

public class Main {

	public static int binarySearch(int arr[], int key) {
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = (start + end) / 2;
			
			if (arr[mid] == key) {//Found
				return mid;
			}
			if(arr[mid] < key) {//Right Side 
				start = mid + 1;
			}else{//Left Side
				end = mid - 1;
			}
			
		}
    return -1;
	}

	public static void main(String[] args) {
		int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Key: ");
		int key = sc.nextInt();
		sc.close();

		if(binarySearch(arr, key) < 0){
		    System.out.println("Key Not Found. ");
		}else{
		   System.out.println("Found at Index: "+binarySearch(arr,key));
		}
	
	}
}