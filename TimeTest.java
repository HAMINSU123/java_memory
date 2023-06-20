package com.green.java.ch06;

import java.util.Scanner;

public class TimeTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Time t1 = new Time(); // t1에 시분초값을 저장한 주소값을 가지고 있게 객체화했다.

        //멤버 필드 갯수를 보면 알수있다. Time.java랑 연동이니깐 둘다 봐야함!!!!!
//        t1.hour =10;  은닉화해서 오류가 남.
        // hour 1~23만 저장하고 24가 되면 저장되면 안된다.\
        // Time 이라는 클래스를 타입으로 설정했고 Time 이라는 객체의 주소값을 t1에 할당했다는 뜻/


        System.out.print("시간을 입력하시오: ");
        int hour = scan.nextInt();

        System.out.println("hour : " + t1.getHour());

        t1.setHour(hour);
        System.out.println("hour : " + t1.getHour());// 멤버필드는 무조건 private

    }
}

