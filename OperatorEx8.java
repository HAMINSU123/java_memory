package com.green.java.ch03;

public class OperatorEx8 {
    public static void main(String[] args) {

        int a = 1_000_000; // 언더바는 아무런 영향을 안끼침 == (int a = 1000000;) 언더바는 무시함 센스같은 느낌임.
        int b = 1_0_0_0_0_0_0; // a=b=c
        int c = 1000000;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
