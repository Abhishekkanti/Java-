class Demo{
    
    public int add(int a,int b){
        return a+b;
    }
    
    public int add(int a,int b,int c){
        return a+b+c;
    }
    
    }

public class Main {
	public static void main(String[] args) {
		Demo obj = new Demo();
		System.out.println(obj.add(4,3,2));
		System.out.println(obj.add(4,3));
	}
}