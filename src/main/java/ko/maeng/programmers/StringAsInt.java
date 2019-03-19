package ko.maeng.programmers;

public class StringAsInt {
    public static void main(String[] args) {
        System.out.println(conversionInt("-1234"));
    }

    public static int conversionInt(String s) {
        Integer a = Integer.parseInt(s);
        return a;
    }

    public static int conversionInt2(String str) {
        boolean sign = true;
        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '-')
                sign = false;
            else if (ch != '+') {
                result = result * 10 + (ch - '0');
            }
        }
        return sign ? 1 : -1 * result;
    }
}
