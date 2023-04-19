package com.green.java.ch02;

import java.util.Scanner; //import 하는 이유 (Alt+enter누르기) 안쓸때는 안해놨다가 쓸때만 사용 (String은 자동 import)

public class ScanerEx {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("두자리 정수를 하나 입력해주세요.>");
        String input = scan.nextLine();
        int num = Integer.parseInt(input); //Integer.parseInt 메소드 자주 사용함

        System.out.println("입력내용 : " + input + 1);
        System.out.printf("num=%d\n",num + 1);



    }
}
