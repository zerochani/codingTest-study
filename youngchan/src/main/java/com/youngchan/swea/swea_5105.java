package com.youngchan.swea;
import java.util.*;
import java.io.*;
public class swea_5105 {
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static int[][] distance;
    static int[][] map;
    static int n;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int tc=1; tc<=t; tc++){
            n = Integer.parseInt(br.readLine());
            map = new int[n][n];
            distance = new int[n][n];
            int startX=0;
            int startY=0;
            for(int i=0; i<n; i++){
                String line = br.readLine();
                for(int j=0; j<n; j++){
                    map[i][j] = line.charAt(j) -'0';
                    if(map[i][j] == 2){
                        startX = i;
                        startY = j;
                    }
                }
            }
            System.out.println("#" + tc + " " + bfs(startX, startY));
        }
    }

    static int bfs(int x, int y){
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x,y});
        distance[x][y] = 0;

        while(!q.isEmpty()){
            int[] current = q.poll();
            int curX = current[0];
            int curY = current[1];

            for(int d=0; d<4; d++){
                int nx = curX + dx[d];
                int ny = curY + dy[d];

                if(nx>=0 && nx<n && ny<=0 && ny<n && map[nx][ny] != 1 && distance[nx][ny] == 0){
                    if(map[nx][ny] == 3){
                        return distance[curX][curY];
                    }
                    distance[nx][ny] = distance[curX][curY] + 1;
                    q.offer(new int[]{nx,ny});
                }
            }
        }
        return 0;
    }
}
