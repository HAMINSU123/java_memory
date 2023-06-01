package com.green.java.ch05;

public class ArrayStudy1 {
    public static void main(String[] args) {
        //배열: 같은 타입의 여러값을 저장하기위한 공간.
        int n1 = 1, n2 = 2, n3 = 3;

        n1 = 2;


        int[] numArr = {10,20,30}; //String[] numArr3 = { };
        //10은 0번방 20은 1번방 30은 2번방 에 들어감.( 배열의 친구는 for문이다 기억꼭 하셈)- int형 방이 여러개다 라고 생각해야함.
        //만듦과 동시에 초기화 하는 방법 {}
        //그냥 배열의 길이를 변경하는건 불가능하다 새로운 배열을 하나 만들어서 기존의 것을 카피해주는 방법뿐이다.

//        int numArr2[] = {11,22}; 배열을 int타입이라고 착각할수있어서 JAVA에서는 잘 안씀

        numArr[0] =11;
        int num = numArr[1];

        System.out.println("num :" + num);


    }
}
