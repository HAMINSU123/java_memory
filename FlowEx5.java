package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx5 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ', opt = '0';

        System.out.println("점수를 입력하세요 ->");
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt();
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        if (score > 70) {
            if (score % 10 >= 8) {
                opt = '+';
            } else if (score % 10 < 4) {
                opt = '-';
            }
        } else {
            opt = ' ';

        }

            System.out.printf("%d점의 학점은 %c%c입니다.", score, grade, opt);
        }
    }












//public class FlowEx5 {
//    public static void main(String[] args) {
//        int score = 0;
//        char grade = ' ', opt = '0';
//
//        System.out.println("점수를 입력하세요 ->");
//        Scanner scan = new Scanner(System.in);
//        score = scan.nextInt();
//
//        if (score >= 90) {
//            grade = 'A';
//        } else if(score >=80) {
//            grade = 'B';
//        }else if(score >=70) {
//            grade = 'C';
//        } else {
//            grade = 'D';
//        }
//        if(score>70 ) {
//            if (score % 10 >= 8) {
//                opt = '+';
//            } else if (score % 10 < 4) {
//                otp = '-';
//            }
//        }else {
//            opt = ' ';
//        }
//        }
//          else{
//          otp = ' ';
//        System.out.printf("%d점의 학점은 %c%c입니다.", score, grade, opt);
//    }
//}