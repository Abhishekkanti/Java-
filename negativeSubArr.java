import java.util.*;

public class Solution {

	public static int negativeSubArr(int arr[]) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {

			for (int j = i; j < arr.length; j++) {
				int sum = 0;
				for (int k = i; k < j; k++) {
				    sum += arr[k];
				}
				if(sum < 0) count++;
			}
		}
	return count;
}
public static void main(String[] args) {
	// int arr[] = {1,-2,4,-5,1};
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] arr = new int[n];

	for (int i = 0; i < n; i++) {
		arr[i] = sc.nextInt();
	}
	sc.close();

	System.out.println(negativeSubArr(arr));
}
}