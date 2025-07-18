package com.ogiraffers.test01;

import java.util.Scanner;

public class test2 {
//    2. 정수 한 개를 입력 받고,
//    1부터 입력 받은 정수까지의 합을 계산해서 출력하세요.
//
//-- 입력 예시 --
//    정수를 입력하세요 : 5
//
//            -- 출력 예시 --
//            1부터 5까지의 합 : 15

    public static void main(String[] args) {
        test2 t=new test2();
        t.testSimpleFor();
    }
    public void testSimpleFor(){

        /*comment for 문 단독 사용에 대한 흐름을 이해
         *
         * for ( 초기식; 조건식; 증감식) {
         * 조건을 만족할 경우 수행할 구문 (반복구문);
         * }
         * */
        Scanner sc = new Scanner(System.in);

        System.out.print(" 정수를 입력하세요: ");
        int num = sc.nextInt();

        //1부터 10까지 1씩 증가 시키면서 i 값을 출력하는 기본 반복문
        int sum=0;
        for(int i=1; i<=num; i++){
           sum+=i;
        } System.out.println( "1부터 "+num+"까지의 합은 :"+sum );
    }

}
