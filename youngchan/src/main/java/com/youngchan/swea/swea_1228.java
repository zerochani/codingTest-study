package com.youngchan.swea;
import java.util.*;
import java.io.*;
public class swea_1228 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for(int tc=1; tc<=10; tc++){
            int n = Integer.parseInt(br.readLine());
            List<Integer> list = new LinkedList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=0; i<n; i++){
                list.add(Integer.parseInt(st.nextToken()));
            }
            int m = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()){
                String cmd = st.nextToken();
                if(cmd.equals("I")){
                    int x = Integer.parseInt(st.nextToken());
                    int y = Integer.parseInt(st.nextToken());
                    for(int i=0; i<y; i++){
                        list.add(x, Integer.parseInt(st.nextToken()));
                        x++;
                    }
                }
            }
            sb.append("#").append(tc).append(" ");
            for(int i=0; i<10; i++){
                sb.append(list.get(i)).append(" ");
            }
            sb.append("\n");

        }
        System.out.println(sb.toString());
    }
}
