package com.green.java.ch04;

import java.util.Scanner;

public class WhileStudy3 {
    public static void main(String[] args) {

        int input, answer;
        Scanner scan = new Scanner(System.in);
        answer = (int)(Math.random() * 100)+1;


        while(true){
            System.out.print("1~100사이의 정수를 입력: ");
            input =scan.nextInt();

            if(input ==answer){
                break;
            }

            if(input > answer){
                System.out.println(" down ");

            }else if(input < answer){
                System.out.println(" up ");
            }
        }
        System.out.println(" good ");
    }
}
//1~100사이의 정수를 입력 할것이다. input

// 랜덤한 숫자를 지정해줄 것이다.
// 만약 랜덤한 숫자보다 입력한값이 크면 다운
// 만약 랜덤한 숫자보다 입력한 값이 작으면 업
// 0을 입력하면