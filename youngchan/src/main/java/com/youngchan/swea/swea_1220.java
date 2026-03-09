package com.youngchan.swea;
import java.util.*;
import java.io.*;
public class swea_1220 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int tc = 1; tc<=10; tc++){
            int n = Integer.parseInt(br.readLine());
            int[][] arr = new int[n][n];
            for(int i=0; i<n; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                for(int j=0; j<n; j++){
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            //세로줄에서 1이 먼저 나오고 2가 나오면 개수 세기
            //1이 먼저 나와야하므로 flag로 체크
            //1이 나오면 flag = true, 2가 나오면 flag = false, flag가 true인 상태에서 2가 나오면 count++
            int cnt = 0;
            for(int i=0; i<n; i++){
                boolean flag = false;
                for(int j=0; j<n; j++){
                    if(arr[j][i] == 1){
                        flag = true;

                    }else if(arr[j][i] ==2){
                        if(flag){
                            cnt++;
                            flag = false;
                        }
                    }
                }
            }
            System.out.println("#" + tc + " " + cnt);
        }
    }
}
