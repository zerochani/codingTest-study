package com.youngchan.swea;
import java.io.*;
import java.util.*;
public class swea_12221 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for(int i=1; i<=n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append("#" + i + " ");
            if(a>=10 || b>=10){
                sb.append(-1);
            }else{
                sb.append(a*b);
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }
}
