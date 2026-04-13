package com.youngchan.baekjoon;
import java.util.*;
import java.io.*;
public class boj_2484 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int MaxTotalMoney = 0;

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] cnt = new int[7];
            int maxDie = 0; //모두 다를 경우 대비할 주사위의 최대값
            for(int j=0; j<4; j++){
                int num = Integer.parseInt(st.nextToken());
                cnt[num]++;
                maxDie = Math.max(maxDie, num);
            }
            MaxTotalMoney = Math.max(MaxTotalMoney, func(cnt, maxDie));
        }
        System.out.println(MaxTotalMoney);
    }

    static int func(int[] cnt, int maxDie){

        int pairCnt = 0; //쌍의 개수
        int firstPair = 0;
        for(int i=1; i<=6; i++){
            if(cnt[i] == 4) return 50000 + i * 5000;
            if(cnt[i] == 3) return 10000 + i * 1000;
            if(cnt[i] == 2){
                pairCnt++;
                // 두 쌍이 나오는 경우
                if(firstPair ==0) firstPair = i;
                else return 2000 + (firstPair * 500) + (i * 500);
            }
        }
        if(pairCnt == 1) return 1000 + (firstPair * 100);
        return maxDie * 100; //모두 다른경우
    }
}
