package com.green.java.ch04;

//랜덤값 1~100사이의 랜덤값.
//1~100 사이의 정수를 입력 : 50
//down
//1~100 사이의 정수를 입력 : 24
//up
//1~100 사이의 정수를 입력 : 30
//good!
// 노션 슬랙 피그마를 사용하게 될거다(업무 보조 사이트).

import java.util.Scanner;

public class WhileStudy2 {

    public static void main(String[] args) {

        int input, answer;
        answer = (int)(Math.random() * 100)+1;//0~4
        System.out.println(answer);

        Scanner scan = new Scanner(System.in);
        System.out.println("1~100사이의 정수를 입력:");

        String temp = scan.nextLine();
        input = Integer.parseInt(temp);

        while(input != answer) {

            if (input < answer) {
                System.out.println("up");


            } else if (input > answer) {
                System.out.println("down");

            }
            System.out.println("1~100사이의 정수를 입력:");
            temp = scan.nextLine();
            input = Integer.parseInt(temp);
        }
        System.out.print("good!");
    }
}
// 1~100사이의 정수를 입력: input = Integer.parseInt(temp);
// 만약 랜덤숫자보다 작으면 if (input < answer) {
//                System.out.println("up");
// 만약 랜덤 숫자보다 크면 else if (input > answer) {
//                System.out.println("down")
// up이나  down 이면 "정수를 입력하시오가 나와야한다
// 맞으면 good! 끝내면된다.System.out.print("good!");