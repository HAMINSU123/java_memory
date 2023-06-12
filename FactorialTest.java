package com.green.java.ch06; // 4월 21일 책 272페이지


// 재귀호출 = 찾아보기 지금은 있다 정도만 알고 넘어가는걸로
public class FactorialTest {

    public static void main(String[] args) {
        int result = factorial(3);

        System.out.printf("result : %d\n", result);
    }


    static int factorial(int n) {

        System.out.println(n);
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);

    }
}