package com.youngchan.swea;
import java.util.*;
import java.io.*;
public class swea_1238 {
    static final int MAX = 101;
    static int[][] arr;
    static int[] visited;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int tc=1; tc<=10; tc++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int len = Integer.parseInt(st.nextToken());
            int start = Integer.parseInt(st.nextToken());
            arr = new int[MAX][MAX];
            visited = new int[MAX];
            st = new StringTokenizer(br.readLine());
            for(int i=0; i<len/2; i++){
                int from = Integer.parseInt(st.nextToken());
                int to = Integer.parseInt(st.nextToken());
                arr[from][to] = 1;
            }

            int result = bfs(start);
            System.out.println("#" + tc + " " + result);
        }
    }
    static int bfs(int start){
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        visited[start] = 1;

        int maxDepth = 1;
        int maxNode = start;

        while(!q.isEmpty()){
            int cur = q.poll();

            for(int i=1; i<MAX; i++){
                //연락 가능한 경로가 있고, 아직 방문하지 않은 경우
                if(arr[cur][i] == 1 && visited[i] ==0){
                    visited[i] = visited[cur] + 1; //방문 체크 및 연락 횟수 증가
                    q.offer(i);

                    //마지막 단계의 노드 정보 갱신
                    if(visited[i] > maxDepth){
                        maxDepth = visited[i];
                        maxNode = i;
                    }else if(visited[i] == maxDepth){
                        maxNode = Math.max(maxNode, i); //같은 단계의 노드 중 번호가 큰 노드 선택
                    }
                }
            }
        }
        return maxNode;
    }
}
