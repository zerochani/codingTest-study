package com.youngchan.swea;
import java.util.*;
import java.io.*;

public class swea_1238 {
    static int[][] arr;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int tc=1; tc<=10; tc++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int start = Integer.parseInt(st.nextToken());
            arr = new int[101][101];
            st = new StringTokenizer(br.readLine());
            for(int i=0; i<n/2; i++){
                int from = Integer.parseInt(st.nextToken());
                int to = Integer.parseInt(st.nextToken());
                arr[from][to] = 1;
            }

            System.out.println("#" + tc + " " + bfs(start));
        }
    }
    static int bfs(int start){
        Queue<Integer> q = new LinkedList<>();
        int[] visited = new int[101];
        q.offer(start);
        visited[start] = 1;

        int maxLevel = 1;
        int answer = start;
        while(!q.isEmpty()){
            int cur = q.poll();

            //현재 노드 단계보다 높은 단계를 만나면 갱신
            if(visited[cur] > maxLevel){
                maxLevel = visited[cur];
                answer = cur;
            }

            //가장 마지막 단계에서 가장 숫자가 큰 노드 찾기
            else if(visited[cur] == maxLevel){
                answer = Math.max(answer, cur);
            }

            for(int next=1; next<=100; next++){
                if(arr[cur][next] == 1 && visited[next] ==0){
                    visited[next] = visited[cur] + 1;
                    q.offer(next);
                }
            }
        }
        return answer;
    }
}
