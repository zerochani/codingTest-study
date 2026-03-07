package com.youngchan.swea;
import java.io.*;
import java.util.*;
public class swea_1215 {
    static boolean isRowPalindrome(char[][] ch, int row, int start, int len){
        for(int k=0; k<len/2; k++){
            if(ch[row][start+k] != ch[row][start+len-1-k]){
                return false;
            }
        }
        return true;
    }

    static boolean isColPalindrome(char[][] ch, int col, int start, int len){
        for(int k=0; k<len/2; k++){
            if(ch[start+k][col] != ch[start+len-1-k][col]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int tc=1; tc<=10; tc++){
            int n = Integer.parseInt(br.readLine());
            char[][] ch = new char[8][8];
            for(int i=0; i<8; i++){
                String s = br.readLine();
                for(int j=0; j<8; j++){
                    ch[i][j] = s.charAt(j);
                }
            }

            int cnt = 0;
            for(int i=0; i<8; i++){
                for(int j=0; j<=8-n; j++){
                    if(isRowPalindrome(ch, i, j, n)) cnt++;
                    if(isColPalindrome(ch, i, j, n)) cnt++;
                }
            }
            System.out.println("#" + tc + " " + cnt);
        }
    }
}
