package com.ohgiraffers.section06.ternary;

public class test2
{

    public static void main(String[] args) {

        /* 삼항 연산자 단독 사용*/

        int num1=40;
        int num2=70;

        String result1= (num1 >60)? "합격입니다" : "불합격입니다";
        String result2= (num2 >60)? "합격입니다" : "불합격입니다";

        System.out.println(num1+"점으로  "+ result1);
        System.out.println(num2+"점으로  "+ result2);


    }
}
