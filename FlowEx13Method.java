package com.green.java.ch04; // 4월 19일

public class FlowEx13Method {
    public static void main(String[] args) {

        printAllsum(1, 100);
        printAllsum(2, 3);

    }
    public static void printAllsum(int min, int max) { // printAllsum 이라는 메소드명 앞에 static 을 붙여주면 위에 것을 가져다가 쓸수있다.

        int sum = 0;
        for ( int i = min; i<max+1; i++) {
            sum = sum + i;

        }
        System.out.printf(" %d ~  %d sum : %d\n",min, max, sum);
    }
}


