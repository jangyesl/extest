package com.ogiraffers.test01;

import java.util.Scanner;

//5.문자열을 입력 받아서 문자열의 각 인덱스별로 한 글자씩 출력하세요.
//
//-- 입력 예시 --
//문자열을 입력하세요 : apple
//
//-- 출력 예시 --
//        0 : a
//1 : p
//2 : p
//3 : l
//4 : e
public class test05 {
    public static void main(String[] args) {
        test05 t=new test05();
        t.testWhileExample();
    }

    public void testWhileExample() {


        Scanner sc=new Scanner(System.in);
        System.out.print("문자열 입력하세요 : ");
        String str=sc.nextLine();

        System.out.println("for문");
        for(int i=0;i<str.length();i++){  //입력받은 str의 길이만큼 i 증가
            char ch=str.charAt(i);
            System.out.println(i+":"+ch);

        }
    }


}
