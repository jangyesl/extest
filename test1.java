package com.ohgiraffers.section06.ternary;

public class test1 {
    public static void main(String[] args) {
        /*두 개의 정수형 변수를 선언하고, 삼항 연산자를 사용하여
        두 수 중 큰 수를 출력하는 프로그램을 작성하세요.

            -- 출력예시 --
            두 수 중 큰 수는 20입니다.

            조건식 ? 참일 때 결과 : 거짓일 때 결과;*/

        int a=10;
        int b=20;
        int c=10;

        int result1 = (a>b)? a:b;
        System.out.println("두 수 중 큰 수는 "+result1+"입니다");


        //조건식 ? 참일 때 결과 : 거짓일 때 결과;*/
        int result2 = (a>b)?((a>c)? a:c):((b>c)?b:c);
        System.out.println("a~c 중에 가장 큰 수는 "+result2+"입니다");

    }


}
