package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application {
//arl+enter ->import 단축키
    public static void main(String[] args) {
        /* 스캐너 주의 사항 */
        /* 스캐너의 next 메소드들은 입력한 내용을 "버퍼로부터 토큰단위로 분리해서 읽어온다."
         * 그래서 크게 두 가지 사항을 주의해야 한다.
         * 1. next()로 문자열 입력 받은 후 정수, 실수, 논리값 입력 받을 때
         * 2. 정수, 실수, 논리값 입력 후 nextLine()로 문자열 입력받을 때
         * */
        /* 스캐너 객체 생성 */
        Scanner sc = new Scanner(System.in);
        /* 1. next()로 문자열 입력 받은 후 정수, 실수, 논리값 입력 받을 때 */
        System.out.print("문자열을 입력해주세요 : ");
        String str1 = sc.next(); //공백이나 개행문자 전 까지를 읽어온다.
        System.out.println("str1 : " + str1);
        System.out.print("숫자를 입력해주세요 : ");
        int num1 = sc.nextInt(); //정수 값을 읽어온다.
        System.out.println("num1 : " + num1);

        /*콜솔에 입력하면 입력버퍼안에 공백전까지만
        * sc.next() 정수 실수 논리값 의 입력을 받아오면서 버퍼에서 입력값이 남아 있어서
        * 공백을 포함한 문자열을 입력하게 되면 입력 버퍼에 남아있는 문자열로 인해 nextInt()메소드가 해당 값을
        * 숫자로 변경하지 못해서 발생하는 InputMismathchException이 발생할수 있는 가능성이 있다.
        * 해결방법은 공백이 들어간입력값을 받을경우에는 next()가 아닌 nextLine()사용하기 */


        /* 2. 정수, 실수, 논리값 입력 후 nextLine()로 문자열 입력받을 때 */
        System.out.print("다시 숫자를 입력해주세요 : ");
        int num2 = sc.nextInt();//숫자 +enter
        System.out.println("num2 : " + num2);
        sc.nextLine();//버퍼를 읽고 비운다

        System.out.print("공백이 있는 문자열을 하나 입력해주세요 : ");
        String str2 = sc.nextLine();//개행문자까지 전부 읽어준다. 문자열+enter
        System.out.println("str2 : " + str2);
        /* 입력버퍼에 남아있는 개행문자로 인해 이어지는 nextLine()이 아무값도 입력받지 않고 빈 문자열로 처리된다.
        * 개행문자를 읽고 버릴수 있도록 입력받기 전에 한번호 호출할수 있도록. => 입력버퍼에 남은 개행문자를 사전에 읽고 버린다.*/

    }
}
