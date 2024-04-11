public class Main {
	
	public static String type(int[] nums){
	    int prev = nums[0];
	    int flag = 0;
	    for(int i=1;i<nums.length-1;i++){
	        if(nums[i] == prev){
	            prev = nums[i];
	            flag = 1;
	        }else if(prev == nums[i+1]){
	            flag = 2;
	        }
	    }
	    
	    
	    if(flag == 1){
	         return "equilateral";
	    }else if(flag == 2){
	        return "isosceles";
	    }else{
	        return "scalene";
	    }
	    
	}
	
	public static void main(String[] args) {
		int[] arr= {8,4,2};
		System.out.println(type(arr));
	}
}