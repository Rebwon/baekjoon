package ko.maeng.baekjoon;

import java.util.Scanner;

public class No2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   //5

        for (int i = 1; i < n + 1; i++) { //5
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*for(int i=1; i<n+1; i++){
            for(int j=n; i<j; j--){
                System.out.print("*");
            }
            System.out.println();
        }*/
    }
}
