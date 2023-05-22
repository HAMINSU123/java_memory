package com.green.java.ch05;
/*
numArr 배열을 이용하여
각방의 짝수값만 콘솔에 출력해주세요.
14
2
36
 */
public class ArrayQuiz3 {

    public static void main(String[] args) {

        int[] numArr = {11, 14, 2, 7, 36};

        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] % 2 == 0) {
                System.out.println(numArr[i]);

            }
        }
//            for (int i = 0; i < numArr.length; i++) {
//                System.out.printf("numArr[%d] = %d\n", i, numArr[i]);
//            }

        }
    }

