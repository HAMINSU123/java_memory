package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx25 {
    public static void main(String[] args) {

        int num = 0, sum = 0;

        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 입력하세요. (예:12345)> "); //123
        String temp = scan.nextLine();
        num = Integer.parseInt(temp);

        while(num > 0){
//입력받는거 1의 자리수를 받고 더하고 1의 자리수를 버리고 나머지를 더할생각했음.
            int z = num % 10; //// 123%10 은 3


            sum = sum + z;//123%10=3

            num= num / 10;


        }

        System.out.println("총합은\t" + sum);
    }
}

