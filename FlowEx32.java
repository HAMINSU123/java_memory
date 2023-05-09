package com.green.java.ch04;

import java.util.Scanner;

/*
(1) square
(2) square roat
(3) lag
원하는 메뉴(1~3)를 선택하세요. (종료:0) >4
메뉴를 잘못 선태ㅔㄱ하셨습니다(종료:0)
(1) square
(2) square roat
(3) lag
원하는 메뉴(1~3)를 선택하세요. (종료:0) >1
(1) square
(2) square roat
(3) lag
 */
public class FlowEx32 {
    public static void main(String[] args) {



//        Scanner scan = new Scanner(System.in);
//        System.out.println("(1)square\n(2)square roat\n(3)lag");
//        System.out.println("원하는 메뉴(1~3)를 선택하세요. (종료:0)");
//
//        int input;
//        while(true){
//
//            input =scan.nextInt();
//            if(input ==0){
//                break;
//            }
//            if(input<=3){
//                System.out.printf("선택하신메뉴는 %d번입니다.\n",input);
//
//            }
//            else if(input > 3 || input < 0){
//                System.out.println("잘못 입력하셨습니다.");
//                System.out.println("(1)square\n(2)square roat\n(3)lag");
//                System.out.println("원하는 메뉴(1~3)를 선택하세요. (종료:0)");
//
//            }
//        }
//        System.out.println("프로그램을 종료 합니다");

        Scanner scan =  new Scanner(System.in);
        while(true){
            System.out.println("(1)square");
            System.out.println("(2)square root");
            System.out.println("(3)lag");
            System.out.println("원하는 메뉴(1~3)을 선택하세요(종료:0)>");

            int menu =scan.nextInt();

            if(menu <0 || menu>3){
                System.out.println("메뉴를 잘못선택하셨습니다(종료:0)");
            }else if(menu == 0){
                break;
            }else{
                System.out.printf("선택하신 메뉴는 %d번입니다\n" , menu);
            }
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
/*
(1) square
(2) square roat
(3) lag
원하는 메뉴(1~3)를 선택하세요. (종료:0) >4
메뉴를 잘못 선태ㅔㄱ하셨습니다(종료:0)
(1) square
(2) square roat
(3) lag
원하는 메뉴(1~3)를 선택하세요. (종료:0) >1
(1) square
(2) square roat
(3) lag
 */