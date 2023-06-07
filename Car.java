package com.green.java.ch06;// 4월 21일 5월 2일 3번.

public class Car {
    static String brand;
    String model; //인스턴스멤버필드는 static을 사용할수가없다.
    int price;//인스턴스멤버필드는 static을 사용할수가없다.
    // static은 프로그램을 실행하자마자 올라가므로 객체화를 해줘야 한다.
    // Car c = new Car();
    //c.model = "현대";

    static void powerOn(){
        System.out.printf("%s 차의 모델명 %s차시동 걸림", brand);
        // System.out 이 대표적으로 static과 관련된 객체화하지않아도 쓸수있는것이다.
    }

    void printInfo(){
        System.out.printf("brand : %s, model : %s , price : %d\n",brand, model, price);
    }
}
