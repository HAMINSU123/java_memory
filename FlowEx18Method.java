package com.green.java.ch04; //4월 20일 2번째 메소드 연습 3번째 연습

public class FlowEx18Method {
    public static void main(String[] args) {
        int sDan =0 ;
        int eDan = 0;
        gugudan(4);
        System.out.println("-------------------------------");
        //arguments 매개변수에 보내는 값을 한국말로 인수 라고 한다.
        gugudan(2,8); // 단적인 예로들어 println도 여러가지 메소드가 있는데 하나의 메소드를 여러가지 타입을 사용하는게 오버로딩이라고한다.
    }
    public static void gugudan(int gugudan) {
        for (int i = 1; i < 10; i++) {
                System.out.printf("%d x %d = %d\t\n", gugudan, i, gugudan * i );
            }
    }
       public static void gugudan(int sDan, int eDan) { //파라미터 매개변수 혹은 인자 라고 한다. 매개변수에 보내는 값은 arguments라고 한다. 한국말로 인수
        for(int i = sDan; i<=eDan; i++){

//           for(int j =1; j<10; j++){
//
//            System.out.printf("%d x %d = %d\t\n", i, j, i * j );
//            }
            gugudan( i );
            System.out.println();
        }
    }
}

