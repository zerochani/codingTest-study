package com.youngchan.swea;
import java.util.*;
import java.io.*;
public class swea_5431 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int tc=1; tc<=t; tc++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()); //수강생의 수
            int k = Integer.parseInt(st.nextToken()); //과제를 제출한 학생의 수
            int[] arr = new int[n+1];
            st = new StringTokenizer(br.readLine());
            for(int i=0; i<k; i++){
                int num = Integer.parseInt(st.nextToken());
                arr[num] = 1; //과제를 제출한 학생은 1로 표시
            }
            System.out.print("#" + tc + " ");
            for(int i=1; i<arr.length; i++){
                if(arr[i] == 0){ //과제 제출안함 학생 출력
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }
}
