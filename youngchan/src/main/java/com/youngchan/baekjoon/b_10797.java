package com.youngchan.baekjoon;
import java.util.*;
public class b_10797 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[5];
        for(int i=0; i<5; i++){
            arr[i] = sc.nextInt();
        }
        int cnt = 0;
        for(int s : arr){
            if(s == n){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
