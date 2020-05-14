package ko.maeng.baekjoon;

import java.util.Scanner;

public class No2562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		for (int i = 0; i < 9; i++) {
			arr[i] = sc.nextInt();
		}

		int max = 0;
		int nth = 0;
		for (int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
				nth = i+1;
			}
		}
		System.out.println(max);
		System.out.println(nth);
	}
}
