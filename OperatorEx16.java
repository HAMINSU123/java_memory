package com.green.java.ch03;

public class OperatorEx16 {
    public static void main(String[] args) {

        float pi =3.141592f;
        float shortpi = (int)(pi * 1_000) / 1_000f; // 컴퓨터가 처리할때 나누기보다 곱하기가 더 빠르므로 곱하기로 표현해주는게 좋다.
        System.out.println(pi);
        System.out.println(shortpi);

    }
}
