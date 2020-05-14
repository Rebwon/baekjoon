package ko.maeng.baekjoon;

import java.util.Scanner;

public class No2750s {
    public static void main(String[] args) {
        //버블 정렬
        Scanner sc = new Scanner(System.in);
        int[] array = new int[sc.nextInt()];
        int i, j, temp;

        for (int d = 0; d < array.length; d++) {
            array[d] = sc.nextInt();
        }

        for (i = 0; i < array.length - 1; i++) {
            for (j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        for (int k = 0; k < array.length; k++) {
            System.out.println(array[k]);
        }
    }
}
