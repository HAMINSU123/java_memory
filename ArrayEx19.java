package com.green.java.ch05; //4월 18일 6

/*
 번호 국어 영어 수학 총점 평균
 =========================
 1  100 100 100 270 90.0
 2  20  20  20  60  20.0
 ..........
 =========================
 총점
 국어:240
 영어
 수학
 */
public class ArrayEx19 {
    public static void main(String[] args) {

        int[][] score = {
                {100, 90, 80}
                , {20, 20, 20}
                , {30, 30, 30}
                , {40, 40, 40}

        };

        System.out.println("번호 국어 영어 수학  총점   평균");
        System.out.println("===========================");

        int ksum = 0;
        int esum = 0;
        int msum = 0;


        for (int i = 0; i < score.length; i++) {

            int sum = 0;
            double avg = 0;

            ksum = ksum + score[i][0];
            esum = esum + score[i][1];
            msum = msum + score[i][2];

            System.out.printf("%d", i + 1);

            for (int z = 0; z < score[i].length; z++) {

                sum = sum + score[i][z];

                System.out.printf("%5d", score[i][z]);
            }

            avg = sum / score[i].length;
            System.out.printf("%5d %5.1f\n", sum, avg);
        }
        System.out.println("===========================");
        System.out.println("총점");
        System.out.printf("국어: %d\n", ksum);
        System.out.printf("영어: %d\n", esum);
        System.out.printf("수학: %d\n", msum);

    }
}
