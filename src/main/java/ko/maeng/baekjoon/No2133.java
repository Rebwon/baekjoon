package ko.maeng.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2133 {   //Dn = 3 * dn-2 + 2 * dn-4 + 2 * dn-6 ... 2 * dn-0
    static int[] arr = new int[31];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(dp(n));
    }

    public static int dp(int n) {
        if(n==0) return 1;
        if(n==1) return 0;
        if(n==2) return 3;
        if(arr[n] != 0) return arr[n];
        int result = 3 * dp(n-2);
        for(int i=3; i<=n; i++){
            if(i%2==0){
                result += 2 * dp(n-i);
            }
        }
        return arr[n] = result;
    }
}
