package com.youngchan.swea;
import java.util.*;
import java.io.*;
public class swea_두개의숫자열 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        for(int t=1; t<=tc; t++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int[] a = new int[n];
            int[] b = new int[m];
            st = new StringTokenizer(br.readLine());
            for(int i=0; i<n; i++){
                a[i] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            for(int i=0; i<m; i++){
                b[i] = Integer.parseInt(st.nextToken());
            }

            int max = Integer.MIN_VALUE;
            if(n<=m){
                for(int i=0; i<=m-n; i++){
                    int sum = 0;
                    for(int j=0; j<n; j++){
                        sum += a[j] * b[i+j];
                    }
                    max = Math.max(max, sum);
                }
            }else{
                for(int i=0; i<=n-m; i++){
                    int sum = 0;
                    for(int j=0; j<m; j++){
                        sum += b[j] * a[i+j];
                    }
                    max = Math.max(max, sum);
                }
            }
            System.out.println("#" + t + " " + max);
        }
    }
}
