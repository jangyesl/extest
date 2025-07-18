package com.ogiraffers.test01;

import java.util.Scanner;

public class test5 {

    public static void main(String[] args) {
        test5 t=new test5();
        t.testWhileExample();
    }

    public void testWhileExample(){
        /*comment while 흐름 이해하기
         *  입력한 문자열의 인덱스 이용해 문자를 하나씩 출력해보기 */

        //charAt 문자열을 나눠 출력하는 것
        //length 문자열의 길이를 반환해주는 메소드.

        Scanner sc=new Scanner(System.in);

        System.out.print("문자열 입력 : ");
        String str=sc.nextLine();
        //charAt(); 문자열에서 인덱스에 해당하는 문자를 charAt형으로 반환하는 기능
        //legth();  string 클래스의 메소드로 문자열의 길이를 int형으로 반환하는 기능
        //index는 0부터 시작하고 마지막 인덱스는 항상 길이보다 한 개 작은 숫자를 가진다.
        //만약 존재하지 않은 인덱스 범위에 접근하게 되면 StringIndexOutof 머시기 가 발생한다.

        System.out.println("========for문 =========");

        for(int i=0; i<str.length();i++ ) { //str의 길이까지 반복

            char ch=str.charAt(i);  //i 번째 ch를 가져옴

            System.out.println(i+":"+ch);
        }

        System.out.println("===========while문 =========");

        int index=0;
        while (index<str.length()){
            char ch=str.charAt(index);
            System.out.println(index+":"+ch);
            index++;
        }

    }

}
