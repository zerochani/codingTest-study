package com.youngchan.baekjoon;
import java.util.*;
import java.io.*;
public class boj_1697 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        //수빈이와 동생의 위치가 같은 경우
        if(n==k){
            System.out.println(0);
            return;
        }

        System.out.println(bfs(n,k));
    }
    static int bfs(int n, int k){
        Queue<int[]> q = new LinkedList<>();
        boolean[] visited = new boolean[100001];
        q.offer(new int[]{n,0}); //위치, 시간
        visited[n] = true;

        while(!q.isEmpty()){
            int[] cur = q.poll();
            int pos = cur[0];
            int time = cur[1];

            int[] nextPost = {pos-1, pos+1, pos*2};
            for(int next : nextPost){
                if(next == k) return time+1;

                if(next>=0 && next<=100000 && !visited[next]){
                    visited[next] = true;
                    q.offer(new int[]{next, time+1});
                }
            }
        }
        return -1;
    }
}
