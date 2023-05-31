package com.green.java.ch05;//4월 18일
/*
배열에서 평균값.

 */
public class ArrayQuiz11 {
    public static void main(String[] args) {

        int[] numArr = {11, 14, 2, 7, 36, 39};
        int sum = 0;


        for (int i = 0; i < numArr.length; i++) {

            sum = sum + numArr[i];

        }

        double avg = sum / (double) numArr.length;
        System.out.printf("avg : %.2f",avg);
    }
}