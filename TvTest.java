package com.green.java.ch06;

public class TvTest {

    public static void main(String[] args) {

        String str = new String("dd"); //String 객체의 주소값을 담을수있다.
        Tv tv = new Tv(); //앞으로 new 라는 키워드를 많이 쓸건데 이것이 바로 객체화할때 쓰는 단어이다. 객체화하고 싶은것을 오른쪽에 적으면된다.
        // new 키워드는 객체화함과 동시에 주소값을 준다.주소값(new Tv()) 을 Tv tv에 대입해준다.라는 뜻이라고 생각해라
        //기본생성자 호출. 컴파일러가 자동으로 생성해준다 생성자가 없으면
        // Tv객체의 주소값을 tv에 저장할수있다.

        System.out.printf("power : %b\n", tv.power);// 주소값이 tv에 저장되있으므로 tv의 파워값을 불러낼때 저렇게 쓴다. 마법의 단어 "."
        System.out.printf("channel : %d\n", tv.channel);// 처음 아무것도 지정하지않았을때는 불린은 false int는 0 나온다.

        // 아주 중요 타입이 Tv. Tv객체의 주소값만 담을수있는 레퍼런스변수값이다.
//         String str = new String("dd");// 스트링 객체의 주소값만 담을 수있는 레퍼런스 변수값.

        tv.power = true; //값을 변경하고 있는거다. power에 true값을 넣어보자라는 뜻.
        System.out.printf("power : %b\n", tv.power);//tv.power는 객체에 접근했다는뜻 메소드를 호출하려면 () 소괄호가 붙어야한다.

        tv.power(); // tv.power 메소드를 호출했다는 뜻이다.
        System.out.printf("power : %b\n", tv.power); // void power(){ power = !power;} 메소드가 한번 사용될때마다 지정해놓은 변수로 변한다.

        tv.channelUp();
        tv.channelUp();
        System.out.printf("channel : %d\n", tv.channel);

        tv.channel = 10; //tv객체 안에있는 채널의 값을 10으로 변경했다는 뜻.
        System.out.printf("channel : %d\n", tv.channel);

        Tv tv2 =tv; //tv에 담겨있는 주소값을 tv2에 복사해준다. 얕은복사.
        System.out.printf("channel : %d\n", tv2.channel);

        Tv tv3 = new Tv(); //새로운 Tv객체를 생성했기때문에 0이다.
        System.out.printf("channel : %d\n", tv3.channel);


        // Stack Tv tv 주소값이 저장돼있음
        // Heap tv tv 속성 메소드가 저장돼있음.


    }
}



