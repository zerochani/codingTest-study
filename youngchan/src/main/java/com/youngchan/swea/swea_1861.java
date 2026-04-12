package com.youngchan.swea;
import java.io.*;
import java.util.*;
public class swea_1861 {
    static int n;
    static int[][] map;
    static int[][] memo;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int tc=1; tc<=t; tc++){
            n = Integer.parseInt(br.readLine());
            map = new int[n][n];
            memo = new int[n][n];
            for(int i=0; i<n; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                for(int j=0; j<n; j++){
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            int startNum = Integer.MAX_VALUE; //시작 숫자 중 가장 작은 거 출력해야해서
            int maxDist =0; //최대 이동 거리
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    int dist = dfs(i,j);
                    if(dist > maxDist){
                        maxDist = dist;
                        startNum = map[i][j];
                    }else if(dist == maxDist){
                        startNum = Math.min(startNum,map[i][j]);
                    }
                }
            }
            System.out.println("#" + tc + " " + startNum + " " + maxDist);
        }
    }
    static int dfs(int x, int y){
        if(memo[x][y] !=0) return memo[x][y];
        memo[x][y] =1; //자기 자신 카운트

        for(int d=0; d<4; d++){
            int nx = x + dx[d];
            int ny = y + dy[d];

            if(nx>=0 && ny>=0 && nx<n && ny<n){
                if(map[nx][ny] == map[x][y] + 1){
                    memo[x][y] = dfs(nx,ny) + 1;
                    break; //방 칸의 숫자가 모두 다름
                }
            }
        }
        return memo[x][y];
    }
}
