public class Main {
	
	public static int trap(int[] height){
	    int start = height[0];
	    int res = 0;
	    for(int i = 1; i < height.length; i++){
	        int high = 0;
	        if(height[i] > start ){
	            high = height[i];
	        }
	        for(int j=start;j< high;j++){
	            res += start - height[j];
	        }
	    }
	    return res;
	    
	}
	
	public static void main(String[] args) {
		int[] arr = {4,2,0,3,2,5};
		int[] arr2 = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(trap(arr));
	}
}