package com.youngchan.swea;
import java.util.*;
import java.io.*;
public class swea_7733 {
    static int n;
    static int[][] arr;
    static boolean[][] visited;
    static int[] dx ={-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static void dfs(int x, int y, int day){
        visited[x][y] = true;

        for(int d=0; d<4; d++){
            int nx = x + dx[d];
            int ny = y + dy[d];
            if(nx>=0 && ny>=0 && nx<n && ny<n){
                if(!visited[nx][ny] && arr[nx][ny] > day){
                    dfs(nx,ny, day);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        for(int t=1; t<=tc; t++){
            n = Integer.parseInt(br.readLine());
            arr = new int[n][n];
            int maxTaste = 0;
            for(int i=0; i<n; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                for(int j=0; j<n; j++){
                    arr[i][j] = Integer.parseInt(st.nextToken());
                    maxTaste = Math.max(maxTaste, arr[i][j]);
                }
            }

            int answer = 0;
            for(int day=0; day<=maxTaste; day++){
                visited = new boolean[n][n];
                int cnt = 0;
                for(int i=0; i<n; i++){
                    for(int j=0; j<n; j++){
                        if(!visited[i][j] && arr[i][j] > day){
                            dfs(i,j,day);
                            cnt++;
                        }
                    }
                }
                answer = Math.max(answer, cnt);
            }
            System.out.println("#" + t + " " + answer);
        }
    }
}
