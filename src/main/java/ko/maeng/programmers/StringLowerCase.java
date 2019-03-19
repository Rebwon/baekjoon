package ko.maeng.programmers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringLowerCase {
    public static void main(String[] args) {
        String a = solution("Sacaqwf");
        System.out.println(a);
    }

    public static String solution(String s) {
        char temp = ' ';
        char[] str = s.toCharArray();
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = 1; j < s.length() - i; j++) {
                if (str[j - 1] < str[j]) {
                    temp = str[j - 1];
                    str[j - 1] = str[j];
                    str[j] = temp;
                }
            }
        }
        return new String(str);
    }

    public static String reverseStr(String str) {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);   //오름차순 정렬
        return new StringBuilder(new String(arr)).reverse().toString();
    }

    public static String reverseStr2(String str) {
        return Stream.of(str.split(""))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining());
    }

}
