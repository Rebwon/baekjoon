package ko.maeng;

import java.util.Scanner;

public class No10817 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        int num = 0;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a > 0 && b > 0 && c > 0 && a < 101 && b < 101 && c < 101) {
            if ((b >= a && a >= c) || (c >= a) && (a >= b)) {
                num = a;
            } else if ((c >= b && b >= a) || (a >= b) && (b >= c)) {
                num = b;
            } else {
                num = c;
            }
        }
        System.out.println(num);
    }
}
