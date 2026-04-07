package com.youngchan.swea;
import java.util.*;
public class swea_1289 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int tc=1; tc<=t; tc++){
            String target = sc.next();
            int cnt = 0; //최소 수정 횟수
            char current = '0'; //현재 상태
            for(int i=0; i<target.length(); i++){
                if(target.charAt(i) != current){ //현재 상태와 다르면 수정 필요
                    cnt++;
                    current = target.charAt(i); //상태 변경
                }
            }
            System.out.println("#" + tc + " " + cnt);
        }
    }
}
