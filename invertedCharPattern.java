import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your Number: ");
		int n = sc.nextInt();
		System.out.println();
		int no = 1;

		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print(" " + no + " ");
				no++;
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("Alphabets :\n");

		char ch = 'A';

		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print(" " + ch + " ");
				ch++;
			}
			System.out.println();
		}

	}
}