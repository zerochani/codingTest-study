package com.youngchan.swea;
import java.io.*;
import java.util.*;
public class swea_1986 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for(int i=1; i<=t; i++){
            int n = sc.nextInt();
            int sum = 0;
            for(int j=1; j<=n; j++){
                if(j%2==1){
                    sum += j;
                }else{
                    sum -= j;
                }
            }
            System.out.println("#" + i + " " + sum);
        }
    }
}
