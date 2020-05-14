package ko.maeng.baekjoon;

import java.util.Scanner;

public class No10952 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a;
		int b;
		do{
			a = sc.nextInt();
			b = sc.nextInt();
			if(a < 0 || b > 10) {
				break;
			}
			if(a == 0 && b == 0) {
				break;
			}
			System.out.println(a+b);
		}while(true);
	}
}
