package com.youngchan.swea;
import java.util.*;
import java.io.*;
public class swea_13229 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int tc = sc.nextInt();
        for(int t=1; t<=tc; t++){
            String s = sc.next();
            sb.append("#" + t + " ");
            if(s.equals("SUN")){
                sb.append(7);
            }else if(s.equals("MON")){
                sb.append(6);
            }else if(s.equals("TUE")){
                sb.append(5);
            }else if(s.equals("WED")){
                sb.append(4);
            }else if(s.equals("THU")){
                sb.append(3);
            }else if(s.equals("FRI")){
                sb.append(2);
            }else if(s.equals("SAT")){
                sb.append(1);
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }
}
