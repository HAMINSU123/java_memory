package com.green.java.ch05;//4월 18일

import java.util.Arrays;

public class ArrayQuiz12 {
    public static void main(String[] args) {
        int[] numArr = {11, 14, 2, 7, 36, 39}; // int대신 String 을 쓰면 String 값만 넣을수있다.
        int temp = 0; // 천단위 콤마(1,000)을 하고싶으면 % , d를 해주면 된다.



        for (int i = 0; i < numArr.length; i++) {

            int c = (int)(Math.random() * 6 );

            temp = numArr[i];
            numArr[i]= numArr[c];
            numArr[c]= temp;

        }
            System.out.println(Arrays.toString(numArr));
    }

}

