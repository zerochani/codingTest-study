package com.youngchan.baekjoon;
import java.util.*;
import java.io.*;
public class boj_2606 {
    static int count = 0;
    static int[][] arr;
    static boolean[] visited;
    static int n;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        arr = new int[n+1][n+1];
        visited = new boolean[n+1];
        for(int i=0; i<m; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a][b] = 1;
            arr[b][a] = 1;
        }
        bfs(1);
        System.out.println(count);
    }
    static void bfs(int start){
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        visited[start] = true;

        while(!q.isEmpty()){
            int cur = q.poll();

            for(int i=1; i<=n; i++){
                if(arr[cur][i] == 1 && !visited[i]){
                    visited[i] = true;
                    q.offer(i);
                    count++;
                }
            }
        }
    }
}
