public class Main {

	public static void kadanes(int arr[]) {
		int maxSum = Integer.MIN_VALUE;
		int curSum = 0;

		for(int i = 0; i < arr.length; i++) {
			curSum += arr[i];
			
			//Eliminating Negative
			if (curSum < 0) {
				curSum = 0;
			}
			//Finding Max Sum
			maxSum = Math.max(curSum, maxSum);
		}
		System.out.println("Max Sum: " + maxSum);
	}

	public static void main(String[] args) {
		int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};

		kadanes(arr);

	}
}