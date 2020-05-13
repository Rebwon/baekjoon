package ko.maeng;

import java.util.Arrays;
import java.util.Scanner;

public class No10818 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String length = sc.nextLine();
		String value = sc.nextLine();
		int[] arr = new int[Integer.parseInt(length)];
		String[] stringArr = value.split(" ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(stringArr[i]);
		}

		Arrays.sort(arr);

		System.out.println(arr[0] + " " + arr[arr.length-1]);
	}
}
