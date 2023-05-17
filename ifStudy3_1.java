package com.green.java.ch04;

import java.util.Scanner;

public class ifStudy3_1 {
    public static void main(String[] args) {

        final int MAN_HEIGHT_STAND = 171;
        final int WOMAN_HEIGHT_STAND =152;

        Scanner scan =new Scanner(System.in);
        System.out.println("성별을 입력하세요(w,m): ");
        String gender = scan.nextLine();
        System.out.println("키를 입력하세요(cm): ");
        int height = scan.nextInt();

        int stand = 0;
        if(gender.equals("w")){
            stand= WOMAN_HEIGHT_STAND;
        }else if(gender.equals("m")){
            stand= MAN_HEIGHT_STAND;
        }

        if(height>stand){
            System.out.println("평균초과");
        }else if(height<stand){
            System.out.println("평균미만");
        }else{
            System.out.println("평균");
        }
    }
}
