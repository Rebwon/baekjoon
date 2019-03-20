package ko.maeng;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2747 {
    static int[] arr = new int[100];    //memoization기법으로 피보나치수열의 값을 구할때의 시간복잡도를 O(N)으로 만들어줌.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(fibonacci(n));
    }

    public static int fibonacci(int n) {
        if(n==1) return 1;
        if(n==2) return 1;
        if(arr[n] != 0) return arr[n];
        return arr[n] = fibonacci(n-1) + fibonacci(n-2);
    }
}
