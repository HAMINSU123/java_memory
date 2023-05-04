package com.green.java.ch04;// 4월 20일 4번째 연습.

import java.util.Scanner;

public class FlowEx25Method {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 입력하세요. (예:12345)> "); //123
        String temp = scan.nextLine();

        int sum = sumStringNumber(temp); // 이문장을 보면 리턴이 되는지 왜 리턴이되는지 왜 메소드타입 void가 아닌지 알수있다.
        //앞에 =이라는 대입연산자가 있으면 뱉어내는게 있어야 대입이 된다는 의미로 return 이있어야한다.  void는 뱉어내지않는 메소드이다.
        //메소드명은 sumStringNumber이다. 타입은 int이고 () 괄호안에 들어가는ㄴ 타입은 temp를 보면 String이라는것을 알수있다.
        System.out.printf("각 자리수의 합 : %d\n", sum);
    }
public static int sumStringNumber(String str) {
    int val = Integer.parseInt(str) ;
    int sum =0;

        while (val > 0) {

            int oneVal = val % 10; //// 123%10 은 3
            sum = sum + oneVal; //123%10=3
            val = val / 10;
        }
        return sum;
    }
}
