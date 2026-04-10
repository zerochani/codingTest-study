package com.youngchan.swea;
import java.util.*;
import java.io.*;
public class swea_5102 {
    static int[][] arr;
    static boolean[] visited;
    static int v;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int tc=1; tc<=t; tc++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            v = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            arr = new int[v+1][v+1];
            visited = new boolean[v+1];

            for(int i=0; i<e; i++){
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                arr[x][y] = 1;
                arr[y][x] = 1;
            }

            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken()); //출발노드
            int g = Integer.parseInt(st.nextToken()); //도착노드

            System.out.println("#" + tc + " " + bfs(v,arr,s,g));
        }
    }
    static int bfs(int v, int[][] arr, int start, int end){
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{start,0}); //노드 번호, 거리
        visited[start] = true;

        while(!q.isEmpty()){
            int[] cur = q.poll();
            int now = cur[0];
            int dist = cur[1];

            if(now == end) return dist;

            for(int next=1; next<=v; next++){
                //연결된 노드가 있고, 아직 방문하지 않은 경우
                if(arr[now][next] == 1 && !visited[next]){
                    visited[next] = true;
                    q.offer(new int[]{next, dist+1});
                }
            }
        }
        return 0;
    }
}
