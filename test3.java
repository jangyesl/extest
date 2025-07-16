package com.ohgiraffers.section06.ternary;

public class test3 {

    public static void main(String[] args) {

        /*정수형 변수를 선언하고, 삼항연산자를 사용하여
        입력된 수가 짝수인지 홀수인지 출력하는 프로그램을 작성하세요.
        참고사항 : 조건식에 %를 활용하여 짝수인지 홀수인지를 판단해보세요
        -- 출력예시 --
        입력하신 수는 짝수입니다.
                또는 입력하신 수는 홀수입니다.

                (조건식)? 참일때 값: 거짓일때 값*/

        int number1 = 2;
        int number2 = 3;

        String result1 = (number1 % 2 == 0) ? "짝수" : "홀수";
        String result2 = (number2 % 2 == 0) ? "짝수" : "홀수";

        System.out.println( "입력하신 수는 "+result1+"입니다.");
        System.out.println( "입력하신 수는 "+result2+"입니다.");

    }
}
