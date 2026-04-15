package com.youngchan.swea;
import java.util.*;
import java.io.*;
public class swea_20397 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int tc=1; tc<=t; tc++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int[] arr = new int[n];
            st = new StringTokenizer(br.readLine());
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }

            for(int i=0; i<m; i++){
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken()) - 1;
                int b = Integer.parseInt(st.nextToken());


                for(int k=1; k<=b; k++){

                    int left = a-k;
                    int right = a+k;

                    if(left >=0 && right < n && arr[left] == arr[right]){
                        arr[left] = 1 - arr[left];
                        arr[right] = 1 - arr[right];
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("#").append(tc).append(" ");
            for(int r : arr){
                sb.append(r).append(" ");
            }
            System.out.println(sb.toString());
        }
    }
}
