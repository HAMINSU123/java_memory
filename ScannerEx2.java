package com.green.java.ch02;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("이름을 입력해주세요->");
        String name = scan.nextLine();
        System.out.print("나이를 입력해주세요->");
        String ageinput = scan.nextLine();
        int age = Integer.parseInt(ageinput);

        System.out.println("제 이름은"+" "+name+"이고 나이는"+age+"입니다.");







    }
}
