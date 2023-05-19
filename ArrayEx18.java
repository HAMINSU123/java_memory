package com.green.java.ch05; //4월 18일 5
/*
socre[0][0]=100
socre[0][1]=100
socre[0][2]=100
socre[1][0]=100
.....
socre[3][2]=100
sum = 570
 */
public class ArrayEx18 {
    public static void main(String[] args) {

        int[][] score = {
                {100, 100, 100}
                , {20, 20, 20}
                , {30, 30, 30}
                , {40, 40, 40}

        };
        int sum = 0;

        for (int i = 0; i < score.length; i++) {

            for (int z = 0; z < score[i].length; z++) {

                System.out.printf("score[%d][%d]= %d \n",i ,z, score[i][z]);
                sum = sum + score[i][z];
            }

            System.out.println();

        }

        System.out.printf("sum = %d\n",sum);

    }
}
