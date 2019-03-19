package ko.maeng.programmers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringIsInt {
    public static void main(String[] args) {
        System.out.println(isInt("-1234"));
    }

    public static boolean isInt(String s) {
        if (s.length() == 4 || s.length() == 6) {
            try {
                int x = Integer.parseUnsignedInt(s);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return false;
    }

    public static boolean isInt2(String s) {
        int length = s.length();
        if (length != 4 && length != 6) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (c < 48 || c > 57) {
                return false;
            }
        }
        return true;
    }

    public static boolean isInt3(String s) {
        boolean answer = true;
        Pattern p = Pattern.compile("^\\d{4}$");
        Matcher m = p.matcher(s);
        answer = m.matches();
        return answer;
    }

}
