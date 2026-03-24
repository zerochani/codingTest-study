package com.youngchan.swea;
import java.util.*;
import java.io.*;
public class swea_7102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int tc=1; tc<=t; tc++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arr = new int[n+m+1];
            for(int i=1; i<=n; i++){
                for(int j=1; j<=m; j++){
                    arr[i+j]++;
                }
            }

            int max = Integer.MIN_VALUE;
            for(int i=2; i<=n+m; i++){
                max = Math.max(arr[i], max);
            }
            System.out.print("#" + tc + " ");
            for(int i=2; i<=n+m; i++){
                if(arr[i] == max){
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }
}
