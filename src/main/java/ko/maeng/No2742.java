package ko.maeng;

import java.util.Scanner;

public class No2742 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   //5
        int num = n;

        for (int i = 0; i < n; i++) { //5
            System.out.println(num);
            num--;
        }
    }
}
