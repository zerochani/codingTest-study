package com.youngchan.swea;
import java.util.*;
public class swea_9997 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //30도 마다 60분, 1도마다 2분
        int t = sc.nextInt();
        for(int tc=1; tc<=t; tc++){
            int n = sc.nextInt();
            int time = n*2;

            int h = time/60;
            int m = time%60;

            if(h >= 12){
                h %= 12;
            }
            System.out.println("#" + tc + " " + h + " " + m);
        }
    }
}
