package com.green.java.ch05;

/*
numArr 배열을 이용하여
copyArr은 numArr보다 1칸 더많게 만들어주세요.
마지막방에는 100을 넣어주세요.
copyArr에  numArr을 deep copy 해주세요.
 */

import java.util.Arrays;

public class ArrayQuiz7 {
    public static void main(String[] args) {
        int[] numArr = {11,14,2,7,36,35};
        int[] copyArr= new int[numArr.length+1];

        copyArr[numArr.length] = 100;
        for(int i = 0; i < numArr.length; i++) {
                copyArr[i] = numArr[i];

        }

//        copyArr[numArr.length] = 100;
//
//        for(int i = 0; i < copyArr.length; i++) {
//
//            System.out.printf("copyArr[%d] > %d\n", i, copyArr[i]);
//
//        }
        String result = Arrays.toString(copyArr);
        System.out.println(result);
    }
}
