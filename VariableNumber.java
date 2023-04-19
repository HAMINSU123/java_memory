package com.green.java.ch02;

public class VariableNumber {
    public static void main(String[] args) {
        //변수 숫자형

        byte b1; // 안씀 이유 1byte 사용
        short s1; // 안씀 이유 2byte 사용
        long l1; // 8byte사용됨

        //정수형 : byte, short, int, long
        //실수형 : float,double
        //문자형 : char
        //불린형 : boolean
        // 8개 primitive type(원시타입, 기본 타입)
        // 나머지 대문자로 시작. reference type(참조 타입)

        int n1; // (정수형) 변수선언 컴퓨터가 처리하는 단위가 4바이트라서 인트가 제일 빠름.

        n1 = 10;
        System.out.println(n1);

        n1 = 20;
        System.out.println(n1);

        n1=30;
        System.out.println(n1);

    }
}
