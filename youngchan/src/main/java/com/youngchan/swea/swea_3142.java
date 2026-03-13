package com.youngchan.swea;
import java.util.*;
import java.io.*;
public class swea_3142 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        for(int t=1; t<=tc; t++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()); //뿔의 개수
            int m = Integer.parseInt(st.nextToken()); //짐승의 개수
            int twin = n/2;
            int uni = m - twin;
            while(n!= twin*2 + uni){
                twin--;
                uni = m-twin;
            }
            System.out.println("#" + t + " " + uni + " " + twin);
        }
    }
}
