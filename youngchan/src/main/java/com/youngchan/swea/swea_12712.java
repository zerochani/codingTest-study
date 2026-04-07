package com.youngchan.swea;
import java.io.*;
import java.util.*;
public class swea_12712 {
    static int n,m;
    static int[][] arr;
    static int[] dxPlus = {-1,1,0,0};
    static int[] dyPlus = {0,0,-1,1};
    static int[] dxCross ={-1,-1,1,1};
    static int[] dyCross ={-1,1,-1,1};
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int tc=1; tc<=t; tc++){
            n = sc.nextInt();
            m = sc.nextInt();
            arr = new int[n][n];
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    arr[i][j] = sc.nextInt();
                }
            }

            int max = 0;
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    max = Math.max(max, getSum(i,j,dxPlus,dyPlus));
                    max = Math.max(max, getSum(i,j,dxCross,dyCross));
                }
            }
            System.out.println("#" + tc + " " + max);
        }
    }
    static int getSum(int x, int y, int[] dx, int[] dy){
        int sum = arr[x][y]; //중심
        for(int d=0; d<4; d++){
            for(int i=1; i<m; i++){
                int nx = x + dx[d] * i;
                int ny = y + dy[d] * i;
                if(nx >=0 && nx<n && ny>=0 && ny<n){
                    sum += arr[nx][ny];
                }
            }
        }
        return sum;
    }
}
