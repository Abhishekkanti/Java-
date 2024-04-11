public class Main {

	public static void subArr(int arr[]) {
		int ts = 0;
		int grandMax = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			int minSum = Integer.MAX_VALUE;
			int maxSum = Integer.MIN_VALUE;
			for (int j = i; j < arr.length; j++) {
				int currSum = 0;
				System.out.print("( ");
				for (int k = i; k <= j; k++) {
					System.out.print(+arr[k]);
					System.out.print(",");
					currSum += arr[k];
				}
				System.out.print(")");
				ts++;
				System.out.println();
				
                //Min Sum
				minSum = Math.min(currSum, minSum);
				
                //Max Sum
				maxSum = Math.max(currSum, maxSum);

				//Grand Max
				grandMax = Math.max(maxSum, grandMax);

				System.out.println("Sum of Sub arr: " + currSum);
			}
			System.out.println("Min Sum: " + minSum);
			System.out.println("Max Sum: " + maxSum);
			System.out.println();

		}
		System.out.println("Max Subarray of All:" + grandMax);
		System.out.println("Total Subarrays: " + ts);
	}

	public static void main(String[] args) {
		int arr[] = {1, -2, 6, -1, 3};
        int arr1[] = {5,4,-1,7,8};
		subArr(arr1);

	}
}