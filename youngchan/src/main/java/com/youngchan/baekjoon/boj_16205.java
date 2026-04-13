package com.youngchan.baekjoon;
import java.util.*;
public class boj_16205 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int type = sc.nextInt();
        String name = sc.next();

        List<String> words = new ArrayList<>();

        if(type == 1){ //camelCase
            int start = 0;
            for(int i=1; i<name.length(); i++){
                if(Character.isUpperCase(name.charAt(i))){
                    words.add(name.substring(start,i).toLowerCase());
                    start = i;
                }
            }
            words.add(name.substring(start).toLowerCase());
        }else if(type == 2){
            String[] split = name.split("_");
            for(String s : split) words.add(s);
        }else if(type == 3){
            int start = 0;
            for(int i=1; i<name.length(); i++){
                if(Character.isUpperCase(name.charAt(i))){
                    words.add(name.substring(start,i).toLowerCase());
                    start = i;
                }
            }
            words.add(name.substring(start).toLowerCase());
        }
        System.out.println(toCamel(words));
        System.out.println(toSnake(words));
        System.out.println(toPascal(words));
    }

    //첫 단어 소문자, 이후 단어 첫 문자만 대문자
    static String toCamel(List<String> words){
        StringBuilder sb = new StringBuilder(words.get(0));
        for(int i=1; i<words.size(); i++){
            String w = words.get(i);
            sb.append(Character.toUpperCase(w.charAt(0))).append(w.substring(1));
        }
        return sb.toString();
    }
    //모든 단어 소문자, 단어 사이 언더바
    static String toSnake(List<String> words){
        return String.join("_", words);
    }

    //모든 단어 첫 문자 대문자
    static String toPascal(List<String> words){
        StringBuilder sb = new StringBuilder();
        for(String w : words){
            sb.append(Character.toUpperCase(w.charAt(0))).append(w.substring(1));
        }
        return sb.toString();
    }
}
