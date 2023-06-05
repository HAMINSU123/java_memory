package com.green.java.ch06;

public class BikeTest2 {
    public static void main(String[] args) {

        Bike b1 = new Bike("야마하","H2-1",10000);
//        Bike b2 = new Bike(b1); // 새로운 객체를 만들었는데 b1에 있던거를 깊은 복사하는거 인스턴스를 복사했다고 보면된다.
        Bike b2 = b1;// 얕은 복수 (위에거는 깊은 복사)
        b2.brand = "혼다";


        System.out.println("b1.brand : " + b1.brand);
        System.out.println("b2.brand : " + b2.brand);
    }

    
}
//static 은 무조건 붙이는걸 추천한다.  객체화를 따로 안해도돼서 편리하다.(늘 상주해있는 메모리이기 떄문에)
//속도가 빠르기때문에 적극추천이다.( 예전에는 메모리가 부족해서 쓰지말라했지만 지금은 넘치는시대이다)
//객체를 생성할때는 무조건 생성자를 사용해야하기떄문에 생성자를 생성한다.
//객체화 하면서 동시에 멤버필드값을 초기화하고 싶을때 생성자를 생성한다.

//this 은 나자신의 주소값(상수)
//super 는 직속부모의 주소값(상수)
//super() this() 여기서 ()소괄호의 뜻 생성자호출할때 ()소괄화 안에 쓴다.
//this. 은 내중심에서 멤버필드나 멤버메소드를 호출할떄
//super. 은 부모중심에서 멤버필드 멤버메소드를 호출할때.