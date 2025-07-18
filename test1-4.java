package com.ogiraffers.test01;

import java.util.Scanner;

public class test4 {

//    4. 1부터 입력 받은 정수까지의 짝수의 합을 출력하세요.
//
//-- 입력 예시 --
//    정수를 입력하세요 : 10//
//            -- 출력 예시 --
//            1부터 10까지 짝수의 합 : 30

    public static void main(String[] args) {
        test4 t=new test4();
        t.testSimpleFor();
    }

    public void testSimpleFor(){

        Scanner sc = new Scanner(System.in);

        System.out.print(" 정수를 입력하세요: ");
        int num = sc.nextInt();

        int sum=0;
        for(int i=1; i<=num; i++){ //1씩증가
            if(i%2==0){
                sum+=i; //sum에 i합계
            }
        }System.out.println( "1부터 "+num+"까지 짝수 합계는 "+sum+"입니다." );
    }
}
