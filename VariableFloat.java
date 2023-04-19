package com.green.java.ch02;

public class VariableFloat {
    public static void main(String[] args){

        //double, float
        float f1 = 10;// 소수점이 들어있으면 무조건 double 타입
        System.out.println(f1);

        f1 = 9.77f; // 9.77은 기본적으로 double 타입이다. 더블타입을 플롯으로 바꿀때는 f를 줘야함. long도 l을 붙여줘야함.
        System.out.println(f1);
        //실수저장을 정수방식으로 저장하려면 공간을 너무많이 차지함. 그래서 실수방식을 많이 사용하지않음.(double이 저장공간이 많아 더 정확함)
        //실수를 쓸거면 double 속도를 요하는거면 float

        long l1 = 100;
        float f2 = (float)l1; // 롱타입인데 플롯타입에 들어감 문제가 되지않아 자동형변환이 이뤄짐. float 4byte long 8byte??
        System.out.println(f2);

        double d1 = 9.77;

    }
}
