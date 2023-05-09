package com.green.java.ch04;

public class FlowEx33 {
    public static void main(String[] args) {
        Loop1:
        for(int i=2; i<=9; i++){
            for(int z=1; z<=9; z++){
                if(z==5){
                    break Loop1;
                }
                System.out.printf("%d, %d\n",i ,z);
            }
        }
    }
}
// 자주사용은 하지않으나 사용할때가 간혹있으니 알아두면 좋다.