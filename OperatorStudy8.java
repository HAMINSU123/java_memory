package com.green.java.ch03;

import java.util.Scanner;

public class OperatorStudy8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 입력 :");
        int num = scan.nextInt();
        System.out.println("num : " + num);

        String x = " 짝수 ";
        String y = " 홀수 ";

        String result = (num % 2 == 0) ?  x : y;
        System.out.println(result);

        //System.out.println(num + "은" + (num % 2 == 0 ? "짝수" : "홀수"));
        // String result = (num % 2 == 0) ? " 짝수 " : " 홀수 ";
        //System.out.printf("숫자 %d는 %s이다.", num , result);





    }
}
