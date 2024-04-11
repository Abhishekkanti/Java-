import java.util.*;
import java.io.*;


public class Solution{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		int sum = 0;

		for (int i = 0; i < t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int n = sc.nextInt();

			int j = 0;
			while (j < n) {
				int s = (int)Math.pow(2, j) * b;
				sum = sum + s;
				int ss = sum + a;
				System.out.print(ss + " ");
				j++;
			}
			sum = 0;
			int ss = 0;
		}
		System.out.println("");
	}
}

