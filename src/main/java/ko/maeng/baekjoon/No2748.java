package ko.maeng.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2748 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(fibonacci2(n));
    }

    public static long fibonacci2(int n) {
        long a = 0;
        long b = 1;
        long c = 0;

        if(n == 1){
            return 1;
        }else{
            for(int i=1; i<n; i++){
                c=a+b;
                a=b;
                b=c;
            }
            return c;
        }
    }
}
