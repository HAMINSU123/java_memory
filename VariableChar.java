package com.green.java.ch02;

public class VariableChar {
    public static void main(String[] args){

        //변수 선언과 초기화 동시 가능

        char c1 = 'A'; //문자, 문자열x, 홑따옴표 사용, 많이 사용하지않음.
        System.out.println(c1);

        c1 = '한';
        System.out.println(c1);
        //변수의 값을 변경하려면 대입연산자= 밖에 없다.(단어의 의미를 잘알아야한다.)

        c1 = 'B';

        System.out.printf("%c : %d \n", c1 , (int)c1); //%c는 문자타입, %d는 정수타입
        //http://www.tcpschool.com/c/c_intro_printf 참고하면 답나옴
        //변수명 한글쓰지마라. 변수명은 무조건 영어로 사용을 권장한다.



    }
}
