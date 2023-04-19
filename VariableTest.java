package com.green.java.ch02;

public class VariableTest {
    public static void main(String[] args){

        String r1 = "안녕" + 1; //String type-> "안녕" 1-> 정수타입.(자동형변환)
        System.out.println(r1);

        String r2 = "안녕" + (1 + 1);
        System.out.println(r2);


        String r3 = 1 + 1 + "안녕";
        System.out.println(r3);

    }
}
