package com.green.java.ch04;
/*
2x1 =2 3x1=3 ...... 9x1=
2x2 =4 ...........9x2
2x9 =18 ....
 */
public class ForQuiz6 {
    public static void main(String[] args) {

        for( int i = 1; i<=9; i++){
            for (int gugudan = 2; gugudan <= 9; gugudan++) {
                System.out.printf("%d x %d = %d\t", gugudan, i, gugudan * i);
//                if(gugudan%3==1) System.out.println();
            }
            System.out.print("\n\n");
        }
    }
}

