package com.green.java.ch03;

public class OperatorEx18 {
    public static void main(String[] args) {

        double pi= 3.141592;
        double shortpi = Math.round(pi * 1000) / 1000.0;
        System.out.println(shortpi);

        System.out.println(Math.round(3156.2)); // 반올림(정수)
        System.out.println(Math.round(3156.7)); // 반올림(정수)
        System.out.println(Math.ceil(3156.2)); //  올림(소수점 남김)
        System.out.println(Math.floor(3156.27)); // 내림(소수점 남김)

    }
}
