public class Main {

	public static int trap(int[] height) {
		int n = height.length;
		
        //Calculate Left Max boundary of array
		int[] leftmax = new int[n];
		leftmax[0] = height[0];
		for (int i = 1; i < n; i++) {
			leftmax[i] = Math.max(height[i], leftmax[i - 1]);
		}

        //Calculate Rigth Max boundary of array
		int[] rightmax = new int[n];
		rightmax[n-1] = height[n - 1];
		for (int i = n-2; i >= 0; i--) {
			rightmax[i] = Math.max(height[i], rightmax[i + 1]);
		}
		
		int trapWater = 0;
		for(int i=0; i<n; i++){
            int waterLevel = Math.min(leftmax[i], rightmax[i]);
            trapWater += waterLevel - height[i];
		}
		
		return trapWater;
		
	}

	public static void main(String[] args) {
		//int[] arr = {4,2,0,6,3,2,5};
		int[] arr ={1,8,6,2,5,4,8,3,7};
		int[] arr2 = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
		System.out.println(trap(arr));
	}
}