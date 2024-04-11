public class Main {

	public static void bubbleSort(int arr[]) {
		for(int turn = 0; turn<arr.length - 1; turn++){
			for (int j = 0; j < arr.length - 1 - turn; j++){
				if (arr[j] > arr[j + 1]) {
					//Swapping
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		printArr(arr);
	}

	public static void printArr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {1, 3, 8, 4, 2, 5, 7, 9, 0, 6};
		int arr2[] = {2,0,2,1,1,0};

		System.out.print("Before Sorting: ");
		printArr(arr2);

		System.out.println();
		System.out.println();
		
		System.out.print("After Sorting: ");
		bubbleSort(arr2);
	}
}