package ko.maeng;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No11727 {  //Dn = Dn-1 + 2 * Dn-2
    static int[] arr = new int[1001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(dp(n));
    }

    public static int dp(int n) {
        if(n==1) return 1;
        if(n==2) return 3;
        if(arr[n] != 0) return arr[n];
        return arr[n] = (dp(n-1) + 2*dp(n-2)) % 10007;
    }
}
