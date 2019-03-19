package ko.maeng;

import java.util.Scanner;

public class No2750 {
    public static void main(String[] args) {
        //선택 정렬
        Scanner sc = new Scanner(System.in);
        int num, i, j, min, temp;
        int index = 0;

        int[] arr = new int[1001];
        num = sc.nextInt();
        for (i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        for (i = 0; i < num; i++) {
            min = 1001;
            for (j = i; j < num; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    index = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        for (i = 0; i < num; i++) {
            System.out.printf("%d\n", arr[i]);
        }
    }
}
