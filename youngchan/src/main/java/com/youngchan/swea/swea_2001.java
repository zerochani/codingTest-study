package com.youngchan.swea;
import java.util.*;
import java.io.*;

//brute-force 방법
public class swea_2001 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int tc=1; tc<=t; tc++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] arr = new int[n][n];
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            int max = 0;
            for(int i=0; i<=n-m; i++){
                for(int j=0; j<=n-m; j++){
                    int sum = 0;
                    for(int x=0; x<m; x++){
                        for(int y=0; y<m; y++){
                            sum += arr[x+i][y+j];
                        }
                    }
                    max = Math.max(max, sum);
                }
            }
            System.out.println("#" + tc + " " + max);
        }
    }
}
