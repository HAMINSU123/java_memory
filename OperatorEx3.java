package com.green.java.ch03;

public class OperatorEx3 {
    public static void main(String[] args) {
        int i =5, z=5;

        System.out.println(i++);
        System.out.println(++z);
        System.out.printf("i=%d, j=%d\n",i,z); //가독성 때문에 사용.

        int k = 5;
        int r = k++ - ++k; // 좋은 소스는 아니다. 그냥 생각정도 해보라는뜻
        System.out.println(r); //-2

    }
}
