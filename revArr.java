import java.util.*;

public class Main {
    //Method 1
	public static void revArrLoop(int arr[]) {

		int temp[] = new int[arr.length];
		int len = arr.length;

		for (int i = 0; i < arr.length; i++) {
			temp[len - 1] = arr[i];
			len--;
		}
		printArr(temp);
	}
	
    //Method 2
	public static void revArr(int arr[]) {
		int first = 0;
		int last = arr.length - 1;
		int temp;
		while (first < last) {
			temp = arr[last];
			arr[last] = arr[first];
			arr[first] = temp;
			first++;
			last--;
		}
		printArr(arr);

	}

//Print Function.
	public static void printArr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

		System.out.println("Original Array: ");
		printArr(arr);

		System.out.println();
		System.out.println("After Reversing: ");
		//revArr(arr);
		revArrLoop(arr);
	}
}