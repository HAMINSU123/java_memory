package com.green.java.ch06; // 4월 20일 6번째 연습 깃허브 복사하기.

import java.util.Arrays;
import java.util.Scanner;

public class NumberBaseBallGame {
    static int getRandomNumber2(int min, int max) {

        return (int) (Math.random() * ((max - min + 1))) + min;
    }

    static int[] getRandomNumberArr(int numberCount) {

        int[] arr = new int[numberCount];//new 객체생성하는거
        int selectedIdx = 0;

        Loop:
        while (selectedIdx < arr.length) {

            int rVal = getRandomNumber2(1, 9);

            for (int i = 0; i < selectedIdx; i++) { //랜덤한 값이 중복된것이 있ㄴ는지 확인하는 반복문
                if (arr[i] == rVal) {
                    continue Loop; // 루프는 반복문 While의 닉네임 중복된 값을 찾으면 다시 while문으로 올라가는 구조.
                }
            }
            arr[selectedIdx++] = rVal;
        }
        return arr;
    }

    public static void main(String[] args) {
        final int NUMBER_COUNT = 3;
        int[] numArr = getRandomNumberArr(NUMBER_COUNT);//리턴타입 int[]
        System.out.println(Arrays.toString(numArr));

        Scanner scan = new Scanner(System.in);
        System.out.println("[Game Start}");

        int count = 0;

        while (true) {
            int[] myArr = new int[NUMBER_COUNT]; // 사용자에게 번호를 입력받는 부분.
            for (int i = 0; i < NUMBER_COUNT; i++) {
                System.out.printf("%d번 숫자 입력: ", i + 1);
                myArr[i] = scan.nextInt();
            }
            count++;
            int s = 0, b = 0, o = 0;
            for (int i = 0; i < NUMBER_COUNT; i++) {

                for (int z = 0; z < NUMBER_COUNT; z++) {

                    if (numArr[i] == myArr[z]) {

                        if (i == z) {
                            s++;
                        } else {
                            b++;
                        }
                    }
                }
            }
            o = NUMBER_COUNT - (s + b);
            System.out.printf("S: %d, B: %d, O: %d\n", s, b, o);

            if (s == NUMBER_COUNT) {
                break;
            }
        }
        System.out.printf("[Game Over]count: %d", count);
    }
}