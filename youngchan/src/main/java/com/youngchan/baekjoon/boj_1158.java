package com.youngchan.baekjoon;
import java.io.IOException;
import java.util.*;
import java.io.*;
public class boj_1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        Queue<Integer> q = new LinkedList<>();
        for(int i=1; i<=n; i++){
            q.offer(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");
        while(q.size() > 1){
            //k-1번을 뒤로 보내주기
            for(int i=0; i<k-1; i++){
                q.offer(q.poll());
            }
            //k번째 수 뽑아서 sb에 추가
            sb.append(q.poll()).append(", ");
        }
        //마지막 원소 추가
        sb.append(q.poll()).append(">");
        System.out.println(sb.toString());
    }
}
