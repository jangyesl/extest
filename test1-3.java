package com.ogiraffers.test01;

public class test3 {


    public static void main(String[] args) {
        test3 t=new test3();
        t.testSimpleFor();   //7단 뽑기.
        t.testSimpleFor1();  //랜덤 구구단 뽑기
    }
    //3.반복문을 사용하여 7단 구구단을 출력하세요. > 중첩 for문 dan , su

    public void testSimpleFor(){

        /*comment for 문 단독 사용에 대한 흐름을 이해
         *
         * for ( 초기식; 조건식; 증감식) {
         * 조건을 만족할 경우 수행할 구문 (반복구문);
         * }
         * */

        //7단 출력하기
        int random=7;

        for(int i=1; i<=9; i++){
            System.out.println( random+"*"+i+"="+(random*i) );
        }
        System.out.println();
    }

    public void testSimpleFor1(){

        /*comment for 문 단독 사용에 대한 흐름을 이해
         *
         * for ( 초기식; 조건식; 증감식) {
         * 조건을 만족할 경우 수행할 구문 (반복구문);
         * }
         * */

        //random 2~9까지 랜덤 숫자를 받아 구구단으로 출력

        int random = (int)(Math.random()*8)+2;
        System.out.println("random : "+ random);

        for(int i=1; i<=9; i++){
            System.out.println( random+"*"+i+"="+(random*i) );
        }
        System.out.println();
    }
}
