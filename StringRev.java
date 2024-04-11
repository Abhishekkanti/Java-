class Solution {
    
    public void reverseString(String str) {
        String temp = " ";
        for(int i=str.length()-1;i>=0;i--){
            temp+= str.charAt(i);
        }
        System.out.println(temp);
    }
    
    public void replaceString(String str){
        String res =" ";
        // it works as array and splits at " "
        String arr[] = str.split(" ");
        
        for(int i=arr.length-1;i>=0;i--){
            res+= arr[i]+" ";
        }
        System.out.println(res);
    }
    
    public void advanceRev(String str){
        String res= " ";
        String arr[] = str.split(" ");
        
        for(String ch : arr){
            for(int i=ch.length()-1;i>=0;i--){
                res += ch.charAt(i);
            }
            res += " ";
        }
        
        System.out.println(res);
    }
    
    
}
public class Main {
	public static void main(String[] args) {
		String str = "hello world";
		Solution sol = new Solution();
		
		System.out.println("Case 1");
		//reverse 
		sol.reverseString(str);
		
		System.out.println();
		System.out.println("Case 2");
		//word position swap
		sol.replaceString("hello world");
		
		System.out.println();
		System.out.println("Case 3");
		//word + position
		sol.advanceRev(str);
	}
}