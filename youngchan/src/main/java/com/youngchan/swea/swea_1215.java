package com.youngchan.swea;
import java.util.*;

public class swea_1215 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for(int tc=1; tc<=10; tc++){
            int n = sc.nextInt();
            char[][] arr = new char[8][8];
            for(int i=0; i<8; i++){
                arr[i] = sc.next().toCharArray();
            }

            int cnt = 0;
            //가로 검사
            for(int i=0; i<8; i++){
                for(int j=0; j<=8-n; j++){ //n이 8일때도 고려
                    boolean flag = true;
                    for(int k=0; k<n/2; k++){
                        if(arr[i][j+k] != arr[i][j+n-1-k]){
                            flag = false;
                            break;
                        }
                    }
                    if(flag) cnt++;
                }
            }
            //세로 검사
            for(int i=0; i<8; i++){
                for(int j=0; j<=8-n; j++){
                    boolean flag = true;
                    for(int k=0; k<n/2; k++){
                        if(arr[j+k][i] != arr[j+n-1-k][i]){
                            flag = false;
                            break;
                        }
                    }
                    if(flag) cnt++;
                }
            }
            System.out.println("#" + tc + " " + cnt);
        }
    }
}
