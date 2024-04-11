public class Main {

//Prefix method for finding max sub array
	public static void maxSubArr(int arr[]) {
		int prefix[] = new int[arr.length];
		int maxSum = Integer.MIN_VALUE;
		int currSum = 0;
		prefix[0] = arr[0];

		for (int i = 1; i < prefix.length; i++) {
			prefix[i] =  prefix[i - 1] + arr[i];
		}

		for (int i = 0; i < arr.length; i++) {
			int start = i;
			for (int j = i; j < arr.length; j++) {
				int end = j;
				currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
				
				maxSum = Math.max(currSum,maxSum);

			}
		}
		System.out.println("Max Sum: " + maxSum);
	}

//Kadane's method to finding max sub array
	public static void kadanes(int arr[]) {
		int maxSum = Integer.MIN_VALUE;
		int curSum = 0;

		for (int i = 0; i < arr.length; i++) {
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
		int arr[] = {1, -2, 6, -1, 3};
		System.out.println("Using Prefix Method: ");
		maxSubArr(arr);
		System.out.println();
		System.out.println("Using kadane's Method");
		kadanes(arr);

	}
}