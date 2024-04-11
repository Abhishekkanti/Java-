import java.util.*;

public class Main {
 public static void isAnagram(String s,String t){
	    //removing all white spaces or replacing 
	    String str = s.replace(" ","");
        String tar = t.replace(" ","");
        
        str = str.toLowerCase();
        tar = tar.toLowerCase();
        
        //to convert string in char Array
        char[] arr1 = str.toCharArray();
        char[] arr2 = tar.toCharArray();
        
        //to sort the array
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        //compare both the arrays
        if(Arrays.equals(arr1,arr2)){
            System.out.println("It is an Anagram");
        }else{
            System.out.println("It is not an Anagram");
        }
        
        
	}

         
	public static void main(String[] args) {

        isAnagram("Care","Race");
	}
}