package come.ohgiraffers.section03.constant;

import java.util.Scanner;

public class test8 {

    public static void main(String[] args) {
        /*8번 문제
정수를 입력 받아 그 수가 짝수인지 홀수인지 판단해서 결과를 출력하세요.
짝수인 경우 "짝수다." 출력, 홀수인 경우 "홀수다." 출력
-- 입력 예시 --
정수를 하나 입력하세요 : 5
-- 출력 예시 --
홀수다.*/

        test8 t=new test8();
        t.test2();

    }

    public void test2() {
        Scanner sc = new Scanner(System.in);
        System.out.print(" 정수를 입력하세요: ");
        int num = sc.nextInt();

        if (num %2 ==0) {
            System.out.println("  짝 ");
        } else {
            System.out.println("홀");
        }
        System.out.println("프로그램 종료");
    }

}

