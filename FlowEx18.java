package com.green.java.ch04;

public class FlowEx18 {
    public static void main(String[] args) {
        int gugudan =2 ;
        int i;


//
//        for( int gugudna = 2; gugudan<=9; gugudan++){
//            for (int i = 1; i <= 9; i++) {
//                System.out.printf("%d x %d = %d ", gugudan, i, gugudan * i);
//                System.out.println();
//            }
//            System.out.println();
//        }



        for( int gugudna = 2; gugudan <= 9; gugudan++){
            for ( i = 1; i <= 9; i++) {
                System.out.printf("%d x %d = %d\t", gugudan, i, gugudan * i);
                if (i % 3 == 0) System.out.print("\n");
                if(i != gugudan)System.out.print("\n");
            }
          if(i != gugudan)System.out.print("\n");
        }
    }
}
