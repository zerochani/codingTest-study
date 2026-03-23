package com.youngchan.swea;
import java.util.*;
public class swea_5601 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int tc=1; tc<=t; tc++){
            int n = sc.nextInt();
            System.out.print("#" + tc + " ");
            for(int i=0; i<n; i++){
                System.out.print("1/" + n + " ");
            }
            System.out.println();
        }
    }
}
