package ko.maeng.baekjoon;

import java.util.Scanner;

public class No2440 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = n; i < j; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
