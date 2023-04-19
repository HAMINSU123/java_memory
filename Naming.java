package com.green.java.ch02;

public class Naming {
    public static void main(String[] args){

        //단어+단어+단어
        //Hello World Bye

        // 기법

        // 파스칼 케이스 기법 - (클래스명)은 보통 파스칼
        String HelloWorldBye;

        // 카멜 케이스 기법 제일 많이 쓰임 (변수명, 메소드명)
        String helloWorldBye;

        // 스네이크 케이스 기법(상수는 대문자 스네이크 케이스 기법으로 함)
        String hello_world_bye;

        // 케밥 케이스 기법(Java에서 사용 불가능)
        //String hello-world-bye;

        //자바 이름에 쓸 수 있는 특수기호 2개: _, $
        String _hi, h$i;

        //이름 처음에 숫자 사용할 수 없다., but 처음만 아니면 된다.
        // String 1o;(x) String a1a;(o)

        //이름에 빈칸 사용 할 수없다.
        //String hello World;

        //대소문자 구분
        String aaa;
        String aAa;
        String aaA;

        //예약어 사용 금지 (파란색상 단어는 예약어)
        //public static 과 같은 파란색 예약어는 사용 금지입니다. 대소문자로 구분한다면 가능하지만 그냥 쓰지마라.


         final int NUM= 16;

        //상수 의 이름은 모두 대문자  ex final int Num = 10; 상수는 한번 값이 입력되면 바꿀수 없다 절대 네버, 스네이크 기법
        // NUM = 20;


    }
}
