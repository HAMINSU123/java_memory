package com.green.java.ch04; //4월 20일 5번째 연습


import java.util.Scanner;
public class FlowEx28Method {
    public static int getRandomNumber (int min , int max){
        return (int)(Math.random() * ((max - min)+1)) + min;
    }
    public static void main(String[] args) {

        int input,answer;
        Scanner scan = new Scanner(System.in);
        answer = getRandomNumber(1, 100);
        System.out.println(answer);

        do{
            System.out.println("1~100사이의 정수를 입력:");
            String temp = scan.nextLine();
            input = Integer.parseInt(temp);

            if (input < answer) {
                System.out.println("up");

            } else if (input > answer) {
                System.out.println("down");
            }
        } while(input != answer);
        System.out.print("good!");
    }
}

