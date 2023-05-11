package com.green.java.ch04;

import java.util.Scanner;

public class ForQuiz5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("출력하고 싶은 구구단은?");
        int gugudan = scan.nextInt();
//
        for (int i = 1; i <= 9; i++) {

            System.out.printf("%d x %d = %d", gugudan, i, gugudan * i);
            System.out.println();
        }
//
//        for( int gugudna = 2; gugudan<=9; gugudan++){
//            for (int i = 1; i <= 9; i++) {
//                System.out.printf("%d x %d = %d\t", gugudan, i, gugudan * i);
//
//            }
//            System.out.println();
//        }

    }
}

//출력하고싶은 구구단을 입력받을거야
//
