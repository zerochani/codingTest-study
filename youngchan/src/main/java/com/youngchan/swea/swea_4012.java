package com.youngchan.swea;
import java.util.*;
import java.io.*;
public class swea_4012 {
    static int n,min;
    static boolean[] checked;
    static int[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        for(int t=1; t<=tc; t++){
            n = Integer.parseInt(br.readLine());
            arr = new int[n][n];
            min = Integer.MAX_VALUE;
            checked = new boolean[n];
            for(int i=0; i<n; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                for(int j=0; j<n; j++){
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            comb(0,0);
            System.out.println("#" + t + " " + min);
        }
    }
    static void comb(int idx, int cnt){
        if(cnt == n/2){
            calc();
            return;
        }
        for(int i=idx; i<n; i++){
            checked[i] = true;
            comb(i+1, cnt+1);
            checked[i] = false;
        }
    }
    static void calc(){
        int sumA=0;
        int sumB=0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(checked[i] && checked[j]){
                    sumA += arr[i][j] + arr[j][i];
                }else if(!checked[i] && !checked[j]){
                    sumB += arr[i][j] + arr[j][i];
                }
            }
        }
        min = Math.min(min, Math.abs(sumA-sumB));
    }
}
