package com.youngchan.swea;
import java.io.*;
import java.util.*;
public class swea_1284 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i=1; i<=t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            int a = p*w;
            int b = q + (w>r ? (w-r)*s : 0);
            System.out.println("#" + i + " " + Math.min(a,b));
        }
    }
}
