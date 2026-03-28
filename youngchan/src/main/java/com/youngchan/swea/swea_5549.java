package com.youngchan.swea;
import java.util.*;
public class swea_5549 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int tc=1; tc<=t; tc++){
            String s = sc.nextLine();
            int n = s.charAt(s.length()-1);

            if(n%2==1){
                System.out.println("#" + tc + " " + "Odd");
            }else{
                System.out.println("#" + tc + " " + "Even");
            }
        }
    }
}
