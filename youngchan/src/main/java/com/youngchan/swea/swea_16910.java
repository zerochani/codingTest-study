package com.youngchan.swea;
import java.util.*;
import java.io.*;
public class swea_16910 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int tc=1; tc<=t; tc++){
            int n = sc.nextInt();
            int result = 0;
            for(int i=-n; i<=n; i++){
                for(int j=-n; j<=n; j++) {
                    int x = (int) Math.pow(i, 2);
                    int y = (int) Math.pow(j, 2);
                    if (x + y <= n * n) {
                        result++;
                    }
                }
            }
            System.out.println("#" + tc + " " + result);
        }
    }
}
