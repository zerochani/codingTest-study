package com.youngchan.baekjoon;
import java.util.*;
public class boj_2506 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        int score = 0;
        for(int i=0; i<n; i++){
            int result = sc.nextInt();
            if(result == 1){
                score++;
                sum += score;
            }else{
                score = 0;
            }
        }
        System.out.println(sum);
    }
}
