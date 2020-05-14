package ko.maeng.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class No2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //long start = System.currentTimeMillis();

        int n = Integer.parseInt(br.readLine());

        List<Integer> intList = new ArrayList<>();

        for(int i=1; i<=n; i++){
            intList.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(intList);

        for(int i : intList){
            System.out.println(i);
        }

        //long end = System.currentTimeMillis();

        //System.out.println("실행시간: " + (end-start)/1000.0);
    }

    /*private static void quickSort(int[] arr, int start, int end) {
        if(start>=end) return;

        int left = start;
        int right = end;
        int pivot = arr[(left+right)/2];
        int temp;

        do{
            while(arr[left]<pivot) left++;
            while(arr[right]>pivot) right--;

            if(left<=right){
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }while(left<=right);

        if(start<end) quickSort(arr, start, right);
        if(end>left) quickSort(arr, left, end);
    }*/
}
