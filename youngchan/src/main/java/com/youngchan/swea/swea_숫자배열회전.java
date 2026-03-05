package com.youngchan.swea;
import java.util.*;
import java.io.*;
public class swea_숫자배열회전 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for(int i=1; i<=t; i++){
            sb.append("#" + i + "\n");
            int n = Integer.parseInt(br.readLine());
            int[][] arr = new int[n][n];
            for(int j=0; j<n; j++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                for(int k=0; k<n; k++){
                    arr[j][k] = Integer.parseInt(st.nextToken());
                }
            }
            for(int j=0; j<n; j++) {
                StringBuilder r90 = new StringBuilder();
                StringBuilder r180 = new StringBuilder();
                StringBuilder r270 = new StringBuilder();
                for (int k = 0; k < n; k++) {
                    //90도 회전
                    r90.append(arr[n - 1 - k][j]);
                    //180도 회전
                    r180.append(arr[n - 1 - j][n - 1 - k]);
                    //270도 회전
                    r270.append(arr[k][n - 1 - j]);
                }
                sb.append(r90 + " " + r180 + " " + r270 + "\n");
            }
        }
        System.out.print(sb.toString());
    }
}
