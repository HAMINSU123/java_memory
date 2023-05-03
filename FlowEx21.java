package com.green.java.ch04;
// 2023년 4월 13일


public class FlowEx21 {
    public static void main(String[] args) {


        for( int i = 1; i<=3; i++){
            for (int z = 1; z <=3 ; z++) {
                if(i == z) {
                    System.out.printf("[%d,%d]", i, z);
                }else {
//                    System.out.printf("%5c",' ');
                    System.out.print("      ");
                }
            }
            System.out.println();
            }
    }
}
