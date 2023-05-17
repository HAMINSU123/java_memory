package com.green.java.ch04;

import java.util.Scanner;

public class ifStudy3 {
    public static void main(String[] args) {

        final int WOMAN_HEIGHT_STAND = 158;
        final int MAN_HEIGHT_STAND = 171;

        Scanner scan = new Scanner(System.in);
        System.out.print("성별 입력 (w, m) :");
        String gender = scan.nextLine();

        System.out.print("키 입력(cm): ");
        int height = scan.nextInt();

        if (gender.equals("m")){
            if (height == MAN_HEIGHT_STAND) {System.out.println("평균");}
            if (height > MAN_HEIGHT_STAND) {System.out.println("평균 초과");}
            if (height < MAN_HEIGHT_STAND) {System.out.println("평균 미만");}
        }
        else if(gender.equals("w")){
            if (height == WOMAN_HEIGHT_STAND) {System.out.println("평균");}
            if (height > WOMAN_HEIGHT_STAND) {System.out.println("평균초과");}
            if (height < WOMAN_HEIGHT_STAND) {System.out.println("평균 미만");}
        }
      }
    }

    // int stand = 0;
//int stand =0;
//if(gender.equals("w")){
//    stand = WOMAN_HEIGHT_STAND;
//}else if(gender.equals("m")){
//    stand = MAN_HEIGHT_STAND;
//        }
//
//if(height > stand){
//        System.out.println("평균초과");
//        }else if(height < stand){
//    System.out.println("평균미만");
//        }else{
//    System.out.println("평균")
//        }
