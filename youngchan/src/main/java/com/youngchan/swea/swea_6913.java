package com.youngchan.swea;
import java.util.*;
import java.io.*;

public class swea_6913 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int tc=1; tc<=t; tc++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int[] scores = new int[n];
            int firstScore = 0;
            for(int i=0; i<n; i++){
                st = new StringTokenizer(br.readLine());
                int score = 0;
                for(int j=0; j<m; j++){
                    score += Integer.parseInt(st.nextToken());
                    firstScore = Math.max(firstScore, score);
                    scores[i] = score;
                }
            }

            int count = 0;
            for(int i=0; i<n; i++){
                if(scores[i] == firstScore){
                    count++;
                }
            }
            System.out.println("#" + tc + " " + count + " " + firstScore);
        }
    }
}
