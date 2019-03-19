package ko.maeng.programmers;

public class StringMiddleWords {
    public static void main(String[] args) {
        System.out.println(solution("abde"));
    }

    public static String solution(String a){
        if(a.length() % 2 == 0){
            //짝수
            return a.substring(a.length()/2-1, a.length()/2+1);
        }
        else{
            //홀수
            return Character.toString(a.charAt(a.length()/2));
        }
    }
}
