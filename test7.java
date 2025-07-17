package come.ohgiraffers.section03.constant;

import java.util.Scanner;

public class test7 {

    public static void main(String[] args) {

        //메소드 불러다가 클래스명.메소드명();


        /*7번문제
        정수를 하나 입력 받아 그 수가 양수이면 "양수다."라고 출력하고,
        양수가 아닌 경우 "양수가 아니다."라고 출력하세요.
        -- 입력 예시 --
        정수를 하나 입력하세요 : 5
                -- 출력 예시 --
                양수다.*/

        test7 t=new test7();
        t.test1();

    }
        public void  test1() {
            Scanner sc = new Scanner(System.in);
            System.out.print(" 정수를 입력하세요: ");
            int num = sc.nextInt();

            if (num >= 0) {
                System.out.println(" 양수다 ");
            } else {
                System.out.println("양수가 아니다");
            }
            System.out.println("프로그램 종료");
        }

    }


