package com.youngchan.swea;
import java.util.*;
import java.io.*;
public class swea_9489 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int tc=1; tc<=t; tc++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int[][] arr = new int[n][m];
            for(int i=0; i<n; i++){
                st = new StringTokenizer(br.readLine());
                for(int j=0; j<m; j++){
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int maxLen = 0;
            //가로 방향 탐색
            for(int i=0; i<n; i++){
                int cnt = 0;
                for(int j=0; j<m; j++){
                    if(arr[i][j] == 1){
                        cnt++;
                        maxLen = Math.max(maxLen, cnt);
                    }else{
                        cnt = 0;
                    }
                }
            }

            //세로 방향 탐색
            for(int i=0; i<m; i++){
                int cnt = 0;
                for(int j=0; j<n; j++){
                    if(arr[j][i] == 1){
                        cnt++;
                        maxLen = Math.max(maxLen, cnt);
                    }else{
                        cnt = 0;
                    }
                }
            }
            System.out.println("#" + tc + " " + maxLen);
        }
    }
}
