package com.green.java.ch05;

/*

rNumArr은 10칸 가지고 있는 정수형 배열입니다.

각칸에 랜덤한 숫자 1~45사이의 값을 모든칸에 넣어주세요.

 */

public class ArrayQuiz2 {

    public static void main(String[] args) {

        int[] rNumArr = new int[6]; // 6개의 방을 만든다는뜻 0 1 2 3 4 5

        for (int i = 0; i < rNumArr.length; i++) { //rNUmArr 길이만큼 배열을 반복한다는뜻. 0부터 rNumArr까지, 배열이 0번부터 시작함을 꼭 기억해라!;;
            rNumArr[i] = (int) (Math.random() * 45) + 1;//(0.00000~0.999999*45)+1 int 형이라 소수점이 없어지므로 +1을 해줘야함
        }

        for (int i = 0; i < rNumArr.length; i++) {
            System.out.printf("rNumArr[%d]= %d\n", i, rNumArr[i]); //i =0부터 rNumArr[0] =  rNumArr[i] =(int)(Math.random() * 45)+1;
        }
    }
}

// 저 화장실좀....