package ko.maeng;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().toUpperCase();
        int[] arr = new int[26];
        int n;
        int max = 0;
        char c = 0;

        for(int i=0; i<s.length(); i++){
            arr[s.charAt(i)-65]++;
            if(arr[s.charAt(i)-65] > max){
                c = s.charAt(i);
                max = arr[s.charAt(i)-65];
            }else if(max == arr[s.charAt(i)-65]){
                c = '?';
            }
        }
        System.out.println(c);
    }
}
