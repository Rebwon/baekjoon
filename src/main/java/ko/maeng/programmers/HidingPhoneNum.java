package ko.maeng.programmers;

public class HidingPhoneNum {
    public static void main(String[] args) {
        System.out.println(solutaion("01033334444"));
        System.out.println(solutaion2("01033334444"));
    }

    public static String solutaion(String num){
        int leng = num.length();
        String a = num.substring(0, leng - 4).replaceAll("['0123456789']","*");  //0103333
        String b = num.substring(leng-4, leng);     //4444
        return a.concat(b);                         //*******4444
    }

    public static String solutaion2(String num){
        char[] ch = num.toCharArray();
        for(int i=0; i<ch.length-4; i++){
            ch[i] = '*';
        }
        return String.valueOf(ch);
    }
}
