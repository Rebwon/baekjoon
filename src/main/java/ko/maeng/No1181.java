package ko.maeng;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class No1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<String> arr = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            arr.add(br.readLine());
        }

        List<String> collect = arr.stream()
                .sorted(Comparator.comparingInt(String::length).thenComparing(String::compareTo))
                .distinct()
                .collect(Collectors.toList());

        for(String s : collect){
            System.out.println(s);
        }
    }

}
