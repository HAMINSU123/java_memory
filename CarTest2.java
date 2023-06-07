package com.green.java.ch06;// 4월 21일

public class CarTest2 {
    public static void main(String[] args) {
        Car c1 = new Car(); // Car타입에 c1 에 Car()생성자를 호출하면서 new 키워드를 사용해서 카객체의 주소값을 c1에 넣는다.
        Car.powerOn();
        c1.price = 2000;
        c1.brand = "기아";
        c1.model = "소나타";
//        Integer.parseInt("11");
        // 객체형성을 하지않고 바로 쓸수있는것 static 밖에없다는거 꼭기억해두기
        //parseInt에 커서 올려보면 static이 선언돼있다.
    }
}
