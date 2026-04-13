package com.youngchan.baekjoon;
import java.util.*;
public class boj_2930 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        String sg = sc.next();
        int N = sc.nextInt();
        String[] fr = new String[N];
        for(int i=0; i<N; i++){
            fr[i] = sc.next();
        }

        int cur = 0;
        int max = 0;
        for(int i=0; i<R; i++){
            int r=0, s=0, p=0;
            for(int j=0; j<N; j++){
                char f = fr[j].charAt(i);
                if(sg.charAt(i)==f) cur+=1;
                else if((sg.charAt(i)=='R'&& f=='S') || (sg.charAt(i)=='S' && f=='P') || (sg.charAt(i)=='P' && f=='R')) cur+=2;
                r += getScore('R',f);
                s += getScore('S',f);
                p += getScore('P',f);
            }
            max += Math.max(r, Math.max(s, p));
        }
        System.out.println(cur+ "\n" +max);
    }
    static int getScore(char a, char b){
        if(a==b) return 1;
        else if((a=='R' && b=='S') || (a=='S' && b=='P') || (a=='P' && b=='R')) return 2;
        else return 0;
    }
}
