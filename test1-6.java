package com.ogiraffers.test01;

public class test6 {

//    6. 반복문을 이용하여 알파벳 소문자
//    'a'부터 'z'까지를 개행 없이 차례로 출력하세요.
//
//-- 출력 예시 --
//    abcdefghijklmnopqrstuvwxyz

    public static void main(String[] args) {

        test6 t=new test6();
        t.testSimpleFor();
    }


    public void testSimpleFor(){

        /*comment for 문 단독 사용에 대한 흐름을 이해
         *
         * for ( 초기식; 조건식; 증감식) {
         * 조건을 만족할 경우 수행할 구문 (반복구문);
         * }
         * char i='a'; i<='z'; i++ 문자열이나 이런걸 모르네..... 어디서부터 해야돼
         * 형변환 그쪽부터 공부 해야함.
         * */


        for(char i='a'; i<='z'; i++){
            System.out.print( i );
        }
    }

}
