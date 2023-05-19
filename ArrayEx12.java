package com.green.java.ch05; //4월 18일 1
// p166 향상된 for문 foreach문
public class ArrayEx12 {

    public static void main(String[] args) {

//        String[] strArr = new String[10];

        String[] names ={ "kim","Park","yi"};
        // 실행하고 난뒤에는 방의 크기를 늘리는건 불가능하다.
        // ArrayIndexOutOfBoundsException 있지도 않는 방에 내가 넣으려고 한다는 오류메세지.
        // 만약 늘리려고 한다음 원래보다 큰 배열을 만든다음 카피를 해서 하나하나씩 방에 값을 넣어주고
        // 그다음 마지막 방에 하나 주면 방이 늘어난다.
        //ex String [] temp = new String[names.length + 1];
        // temp[temp.length-1] ="dd";
        //names = temp;

        for(int i=0; i<names.length; i++){

            System.out.printf("names[%d]: %s\n", i, names[i]);
        }

        names[0] = "Yu";
//        int i =0;


        for(String nm : names){ //foreach문 위에 있는것과 비슷하지만 방 번호를 쓸필요가없다.

            System.out.println( nm );
//            System.out.printf("names[%d]: %s\n",i++ , nm);
        }
    }
}
