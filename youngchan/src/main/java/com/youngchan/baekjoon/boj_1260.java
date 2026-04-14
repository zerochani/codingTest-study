package com.youngchan.baekjoon;

import java.util.*;
import java.io.*;
public class boj_1260 {
    static boolean[] visited;
    static int[][] arr;
    static int n;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        arr = new int[n+1][n+1];
        visited = new boolean[n+1];
        for(int i=1; i<=m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a][b] = 1;
            arr[b][a] = 1;
        }
        visited = new boolean[n+1];
        dfs(v);
        System.out.println();
        visited = new boolean[n+1];
        bfs(v);

    }
    static void dfs(int start){
        visited[start] = true;
        StringBuilder sb = new StringBuilder();
        sb.append(start + " ");
        System.out.print(sb.toString());
        for(int i=1; i<=n; i++){
            if(arr[start][i] == 1 && !visited[i]){
                dfs(i);
            }
        }

    }
    static void bfs(int start){
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        visited[start] = true;
        StringBuilder sb = new StringBuilder();

        while(!q.isEmpty()){
            int cur = q.poll();
            sb.append(cur + " ");
            for(int i=1; i<=n; i++){
                if(arr[cur][i] == 1 && !visited[i]){
                    visited[i] = true;
                    q.offer(i);
                }
            }
        }
        System.out.print(sb.toString());
    }
}
