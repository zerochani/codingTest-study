package com.youngchan.swea;
import java.io.*;
import java.util.*;
public class swea_파리퇴치3 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i=1; i<=t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int[][] arr = new int[n][n];
            for(int j=0; j<n; j++){
                st = new StringTokenizer(br.readLine());
                for(int k=0; k<n; k++){
                    arr[j][k] = Integer.parseInt(st.nextToken());
                }
            }

            int max = 0;
            for(int j=0; j<n; j++){
                for(int k=0; k<n; k++){

                    int plusSum = arr[j][k];
                    int xSum = arr[j][k];

                    //+모양
                    int[] dx1 = {-1,1,0,0};
                    int[] dy1 = {0,0,-1,1};

                    //x모양
                    int[] dx2 = {-1,-1,1,1};
                    int[] dy2 = {-1,1,-1,1};

                    for(int d=0; d<4; d++){
                        for(int l=1; l<m; l++){
                            int nx = j + dx1[d]*l;
                            int ny = k + dy1[d]*l;
                            if(nx>=0 && ny>=0 && nx<n && ny<n){
                                plusSum += arr[nx][ny];
                            }
                        }
                    }

                    for(int d=0; d<4; d++){
                        for(int l=1; l<m; l++){
                            int nx = j + dx2[d]*l;
                            int ny = k + dy2[d]*l;
                            if(nx>=0 && ny>=0 && nx<n && ny<n){
                                xSum += arr[nx][ny];
                            }
                        }
                    }
                    max = Math.max(max, Math.max(plusSum, xSum));
                }
            }
            System.out.println("#" + i + " " + max);
        }
    }
}
