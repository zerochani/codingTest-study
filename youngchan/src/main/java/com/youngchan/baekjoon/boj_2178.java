package com.youngchan.baekjoon;
import java.util.*;
import java.io.*;
public class boj_2178 {
    static int[][] map;
    static boolean[][] visited;
    static int n,m;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        visited = new boolean[n][m];
        for(int i=0; i<n; i++){
            String line = br.readLine();
            for(int j=0; j<m; j++){
                map[i][j] = line.charAt(j) - '0';
            }
        }
        System.out.println(bfs(0,0));
    }

    static int bfs(int x, int y){
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x,y,1});
        visited[x][y] = true;

        while(!q.isEmpty()){
            int[] cur = q.poll();
            int curX = cur[0];
            int curY = cur[1];
            int dist = cur[2];

            if(curX == n-1 && curY == m-1) return dist;

            for(int d=0; d<4; d++){
                int nx = curX + dx[d];
                int ny = curY + dy[d];

                if(nx>=0 && nx<n && ny>=0 && ny<m && !visited[nx][ny] && map[nx][ny] == 1){
                    visited[nx][ny] = true;
                    q.offer(new int[]{nx,ny,dist+1});
                }
            }
        }
        return -1;
    }
}
