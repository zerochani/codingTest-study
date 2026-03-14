package com.youngchan.swea;
import java.util.*;
import java.io.*;
public class swea_1954 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int t=1; t<=tc; t++){
            int n = sc.nextInt();
            int[][] arr = new int[n][n];
            int[] dx = {0,1,0,-1};
            int[] dy = {1,0,-1,0};
            int x=0;
            int y=0;
            int d=0;
            int cnt = 1;
            while(cnt<=n*n){
                arr[x][y] = cnt++;
                int nx = x + dx[d];
                int ny = y + dy[d];
                if(nx<0 || ny<0 || nx>=n || ny>=n || arr[nx][ny] != 0 ){
                    d = (d+1)%4;
                    nx = x + dx[d];
                    ny = y + dy[d];
                }
                x = nx;
                y = ny;
            }
            System.out.println("#" + t);
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
