package com.green.java.ch03;

public class OperatorEx21 {
    public static void main(String[] args) {
        System.out.printf("10 == 10.0f\t %b\n",10 == 10.0f); // %b-> boolean 타입
        System.out.printf("'0' == 0\t %b\n", '0'== 0); // 자동형변환 '0'이 int 형으로 바뀌면 저장될때 아스키코드에 의해 20이된다. 20 !== 0;
        System.out.printf("'A' == 65\t %b\n", 'A'==65);
        System.out.printf("'A' > 'B'\t %b\n", 'A' > 'B');
        System.out.printf("'A'+1 != 'B'\t %b\n", 'A'+1 !='B');
        System.out.printf("'A'+1 != 'C'\t %b\n", 'A'+1 !='C'); //!= -> 다르다는뜻.


    }
}
