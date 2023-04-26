package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx6 {
    public static void main(String[] args) {
        System.out.println("현재 월을 입력하세요. (1~12)");

        Scanner scan = new Scanner(System.in);
        int mon =scan.nextInt();

        switch(mon){
            case 3:
            case 4:
            case 5:
                System.out.println("현재의 계절은 봄입니다. ");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("현재의 계절은 여름입니다. ");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("현재의 계절은 가을입니다. ");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("현재의 계절은 겨울입니다. ");
                break;
            default:
                System.out.println("잘못된 입력값 입니다.");
                break;

        }
    }
}

//mon 값이
        //3,4,5 라면 " 현재의 계절은 봄입니다.
        //6,7,8 라면 " 현재의 계절은 봄입니다.
        //9,10,11 라면 " 현재의 계절은 봄입니다.
        //12,1,2 라면 " 현재의 계절은 봄입니다.


