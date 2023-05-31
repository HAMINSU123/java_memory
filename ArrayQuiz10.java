package com.green.java.ch05;
/*
배열에서 가장 작은 숫자를 찾아내서 출력해 주세요.

 */
public class ArrayQuiz10 {
    public static void main(String[] args) {

        int[] numArr = {11, 14, 2, 7, 36, };
        int min = numArr[5];

        for (int i = 0; i < numArr.length; i++) {

            if (numArr[i] < min) {

                min = numArr[i];

            }
        }
        System.out.println("min: " + min);
    }
}