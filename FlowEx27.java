package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx27 {
    public static void main(String[] args) {

        int num;
        int sum = 0;
        boolean flag = true;// while 조건식으로 사용하세요.

        Scanner scan = new Scanner(System.in);
        System.out.println("합계를 구할 숫자를 입력하세요.(끝내려면 0)");



        while (flag) {
            System.out.printf(" >> ");
            String temp = scan.nextLine();
            num = Integer.parseInt(temp);

            if (num == 0) {
                flag = false;

            } else {
              sum += num;

            }
        }
        System.out.printf("합계 : " + sum);
    }
}

//숫자를 입력 받는다.  num = Integer.parseInt(temp);
//찍어낸다. System.out.printf(">> %d", sum);
//0인지 아닌지 구별한다.  if (num != 0) {
//0이 아니면 입력을받는다.
//0이면 멈추고 모든 입력의 합을 구한다. System.out.println("합계: " + sum);
