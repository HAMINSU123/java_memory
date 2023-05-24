package com.green.java.ch05;
/*
모든 방값중에 홀수값만 더해주세요
 */
public class ArrayQuiz5 {

    public static void main(String[] args) {
        int[] numArr = {11,14,2,7,36,35};

        int oddSum = 0;

        for (int i = 0; i < numArr.length; i++) {

            if(numArr[i] % 2 == 1)
                oddSum = oddSum + numArr[i];

        }
        System.out.printf("odd-sum: %d", oddSum);

    }
}
