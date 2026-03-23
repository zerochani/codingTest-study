package com.youngchan.swea;
import java.util.*;
import java.io.*;
public class swea_8658 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int tc=1; tc<=t; tc++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for(int i=0; i<10; i++){
                int num  = Integer.parseInt(st.nextToken());
                int sum = 0;
                while(num>0){
                    sum += num % 10;
                    num /= 10;
                }
                if(sum>max) max = sum;
                if(sum<min) min = sum;
            }
            System.out.println("#" + tc + " " + max + " " + min);
        }
    }
}
