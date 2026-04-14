package com.youngchan.baekjoon;
import java.io.*;
import java.util.*;
public class boj_2164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();
        for(int i=1; i<=n; i++){
            q.offer(i);
        }
        StringBuilder sb = new StringBuilder();
        //제일 위에 있는 카드를 바닥에 버림
        //그 다음 제일 위에 있는 카드를 제일 아래에 있는 카드 밑으로 옮김
        while(q.size() > 1){
            q.poll();
            q.offer(q.poll());
        }
        if(q.size()==1){
            sb.append(q.poll());
        }
        System.out.println(sb.toString());
    }
}
