package com.green.java.ch04; //  4월 20일 1번 별찍기 메소드 2번 3번 메소드의 재활용성을 높이면 아주 쉽게 문제해결이 가능하다
                            // 중복된 소스는 개발자로써 죄를 짓고있는것이다.

public class FlowEx17Method {
    public static void main(String[] args) {
        int star = 5;
        printStarLine(star); //***** (개행)
        printStarLine(4);//***(개행)

        System.out.println("-------------");
        printStarRect(3);

        System.out.println("-------------");
        printStarTri(4);
    }
    public static void printStarLine(int star) {

        for (int i = 0; i < star; i++) {

            System.out.print("*");
        }
        System.out.print("\n");
    }
public static void printStarRect(int star){
        for (int i = 0; i < star; i++) {
           printStarLine(star); // printStarLine
        }
    }
    public static void printStarTri(int star){
        for(int i =0; i < star; i++){
            printStarLine(i+1);
            }
            System.out.println();
        }

    }

    //사이소라는 업체는 SI업체가 아니다.