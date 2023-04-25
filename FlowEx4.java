package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx4 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ';

        System.out.println("점수를 입력하세요 ->");
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt();

        if(score >= 90) {
            grade = 'A';

        } else if(score >= 80){
            grade = 'B';

        } else if(score >= 70){
            grade = 'C';

        } else{
            grade = 'D';
        }
        System.out.printf("%d점의 학점은 %c입니다.", score, grade);
    }
}
