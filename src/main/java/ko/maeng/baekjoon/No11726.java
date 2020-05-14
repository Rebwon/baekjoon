package ko.maeng.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No11726 {  //Dn = Dn-1 + Dn-2
    static int[] arr = new int[1001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(dp(n));
    }

    public static int dp(int x){
        if(x==1) return 1;
        if(x==2) return 2;
        if(arr[x] != 0) return arr[x];
        return arr[x] = (dp(x-1) + dp(x-2)) % 10007;
    }
}
