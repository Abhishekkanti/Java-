import java.util.*;

public class Main {
	public static void main(String[] args) {

		String str = "The quick brown fox jumps over the lazy dog";

		String s="abcdefghijklmnopqrstuvwxyz";
		str = str.replace(" ", "");
		str = str.toLowerCase();
		char[] ch = str.toCharArray();

//Method 1
		/*
				Arrays.sort(arr1);
				char[] arr2 = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

				if(ch.length==26 && Arrays.equals(ch, arr2)){
					System.out.println("Is Panagram");
				}
				else {
					System.out.println("Is not Panagram");
				}
		*/

//Method 2

		int[] temp = new int[26];
		boolean flag = false;
		for (int i = 0; i < ch.length; i++) {
			/* if all string char are lower case use 97 else use 65 for capital */
			temp[ch[i] - 97]++;
		}

		for (int j = 0; j < temp.length; j++) {
			if (temp[j] == 0) {
				flag = true;
			}
		}

		if (flag == false) {
			System.out.println("Is a Panagram");
		} else {
			System.out.println("Is not a Panagram");
		}

	}
}