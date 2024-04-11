import java.util.*;

public class Main {

	public static void arrLargest(int num[]) {
		int max = Integer.MIN_VALUE;
		int min  = Integer.MAX_VALUE;
		for (int i = 0; i < num.length; i++) {
			if (num[i] > max) {
				max = num[i];
			} else if (num[i] < min) {
				min = num[i];
			}
		}
		System.out.println("Smallest: "+min);
		System.out.println("Largest: "+max);

	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[10] ;
		int s = 0;

		System.out.print("Enter array: ");
		int i = 0;
		while (i < 10) {
			s = sc.nextInt();
			num[i] = s;
			i++;
		}
		sc.close();

		System.out.println();
		arrLargest(num);


	}
}