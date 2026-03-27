package com.youngchan.swea;
import java.util.*;
public class swea_3456 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int tc=1; tc<=t; tc++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if(a == b && a!=c){
                System.out.println("#" + tc + " " + c);
            }else if(a == c && a!=b){
                System.out.println("#" + tc + " " + b);
            }else if(b == c && b!=a){
                System.out.println("#" + tc + " " + a);
            }else{
                System.out.println("#" + tc + " " + a);
            }
        }
    }
}
