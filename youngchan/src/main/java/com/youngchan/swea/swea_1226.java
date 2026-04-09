package com.youngchan.swea;
import java.util.*;
import java.io.*;
public class swea_1226 {
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static int[][] map;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int tc=1; tc<=10; tc++){
            br.readLine();
            map = new int[16][16];
            int startX=0; int startY=0;
            //미로 입력받고, 시작점 찾기
            for(int i=0; i<16; i++){
                String line = br.readLine();
                for(int j=0; j<16; j++){
                    map[i][j] = line.charAt(j) - '0';
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
        map[x][y] = 1; // 방문처리

        while(!q.isEmpty()){
            int[] cur = q.poll();

            for(int d=0; d<4; d++){
                int nx = cur[0] + dx[d];
                int ny = cur[1] + dy[d];

                if(nx>=0 && nx<16 && ny>=0 && ny<16){
                    if(map[nx][ny] == 3) return 1;
                    if(map[nx][ny] == 0){
                        map[nx][ny] = 1;
                        q.offer(new int[]{nx,ny});
                    }
                }
            }
        }
        return 0;
    }
}
