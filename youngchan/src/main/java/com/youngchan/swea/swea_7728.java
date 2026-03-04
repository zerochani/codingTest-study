package com.youngchan.swea;
import java.util.*;
import java.io.*;
public class swea_7728 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1; i<=t; i++){
            String s = sc.next();

            boolean[] check = new boolean[10];
            for(int j=0; j<s.length(); j++){
                int num = s.charAt(j) - '0';
                check[num] = true;
            }

            int cnt=0;
            for(int j=0; j<10; j++){
                if(check[j]) cnt++;
            }
            System.out.println("#" + i + " " + cnt);
        }
    }
}
