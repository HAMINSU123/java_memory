package com.green.java.ch04;

import java.util.Scanner;

public class ifStudy2 {
    public static void main(String[] args) {

        Scanner scan =  new Scanner(System.in);
        System.out.print(" 점수 입력: ");
        double score = scan.nextDouble();

        if(score > 100 || score < 0){
            System.out.println(" 점수는 0~100점 사이입니다. ");

        } else if(score >= 90){
            System.out.println("A");

        } else if(score >= 80){
            System.out.println("B");

        } else if(score >= 70){
            System.out.println("C");

        } else {
            System.out.println("D");

        }
    }
}
