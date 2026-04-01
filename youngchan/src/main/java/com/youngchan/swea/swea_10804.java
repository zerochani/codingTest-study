package com.youngchan.swea;
import java.io.*;
import java.util.*;
public class swea_10804 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int tc=1; tc<=t; tc++){
            String s = sc.nextLine();
            StringBuilder sb = new StringBuilder();

            for(int i=s.length()-1; i>=0; i--){
                char c = s.charAt(i);
                if(c=='b') sb.append('d');
                else if(c=='d') sb.append('b');
                else if(c=='p') sb.append('q');
                else if(c=='q') sb.append('p');
            }
            System.out.println("#" + tc + " " + sb.toString());
        }
    }
}
