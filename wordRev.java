public class Main {
	public static void main(String[] args) {
   	 String str = new String("hello");
        String res = " ";
        
        for(int i=str.length()-1;i>=0;i--){
            res += str.charAt(i);
        }
        
        for(int i=0;i<=res.length()-1;i++){
            System.out.print(res.charAt(i));
        }
	}
}