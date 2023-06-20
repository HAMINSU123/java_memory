package com.green.java.ch06;//5월 2일 2번

public class Tv {
    //인스턴스 멤버필드
    String color;
    boolean power;
    int channel;


    static String brand;  //클래스 멤버필드

    void power() {
        power = !power;
    }

    //static을 사용할수있는경우는 멤버필드를 사용하지않을때이다.(유일하게 사용가능한건 static자체의 멤버필드 일때 뿐이다. final)
    void channelUp() {
        ++channel;
    }

    void channelDown() {
        --channel;
    }

//    Tv(){ 기본생성자는 컴파일러가 자동으로 생성해준다. 물론 생성자가 없을경우만
//        super();// 부모클래스의 생성자를 호출하는거입니다. 위에 아무것도 없으므로 직속 부모는 오브젝트이다.
//    }

    void test(String str) {
        System.out.println(str);
    }

    static String getBrand() {

        return brand;

    }
}
