package com.youngchan.swea;
import java.util.*;
import java.io.*;
public class swea_14692 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int tc=1; tc<=t; tc++){
            int n = Integer.parseInt(br.readLine());
            String winner = (n%2==0) ? "Alice" : "Bob";
            System.out.println("#" + tc + " " + winner);
        }
    }
}
