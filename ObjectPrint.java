package com.green.java.ch06;

public class ObjectPrint {
    public static void main(String[] args) {


        String str = new String("ABC");
        System.out.println(str);

        ValueBox vb = new ValueBox();
        vb.num = 10;
        System.out.println(vb); // string 코드를 제외한 나머지는 해시코드가 나온다. ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ 무슨말인지 솔직히 모르겠다.
    }
}

class ValueBox {

    int num;

    @Override
    public String toString() {
        return String.valueOf(num);
    }
}



