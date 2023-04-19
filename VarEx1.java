package com.green.java.ch02;

public class VarEx1 {
    public static void main(String[] args){

        int year = 0;
        int age = 14;

        System.out.println(year);
        System.out.println(age);

        year = age + 2000;
        age = age + 1 ; // 이런식의 연산을 많이 사용하니까 유의할것.
        System.out.println(year);//println 은 메소드 ()소괄호만 보이면 메소드라고 의심부터해보셈
        System.out.println(age);

    }
}
