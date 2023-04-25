package com.green.java.ch04;

public class FlowEx1 {
    public static void main(String[] args) {

        int x = 0;
        System.out.printf("x= %d 일때, 참인 것은\n", x);

        if(x==0) { System.out.println("x ==0"); } // 중괄호{} 습관적으로 적어야함 99.999퍼센트는 의미없음 오류를 줘서는 안된다.
        if(x!=0) { System.out.println("x !=0"); }
        if(!(x==0)) { System.out.println("!(x==0)"); }
        if(!(x!=0)) { System.out.println("!(x!=0)"); }

    }
}
