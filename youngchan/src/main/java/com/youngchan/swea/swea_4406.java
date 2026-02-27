package com.youngchan.swea;
import java.util.*;
public class swea_4406 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1; i<=t; i++){
            String word = sc.next();
            StringBuilder sb = new StringBuilder();
            for(int j=0; j<word.length(); j++){

                char ch = word.charAt(j);
                if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u'){
                    sb.append(ch);
                }
            }
            System.out.println("#" + i + " " + sb.toString());
        }
    }
}
