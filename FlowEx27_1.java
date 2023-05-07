package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx27_1 {
    public static void main(String[] args) {

        int num;
        int sum = 0;   // 초기화

        Scanner scan = new Scanner(System.in); //화면에 입력할수있게 해줌
        System.out.println("합계를 구할 숫자를 입력하세요.(종료: 0)"); //화면에 글자가 나타남

        while (true) { // 조건식이 true라 실행됨.
            System.out.printf(" >> "); //숫자를 입력하기전 >>라는 표시가 나오게함.
            String temp = scan.nextLine(); // 문자열을 받아서
            num = Integer.parseInt(temp); //  숫자로 넘겨주는것

            if (num == 0) { // 만약 0이라면 무조건 끝!!!!!!!
                break;
            }
              sum += num; //그게 아니라면 sum = sum + num;
        }
        System.out.printf("합계 : " + sum);
    }
}

//숫자를 입력 받는다.  num = Integer.parseInt(temp);
//찍어낸다. System.out.printf(">> %d", sum);
//0인지 아닌지 구별한다.  if (num != 0) {
//0이 아니면 입력을받는다.
//0이면 멈추고 모든 입력의 합을 구한다. System.out.println("합계: " + sum);


