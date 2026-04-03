package com.youngchan.swea;
import java.io.*;
import java.util.*;
public class swea_1206 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int tc=1; tc<=10; tc++){
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            int result = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            //좌우 2칸 검색
            for(int i=2; i<n-2; i++){
                int max = 0;
                max = Math.max(arr[i-2],arr[i-1]);
                max = Math.max(max, arr[i+1]);
                max = Math.max(max, arr[i+2]);

                //현재 건물이 좌우2칸 건물들 중 가장 높은 건물보다 높다면 조망권 확보
                if(arr[i] > max){
                    result += arr[i] - max;
                }
            }
            System.out.println("#" + tc + " " + result);

        }
    }
}
