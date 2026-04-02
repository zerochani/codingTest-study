package com.youngchan.codetree;
import java.util.*;
import java.io.*;
public class 주사위놀이 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[11];
        int[] count = new int[7];
        for(int i=1; i<=10; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            count[arr[i]]++;
        }
        for(int i=1; i<7; i++){
            System.out.println(i + " - " + count[i]);
        }
    }
}
