public class Main {

	public static void strPalindrome(String str){
		String res = "";
		
		for (int i = str.length() - 1; i >= 0; i--) {
			res += str.charAt(i);
		}
		System.out.println(res);
		
		if(str.equals(res)){
		    System.out.println("is Palindrome");
		}
		else{
		    System.out.println("Not Palindrome");
		}
		
	}

	public static void main(String[] args) {
	       String s = "madam";
        strPalindrome(s);
	}
}