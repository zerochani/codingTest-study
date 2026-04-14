package com.youngchan.baekjoon;
import java.util.*;
public class boj_3986 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for(int i=0; i<n; i++){
            String str = sc.next();
            if(isGoodWord(str)){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
    static boolean isGoodWord(String str){
        //홀수인 경우 짝이 맞지 않으므로 바로 false 반환
        if(str.length() % 2 !=0) return false;
        Stack<Character> stack = new Stack<>();
        for(char c : str.toCharArray()){
            //현재 문자와 스택의 최상단 문자가 같으면 짝이 맞는 것이므로 스택에서 제거
            if(!stack.isEmpty() && stack.peek() == c){
                stack.pop();
            }else{
                //짝이 맞지 않는 경우 스택에 현재 문자 추가
                stack.push(c);
            }
        }
        //모든 문자가 짝이 맞는 경우 스택이 비어있게 되므로 true 반환, 그렇지 않으면 false 반환
        return stack.isEmpty();
    }
}
