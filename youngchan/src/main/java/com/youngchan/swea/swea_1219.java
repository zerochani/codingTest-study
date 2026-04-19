package com.youngchan.swea;
import java.util.*;
import java.io.*;
public class swea_1219 {
    static int[][] arr;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int tc=1; tc<=10; tc++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            arr = new int[100][2];

            for(int i=0; i<100; i++){
                arr[i][0] = -1;
                arr[i][1] = -1;
            }

            st = new StringTokenizer(br.readLine());
            for(int i=0; i<n; i++){
                int from = Integer.parseInt(st.nextToken());
                int to = Integer.parseInt(st.nextToken());
                if(arr[from][0] == -1){
                    arr[from][0] = to;
                }else{
                    arr[from][1] = to;
                }
            }

            boolean result = bfs(0);
            System.out.println("#" + tc + " " + (result ? 1 : 0));
        }
    }
    static boolean bfs(int start){
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[100];
        q.offer(start);
        visited[start] = true;

        while(!q.isEmpty()){
            int cur = q.poll();
            if(cur == 99) return true;

            for(int i=0; i<2; i++){
                int next = arr[cur][i];
                if(next != -1 && !visited[next]){
                    visited[next] = true;
                    q.offer(next);
                }
            }
        }
        return false;
    }
}
