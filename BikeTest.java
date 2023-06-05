package com.green.java.ch06;//4월 21일 7


import java.util.Scanner;

public class BikeTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // System.in - 스태틱이다. 객체화 안하고 쓰고있다. 대문자+. 이면 스태틱이다.

        Bike b1 =new Bike();// Bike(); -> 생성자호출, 객체생성할때 무조건 생성자를 호출해야한다.
        //생성자도 오버로딩이 된다.
        b1.brand = "혼다";//객체생성후 초기화 한것.

        Bike b2 = new Bike("야마하");//객체생성과 초기화를 동시에 한것

        System.out.println("b1.brand: "+ b1.brand);
        //null이 뜨는 이유

        System.out.println("b2.brand: "+ b2.brand); // 대문자 +. 이므로
    }
}
