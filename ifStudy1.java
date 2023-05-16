package com.green.java.ch04;

public class ifStudy1 {
    public static void main(String[] args) {
        //if(조건식){ 조건식은 무조건 boolean type
        //}

         int num = 9;
         if(num == 10){
             System.out.println("num은 10이다."); //if문은 true일때만 실행이된다.

         } else{
             System.out.println("num은 10이 아니다.");

         }

         int num2 = 10;
         if(num2 >= 20){
             System.out.println("num2는 20이상");

         }else if(num2 >= 10){
             System.out.println("num2는 10이상");

         }else if(num2 >= 5){
             System.out.println("num2는 5이상");

         }else{
             System.out.println("num2는 5미만");
         }
    }
}
