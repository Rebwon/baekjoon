package ko.maeng.programmers;

import java.util.Arrays;

public class NoFinishUser {
    public static void main(String[] args) {
        String[] a = {"mislav","stanko","mislav","ana"};
        String[] b = {"stanko","ana","mislav"};
        System.out.println(solution(a,b));
    }

    public static String solution(String[] participant, String[] completion){
        Arrays.sort(participant);
        Arrays.sort(completion);

        int i=0;

        for(i=0; i<completion.length; i++){
            if(!participant[i].equals(completion[i])){
                return participant[i];
            }
        }

        return participant[i];
    }
}
