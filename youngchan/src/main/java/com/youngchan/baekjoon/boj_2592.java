package com.youngchan.baekjoon;
import java.util.*;
public class boj_2592 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[1000];
        int sum = 0;
        int max = 0;
        int a = 0; //최빈값
        for(int i=0; i<10; i++){
            int num = sc.nextInt();
            arr[num]++;
            sum += num;
        }
        for(int i=0; i<1000; i++){
            if(arr[i] > max){
                max = arr[i];
                a = i;
            }
        }
        System.out.println(sum/10);
        System.out.println(a);
    }
}
