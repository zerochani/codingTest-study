package com.youngchan.swea;
import java.io.*;
import java.util.*;
public class swea_8741 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int tc=1 ; tc<=t; tc++){
            String str = sc.nextLine();
            String ans = "";
            String[] word = str.split(" ");
            for(int i=0; i<word.length; i++){
                ans += word[i].charAt(0);
            }
            System.out.println("#" + tc + " " + ans.toUpperCase());
        }
    }
}
