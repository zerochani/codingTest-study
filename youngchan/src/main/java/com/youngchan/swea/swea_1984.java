package com.youngchan.swea;
import java.io.*;
import java.util.*;
public class swea_1984 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int tc=1; tc<=t; tc++){
            double[] arr = new double[10];
            StringTokenizer st = new StringTokenizer(br.readLine());
            double sum = 0;
            for(int i=0; i<10; i++){
                arr[i] = Integer.parseInt(st.nextToken());
                sum += arr[i];
            }
            Arrays.sort(arr);
            double min = arr[0];
            double max = arr[9];
            double result = (sum-min-max) / 8;
            System.out.println("#" + tc + " " + Math.round(result));
        }
    }
}
