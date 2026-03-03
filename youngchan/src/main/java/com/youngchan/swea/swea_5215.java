package com.youngchan.swea;
import java.io.*;
import java.util.*;
public class swea_5215 {
    static int n,l,best;
    static int[] score, cal;
    static void dfs(int idx, int sumScore, int sumCal){
        if(sumCal > l) return;
        if(idx == n){
            best = Math.max(best, sumScore);
            return;
        }
        //선택
        dfs(idx+1, sumScore + score[idx], sumCal + cal[idx]);
        //비선택
        dfs(idx+1, sumScore, sumCal);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i=1; i<=t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            l = Integer.parseInt(st.nextToken());

            score = new int[n];
            cal = new int[n];
            for(int j=0; j<n; j++){
                st = new StringTokenizer(br.readLine());
                score[j] = Integer.parseInt(st.nextToken());
                cal[j] = Integer.parseInt(st.nextToken());
            }
            best = 0;
            dfs(0,0,0);
            System.out.println("#" + i + " " + best);
        }
    }
}
