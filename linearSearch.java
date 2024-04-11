import java.util.*;

public class Main {

public static int linearSearch(int num[], int key){
		for (int i = 0; i < num.length; i++) {
			if (num[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
		System.out.print("Enter Value of Key: ");
		int key = sc.nextInt();
		sc.close();

		int index = linearSearch(num, key);

		if(index == -1){
			System.out.println("Not Found");
		} 
		else{
			System.out.println("Found at: "+index);
		}

	}
}