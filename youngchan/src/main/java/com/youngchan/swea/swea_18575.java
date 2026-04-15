package com.youngchan.swea;
import java.io.IOException;
import java.util.*;
public class swea_18575 {
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int tc=1; tc<=t; tc++){
            int n = sc.nextInt();
            int[][] arr = new int[n][n];
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    arr[i][j] = sc.nextInt();
                }
            }

            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for(int a=0; a<n; a++){
                for(int b=0; b<n; b++){
                    int sum = arr[a][b];
                    for(int d=0; d<4; d++){
                        int nx = a;
                        int ny = b;

                        while(true){
                            nx += dx[d];
                            ny += dy[d];
                            if(nx<0 || nx>=n || ny<0 || ny>=n) break;
                            sum += arr[nx][ny];
                        }
                    }
                    if(sum > max) max = sum;
                    if(sum < min) min = sum;
                }
            }
            System.out.println("#" + tc + " " + (max - min));
        }
    }
}
