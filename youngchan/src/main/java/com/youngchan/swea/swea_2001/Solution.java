package com.youngchan.swea.swea_2001;
import java.util.*;
import java.io.*;
public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int tc=1; tc<=t; tc++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] arr = new int[n+1][n+1]; //누적합 배열

            for(int i=1; i<=n; i++){
                for(int j=1; j<=m; j++){
                    int val = sc.nextInt();
                    arr[i][j] = val + arr[i-1][j] + arr[i][j-1] - arr[i-1][j-1]; //누적합 계산
                }
            }

            int max = 0;
            for(int i=m; i<=n; i++){
                for(int j=m; j<=n; j++){
                    int sum = arr[i][j] - arr[i-m][j] - arr[i][j-m] + arr[i-m][j-m];
                    max = Math.max(max, sum); //최대값 갱신
                }
            }
            System.out.println("#" + tc + " " + max);
        }
    }
}
