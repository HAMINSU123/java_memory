package com.green.java.ch04;

public class ForQuiz3 {
    public static void main(String[] args) {

        //중첩 for문을 사용하여 별을 찍어주세요
        int star = 5;

        for(int i = 0; i < star; i++) {

            for(int j = 0; j < star; j++){

                System.out.print("*");
            }

            System.out.print("\n");
        }
    }
}
