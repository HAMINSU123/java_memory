package com.green.java.ch05;

public class ArrayStudy4 {

    public static void main(String[] args) {

        int[] numArr = new int[] {123,20,30,40,50}; //사실 이렇게 거의 안쓰기는 한다.
        int[] copyArr = numArr; // 주소값 복사는 얕은복사이다. 이 개념은 꼭 알아야한다. 주소값 개념


        for(int i =0; i<copyArr.length; i++){

            System.out.printf("copyArr[%d] : %d\n" , i, copyArr[i]);

            // 주소값을 복사하여 numArr 으로도 값에 접속할수있고 copyArr로도 값에 접속할수있다.

        }

    }

}
