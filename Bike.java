package com.green.java.ch06; //4월 21일 6
public class Bike {
    String brand;
    String model;
    int price;
    public Bike(){ // 기본 생성자

    } //리턴 타입이 없다.(void 등등) 클래스 명이랑 똑같이적어야한다.(메소드와 생성자의 차이점)
    // 기본생성자는 생성자가 하나도없을때만 자동으로 넣어준다 만약 하나라도 생성자가 있다면 자동으로 절대 안넣어주니까 꼭 기억할것 수동으로 넣어야함.
    public Bike(String brand){ // 오버로딩한 생성자 똑같은 이름의 메소드를 여러번 쓸수있는 기법(파라미터를 넣거나 안넣거나 등등)

        this.brand = brand; //this는 나 자신의 주소값을 들고 있다는 뜻.
    }
    public Bike(String brand, String model, int price) { //파라미터를 넣은 생성자.
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public Bike(Bike bike){

        this.brand = bike.brand;
        this.model = bike.model;
        this.price = bike.price;

    }

    void drive(){ // 객체(class)는 메소드와 멤버필드로 구성돼있다.
        System.out.printf("%s 브랜드 %s 모델이 달린다.", brand, model); //보라색 글자는 멤버필드를 선택했다는 뜻.

    }
}
// 오른쪽 마우스 누르고 Generate 누르고 constructor를 누르면 생성자를 만들어준다.

