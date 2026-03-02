package com.youngchan.swea;
import java.io.*;
import java.util.*;
public class swea_9317 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int i=1; i<=tc; i++){
            int n = sc.nextInt();
            String a = sc.next();
            String b = sc.next();
            int cnt = 0;
            for(int j=0; j<n; j++){
                if(a.charAt(j) == b.charAt(j)){
                    cnt++;
                }
            }
            System.out.println("#" + i + " " + cnt);
        }
    }
}
