package com.green.java.ch04;
//for문은 정확히 숫자로 반복숫자를 알면 for문  언제끝날지를 알면 while문
public class WhileStudy1 {

    public static void main(String[] args) {

        for(int i =0; i<5; i++){
            System.out.println("for");
        }
        System.out.println("--------");

        int i = 0;

        while(i < 5){
            
            System.out.println("while");
            i++;

        }
    }
}
