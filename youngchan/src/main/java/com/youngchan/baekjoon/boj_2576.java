package com.youngchan.baekjoon;
import java.util.*;
public class boj_2576 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        for(int i=0; i<7; i++){
            arr[i] = sc.nextInt();
        }
        //홀수들의 합 구하기, 홀수들 중 최솟값 찾기
        boolean hasOdd = false; //홀수가 있는지 여부
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for(int s : arr){
            if(s%2==1){
                hasOdd = true;
                if(s<min){
                    min = s;
                }
                sum += s;
            }
        }
        if(hasOdd){
            System.out.println(sum);
            System.out.println(min);
        }else{
            System.out.println(-1);
        }
    }
}
