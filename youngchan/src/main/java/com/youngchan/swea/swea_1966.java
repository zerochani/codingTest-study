package com.youngchan.swea;
import java.util.*;
import java.io.*;
public class swea_1966 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int tc=1; tc<=t; tc++){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            System.out.print("#" + tc + " ");
            Arrays.sort(arr);
            for(int i=0; i<n; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
