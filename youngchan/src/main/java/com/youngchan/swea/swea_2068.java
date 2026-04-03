package com.youngchan.swea;
import java.io.*;
import java.util.*;
public class swea_2068 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int tc=1; tc<=t; tc++){
            int[] arr = new int[10];
            for(int i=0; i<10; i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int max = arr[9];
            System.out.println("#" + tc + " " + max);
        }
    }
}
