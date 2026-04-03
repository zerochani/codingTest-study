package com.youngchan.swea;
import java.io.*;
import java.util.*;
public class swea_8500 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int tc=1; tc<=t; tc++){
            int n = sc.nextInt();//사람수
            int[] arr = new int[n];
            int sum = 0; // 모든 빈 좌석 요구량 합
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            //가장 큰 값을 구하기 위한 정렬
            Arrays.sort(arr);
            int max = arr[n-1];

            int result = sum + max + n;
            System.out.println("#" + tc + " " + result);
        }
    }
}
