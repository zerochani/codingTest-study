package com.youngchan.swea;
import java.io.*;
import java.util.*;
public class swea_10570 {
    static boolean isPalindrome(int x){
        String s = String.valueOf(x);      //Integer.toString(x); 도 가능
        String r = new StringBuilder(s).reverse().toString();
        return s.equals(r);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        for(int i=1; i<=tc; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int count = 0;

            int start = (int)Math.sqrt(a);
            int end = (int)Math.sqrt(b);

            for(int j=start; j<=end; j++){
                if(isPalindrome(j)){
                    int square = j*j;
                    if(square>=a && square<=b && isPalindrome(square)){
                        count++;
                    }
                }
            }
            System.out.println("#" + i + " " + count);
        }
    }
}
