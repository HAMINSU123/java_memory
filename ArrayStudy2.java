package com.green.java.ch05;

public class ArrayStudy2 {
    public static void main(String[] args) {
        int[] numArr = new int[5]; // 방만 만드는 방법
        // boolean 타입으로 배열을 만드는경우는 거의 없으나 default 값은 false 이다.

        for(int i =0; i<numArr.length; i++){

            System.out.println(numArr[i]);
        }


        boolean[] boolArr = new boolean[4];
        for(int i =0; i<boolArr.length; i++) {

            System.out.println(boolArr[i]);
        }


        String[] strArr = new String[3];

        //대문자로 시작하는 reference타입의 배열은 전부다 default값이 null이다.
        //null은 주소값이 없다는 의미이다.

        for(int i =0; i<strArr.length; i++){
            System.out.println(strArr[i]);

        }
    }
}
