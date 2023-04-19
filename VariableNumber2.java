package com.green.java.ch02;

public class VariableNumber2 {
    public static void main(String[] args) {

        //literal 리터럴-> 값 그자체를 리터럴이라고 부른다.
        // 바이트의 범위 127을 넘어가면 반대로 돌아가서 -128부터 시작 즉 129를 넣으면 -127이 출력된다.
        byte b1 = 127;
        System.out.println(b1);

        int i1 = 128;
        //b1 = i1; 타입이 같아야 =을 사용할수있다.
        int i2 = b1; //-> 자동형변환

        b1 = (byte)i1; // (byte) 형변환-> 같은 변수로 선언해주는거임.
        System.out.println(b1); // -128로 출력된다.->넘치는현상 오버플로우 현상

        b1 = (byte)-129;
        System.out.println(b1);

    }
}
