package com.youngchan.codetree;
import java.util.*;
import java.io.*;
public class 마을구분하기 {
    static int n;
    static int count;
    static int[][] arr;
    static boolean[][] visited;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        visited = new boolean[n][n];
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        ArrayList<Integer> village = new ArrayList<>();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(!visited[i][j] && arr[i][j] == 1){
                    count = 0;
                    dfs(i,j);
                    village.add(count);
                }
            }
        }
        Collections.sort(village);
        System.out.println(village.size());
        for(int v : village){
            System.out.println(v);
        }

    }

    static void dfs(int x, int y){
        visited[x][y] = true;
        count++;

        for(int d=0; d<4; d++){
            int nx = x + dx[d];
            int ny = y + dy[d];
            if(nx>=0 && ny>=0 && nx<n && ny<n){
                if(!visited[nx][ny] && arr[nx][ny] == 1){
                    dfs(nx,ny);
                }
            }
        }
    }
}
