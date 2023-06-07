package com.green.java.ch06;// 4월 21일

public class CarTest {
    public static void main(String[] args) {

        Car c1 = new Car();// new 를 썻기때문에 heap 메모리에 c1 c2의 다른 객체가 형성됐다.
        Car c2 = new Car();

         c1.brand = "쉐보레";
         c1.model = "트래버스";
         c1.price = 4500;

         c2.brand = "쉐보레";
         c2.model = "엔초페라리";
         c2.price = 4000;

         Car.brand = "현대";
         // 이렇게 쓰는거다. 왜냐하면 이미 클래스에 객체화하지않아도 이미 공간이 할당됐기때문에 가능하다.
        //이런것들을 클래스멤버필드라고한다.
        //c2.model  c1.model 과 같은 객체화가 필요한 아이들을 인스턴스멤버필드라고 한ㄷ.

         c1.printInfo();
         c2.printInfo();

        System.out.println(c1.brand);
        System.out.println(c2.brand);

//클래스 안에 static이라고 붙이면 클래스라는 메모리안에 brand라고 하는 공간이 할당되는데
// 각자 만들어진 힙메모리에있는 각 객체가 static의 메모리를 참조하게된다. 그래서 같은 브랜드가 찍히게됨.
    }
}
