package com.green.java.ch04;
/*
[1,1] [1,2]
 */
public class FlowEx20 {
    public static void main(String[] args) {
        for( int i = 1; i<=3; i++){
            for (int z = 1; z <= 3; z++) {
                System.out.printf("[%d, %d]", i, z);

            }
            System.out.print("\n");
        }

    }

}
