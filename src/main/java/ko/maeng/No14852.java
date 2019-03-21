package ko.maeng;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No14852 {
    static final int MOD = (int)(1e+9)+7;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        long dp[] = new long[n+10];
        long dp2[] = new long[n+10];
        dp[1] = 2;
        dp[2] = 7;
        dp[3] = 22;
        dp2[3] = 1;
        for(int i=4; i<=n; i++){
            dp2[i] = (dp2[i-1]+dp[i-3])%MOD;
            dp[i] = (dp[i-2]*3+dp[i-1]*2+dp2[i]*2)%MOD;
        }
        System.out.println(dp[n]);
    }
}
