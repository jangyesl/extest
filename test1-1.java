package com.ogiraffers.test01;

public class test1 {

    /*1 .반복문을 사용하여 1부터 100까지 더한 합계를 출력하세요.*/

    public static void main(String[] args) {
        test1 t= new test1();
        t.testSimpleFor();
    }
    public void testSimpleFor(){

        /*comment for 문 단독 사용에 대한 흐름을 이해
         *
         * for ( 초기식; 조건식; 증감식) {
         * 조건을 만족할 경우 수행할 구문 (반복구문);
         * }
         * */

        //1부터 100까지 1씩 증가 시키면서 i 값을 출력하는 기본 반복문

        int sum=0;
        for(int i=1; i<=100; i++){ //1씩증가
            sum+=i; //sum에 i합계
        }System.out.println( "1부터 100까지 합계는 "+sum+"입니다." );
    }
}
