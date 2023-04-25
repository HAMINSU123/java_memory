package com.green.java.ch04;

public class BreakContinueStudy {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + ", ");

            if (i == 5) {
                System.out.println("\n5에서 끝!");
                break;
            }
        }
        System.out.println("-----------------");
        for (int i = 0; i < 10; i++) {

            if (i == 5) {
                continue;

            }
          if(i != 9) System.out.print(i+ ", ");
          if(i == 9) System.out.print(i );
        }
    }
}

//break 는 묻지도 따지지도 않고 stop
//continue 는 스킵의 개념으로 넘어가고 바로 for문으로 돌아감. (그다음