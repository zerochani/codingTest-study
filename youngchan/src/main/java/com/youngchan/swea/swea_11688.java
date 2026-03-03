package com.youngchan.swea;
import java.io.*;
import java.util.*;

public class swea_11688 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); //버퍼 비우기
        for(int i=1; i<=t; i++){
            String s = sc.nextLine();
            int a = 1;
            int b = 1;
            for(int j=0; j<s.length(); j++){
                if(s.charAt(j) == 'L'){
                    b = a+b;
                }else if(s.charAt(j) == 'R'){
                    a = a+b;
                }
            }
            System.out.println("#" + i + " " + a + " " + b);
        }
    }
}
