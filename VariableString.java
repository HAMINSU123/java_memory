package com.green.java.ch02;

public class VariableString {
    public static void main(String[] args){

        String s1 = "Hello"; // 대문자로 시작하는 객체 값은 무조건 주소값이다.
        String s2 = "World";

        System.out.println(s1);
        System.out.println(s2);

        String s3 = s1 + s2;
        System.out.println(s3);

        String s4 = s1 +" "+ s2;//더하기는 왼쪽부터 시작됨.
        System.out.println(s4);

        System.out.printf("s1 변수의 값은 %s %s", s1, s2);
    }
}
