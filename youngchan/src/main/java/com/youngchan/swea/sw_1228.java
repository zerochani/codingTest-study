package com.youngchan.swea;
import java.util.*;
import java.io.*;
public class sw_1228 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int tc=1; tc<=10; tc++){
            int n = sc.nextInt();
            List<Integer> list = new LinkedList<>();
            for(int i=0; i<n; i++){
                list.add(sc.nextInt());
            }
            int m = sc.nextInt();
            sc.nextLine();

            String str = sc.nextLine();
            String[] st = str.split(" ");
            for(int i=0; i<st.length; i++){
                if(st[i].equals("I")){
                    int x = Integer.parseInt(st[i+1]);
                    int y = Integer.parseInt(st[i+2]);
                    for(int j=0; j<y; j++){
                        list.add(x, Integer.parseInt(st[i+j+3]));
                        x++;
                    }
                }
            }
            System.out.print("#" + tc + " ");
            for(int i=0; i<10; i++){
                System.out.print(list.get(i) + " ");
            }
            System.out.println();
        }
    }
}
