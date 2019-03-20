package ko.maeng;

import java.util.Scanner;

public class SWMTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();   //2
        int b = sc.nextInt();   //1
        int n = sc.nextInt();   //5
        int day = 0;

        for(int i=1; i<5; i++){
            n -= a-b;
            if(day == 4){
                n -= 1;
            }
            day++;
        }

        System.out.println(day);
    }
}
