package com.green.java.ch04;
/*
 변수 i를 활요하여
 4- i can do it.
 3
 2
 1
 */

public class FlowEx23 {
    public static void main(String[] args) {

        int i = 5;
        while (i >0) {
                System.out.printf("%d -I can do it\n", i - 1);

                i--;

        }
    }
}
