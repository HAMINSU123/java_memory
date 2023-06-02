package com.green.java.ch05;

public class ArrayStudy5 {
    public static void main(String[] args) {

        int[] numArr = new int[]{11, 14, 2, 7, 36, 35};
        int[] copyArr = new int[numArr.length]; // numArr과 똑같은 크기의 배열을 만들고 싶을때 하는 방법이다.
        // 얕은 복사이다.


        //for(int i = 0 ; i < copyArr.length; i++){
//            copyArr[i] =  numArr[i];
//    } 이렇게 하면 딥카피이다 서로 다른 존재이므로 카피를 하기전에 대입하지 않는 이상 numArr의 값을 바꿧다고 해서
        // copyArr의 값이 변하지 않는다 이것이 바로 딥카피 깊은복사

        for(int i = 0; i< copyArr.length; i++){

            System.out.printf("copyArr[%d]: %d\n", i, copyArr[i]);
        }
    }
}
