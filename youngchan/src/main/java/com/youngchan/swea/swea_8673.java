package com.youngchan.swea;
import java.util.*;
import java.io.*;
public class swea_8673 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        for(int t=1; t<=tc; t++){
            int k = (int)Math.pow(2, Integer.parseInt(br.readLine()));
            int[] arr = new int[k];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=0; i<k; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int sum = 0;
            while(k>0){
                for(int i=0; i<k/2; i++){
                    int num1 = arr[i*2];
                    int num2 = arr[i*2+1];
                    sum += Math.abs(num1-num2);
                    arr[i] = Math.max(num1, num2);

                }
                k/=2;
            }
            System.out.println("#" + t + " " + sum);
        }
    }
}
