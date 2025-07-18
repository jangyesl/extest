package com.ogiraffers.test01;

import java.util.Scanner;

public class test7 {

    public static void main(String[] args) {
        test7 t=new test7();
        t.testWhileExample2();
    }

    public void testWhileExample2(){
        //정수를 입력받아 1부터 입력받은 정수까지의 합계를 더하기.
        //개 헷갈리네 진짜. for문(반복) while문(조건) 어쩔

        Scanner sc=new Scanner(System.in);
        System.out.print("정수 하나를 입력하세요 : ");
        int num=sc.nextInt();

        int i=1;

        while(i <= num) {
            if (i % 2 != 0) {//홀수
                System.out.print("토");
            } else {
                System.out.print("마");
            }
            i++;
        }



    }


}
