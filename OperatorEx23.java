package com.green.java.ch03;

public class OperatorEx23 {
    public static void main(String[] args) {
        String s1 ="abc";
        String s2 = new String("abc");
        System.out.printf("\"abc\"==\"abc\" ? %b\n", "abc"=="abc");
        System.out.printf("\"s1\"==\"abc\" ? %b\n",  s1=="abc");
        System.out.printf("\"s2\"==\"abc\" ? %b\n", "s2"=="abc");
        System.out.printf("s1.equals(\"abc\")  ? %b\n", s1.equals("abc"));
        System.out.printf("s2.equals(\"abc\")  ? %b\n", s2.equals("abc"));


        String s4 = new String("aBc");
        System.out.println("s1.equals(s4) : " + s1.equals(s4));
        System.out.println("s1.equalsIgnoreCase(s4) : " + s1.equalsIgnoreCase(s4));// 대소문자 무시.


    }
}
