package com.youngchan.codetree;
import java.io.*;
import java.util.*;
public class 최소경로로탈출하기 {
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static int[][] arr;
    static int[][] dist;
    static boolean[][] visited;
    static int n;
    static int m;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        visited = new boolean[n][m];
        dist = new int[n][m];

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        bfs(0,0);
        System.out.println(dist[n-1][m-1]);
    }

    static void bfs(int x, int y){
        Queue<int[]> q = new LinkedList<>();

        q.offer(new int[]{x,y});
        visited[x][y] = true;
        dist[x][y] = 0;

        while(!q.isEmpty()){
            int[] cur = q.poll();
            int cx = cur[0];
            int cy = cur[1];

            for(int d=0; d<4; d++){
                int nx = cx + dx[d];
                int ny = cy + dy[d];

                if(nx >=0 && ny>=0 && nx<n && ny<m){
                    if(arr[nx][ny] == 1 && !visited[nx][ny]){
                        visited[nx][ny] = true;
                        dist[nx][ny] = dist[cx][cy] + 1;
                        q.offer(new int[]{nx,ny});
                    }
                }
            }
        }
    }
}
