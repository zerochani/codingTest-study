package com.youngchan.swea;

import java.io.*;
import java.util.*;
public class swea_1948 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int tc=1; tc<=t; tc++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] days = {0,31,28,31,30,31,30,31,31,30,31,30,31};
            int fm = Integer.parseInt(st.nextToken());
            int fd = Integer.parseInt(st.nextToken());
            int sm = Integer.parseInt(st.nextToken());
            int sd = Integer.parseInt(st.nextToken());

            int totalDays = 0;
            //월이 같다면
            if(fm == sm){
                totalDays = sd - fd + 1;
            }else{//월이 다른경우
                //첫번째 달
                totalDays += (days[fm] - fd + 1);
                //중간 달
                for(int i=fm+1; i<sm; i++){
                    totalDays += days[i];
                }
                //마지막 달
                totalDays += sd;
            }

            System.out.println("#" + tc + " " + totalDays);
        }
    }
}
