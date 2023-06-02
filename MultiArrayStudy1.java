package com.green.java.ch05; // 4월 18일2

public class MultiArrayStudy1 {

    public static void main(String[] args) {
        int[][] score = new int[4][3]; // 1차원 배열은 띠모양이고 2차원 배열은 표모양이다. 세로줄 0123에 가로줄 012 표모양이다.
        int[][] temp = {

                {0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}, // 결구 이 배열은  int [][] temp = {temp0,temp1,temp2,temp3}; 배열을 담을 수있는 배열이라고 생각하면된다.
        };

        System.out.printf("temp.length: %d\n", temp.length);
        System.out.printf("temp[0].length: %d\n", temp[0].length);
        System.out.printf("temp[1].length: %d\n", temp[1].length);
        System.out.printf("temp[2].length: %d\n", temp[2].length);

        int[] arr0 = temp[0];
        arr0[0] = 30;
        System.out.printf("temp[0][0]> %d\n", temp[0][0]);

        System.out.println(score[0][0]); // score 영번 행에 영번줄
        score[2][1] = 10; //2번줄에 1번칸

        System.out.println("score[2][1] : " + score[2][1]);
        System.out.println("score.lenth : " + score.length); // score.length 하면 세로줄값이 나온다.
        System.out.println("score[0].length : " + score[0].length);// 세로줄의 길이 값을 하면 가로줄길이가 나온다.


    }
}
