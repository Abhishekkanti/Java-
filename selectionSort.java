public class Main {

	public static void selectionSort(int arr[]) {
	    for(int i=0;i<arr.length;i++){
	        int min = i;
	        for(int j=i+1; j<arr.length; j++){
	            if(arr[min] > arr[j]){
	                min = j;
	            }
	        }
	        int temp = arr[min];
	        arr[min] = arr[i];
	        arr[i] = temp;
	    }
	    printArr(arr);

	}
	
	public static void printArr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}


	public static void main(String[] args) {
		int arr[] = {1, 3, 8, 4, 2, 5, 7, 9, 0, 10, 6};

		System.out.print("Before Sorting: ");
		printArr(arr);

		System.out.println();
		System.out.println();

		System.out.print("After Sorting: ");
		selectionSort(arr);
	}
}