package com.youngchan.swea;
import java.util.*;
import java.io.*;
public class swea_1225 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int tc=1; tc<=10; tc++){
            int t = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            Deque<Integer> q = new ArrayDeque<>();
            for(int i=0; i<8; i++){
                q.offer(Integer.parseInt(st.nextToken()));
            }

            int minus = 1;
            while(true){
                //맨 앞의 수를 빼기
                int num = q.poll();
                //맨 앞의 수를 minus만큼 빼기
                num -= minus;
                //맨 뒤로 보내기 그러나 num이 0보다 작으면 0으로 맨뒤로 보내기 그리고 종료
                if(num <=0){
                    q.offer(0);
                    break;
                }else{
                    q.offer(num);
                }

                //minus는 1씩 증가, 5가 되면 다시 1로 초기화
                minus++;
                if(minus == 6){
                    minus = 1;
                }
            }
            System.out.print("#" + tc + " ");
            while(!q.isEmpty()){
                System.out.print(q.poll() + " ");
            }
            System.out.println();
        }
    }
}
