package com.youngchan.swea;
import java.util.*;
import java.io.*;
public class swea_3314 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int tc=1; tc<=t; tc++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] score = new int[5];
            for(int i=0; i<5; i++){
                score[i] = Integer.parseInt(st.nextToken());
                if(score[i]<40) score[i] = 40;
            }
            int sum = 0;
            for(int i=0; i<5; i++){
                sum += score[i];
            }

            System.out.println("#" + tc + " " + sum/5);
        }
    }
}
