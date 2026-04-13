package com.youngchan.baekjoon;
import java.util.*;
public class boj_1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.next().toUpperCase();
        int[] cnt = new int[26];
        for(int i=0; i<line.length(); i++){
            int num = line.charAt(i) - 'A';
            cnt[num]++;
        }
        int max = 0;
        char result = '?';
        for(int i=0; i<26; i++){
            if(cnt[i] > max){
                max = cnt[i];
                result = (char)(i + 'A');
            }else if(cnt[i] == max){
                result = '?';
            }
        }
        System.out.println(result);
    }
}
