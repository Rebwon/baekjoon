package ko.maeng;

import java.util.Scanner;

public class No10039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i] >= 40 ? arr[i] : 40;
        }
        System.out.println(sum / 5);
    }
}
