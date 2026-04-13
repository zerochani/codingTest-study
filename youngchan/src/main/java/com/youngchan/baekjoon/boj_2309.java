package com.youngchan.baekjoon;
import java.util.*;
public class boj_2309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int sum = 0;
        for(int i=0; i<9; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        Arrays.sort(arr);
        int a = -1; int b = -1; //가짜 난쟁이
        for(int i=0; i<8; i++){
            for(int j=i+1; j<9; j++){
                if(sum - arr[i] - arr[j] == 100){
                    a = i;
                    b = j;
                    break;
                }
            }
            if(b != -1) break;
        }
        for(int i=0; i<9; i++){
            if(i==a || i==b) continue;
            System.out.println(arr[i]);
        }
    }
}
