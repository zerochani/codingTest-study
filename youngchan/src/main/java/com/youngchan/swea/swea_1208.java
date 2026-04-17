package com.youngchan.swea;
import java.util.*;
import java.io.*;
public class swea_1208 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int tc=1; tc<=10; tc++){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[100];
            for(int i=0; i<100; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }


            for(int i=0; i<n; i++){
                //최고점과 최저점의 위치를 찾는다.
                int maxIdx = 0;
                int minIdx = 0;
                for(int j=0; j<100; j++){
                    if(arr[j] >= arr[maxIdx]) maxIdx = j;
                    if(arr[j] <= arr[minIdx]) minIdx = j;
                }
                //평탄화 완료 여부 확인
                if(arr[maxIdx] - arr[minIdx] <=1) break;

                //최고점에서 1점 깎고, 최저점에서 1점 올린다.
                arr[maxIdx]--;
                arr[minIdx]++;
            }
            //모든 덤프 끝난 후, 최고점과 최저점 다시 찾기
            int finalMax = -1;
            int finalMin = 100;
            for(int i=0; i<100; i++){
                if(arr[i] > finalMax) finalMax = arr[i];
                if(arr[i] < finalMin) finalMin = arr[i];
            }

            System.out.println("#" + tc + " " + (finalMax - finalMin));
        }
    }
}
