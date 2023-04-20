package com.green.java.ch03;

public class OperatorEx24 {
    public static void main(String[] args) {
        // &&-> and 연산자
        // ||-> or  연산자
        // (2 > 1) && (3 > 2) -> 전부 true 여야 true 가 나옴(true)
        // (2 > 1) && (3 > 2) && (3 >= 5)-> 전부 true 여야 true 가 나옴(false)

        // (2 > 1) || (3 > 2) || (3 >= 5) 하나라도 true면 전부다 true
        // and 연산자는 거짓이 될 확률이 높으므로 false될 가능성이 가장 높은것을 앞쪽으로 배치하는게 좋다.
        // 반대로 or 연산자는 참일 확률이 높은것을 앞쪽에 배치하면 계산이 줄어든다.

        boolean r1 = (2 > 1) && (3 > 2);
        System.out.printf("r1 : %b\n", r1);

        r1 = (2 > 1) && (3 > 2) && (3 >= 5);
        System.out.printf("r1 : %b\n",r1);

        boolean r2 = (2 > 1) || (3 > 2) || (3 >= 5);
        System.out.printf("r2 : %b\n", r2);




    }
}
