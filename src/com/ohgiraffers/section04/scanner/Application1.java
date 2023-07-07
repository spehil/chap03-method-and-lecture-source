package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        /* java.util.Scanner를 이용한 다양한 자료형 값 입력받기*/

        /* 1. Scanner 객체 생성*/
        Scanner sc = new Scanner(System.in); //Scanner객체를 쓰고 싶을때 생성시 System.in를 써줘야한다.
        //콘솔에 입력한 값을 읽어온다.


        /*2. 자료형별 값 입력받기 */
        System.out.print("이름을 입력하세요 :");
       // sc.nextLine(); //input값은 없고 호출시 반환타입 String
        /*2-1 문자열 입력받기  nextLine() - 입력 받은 값을 문자열로 반환 -> 반환된값을 변수에 담아 출력해준다.  */
        String name = sc.nextLine(); //input값은 없고 호출시 반환타입 String
        System.out.println("입력하신 이름은" + name + "입니다.");//출력을 하고 나서 개행을 해주는 출력메서드

        /* 2-2 정수형 값 입력받기 : nextint() -입력받은 값을 int형으로 반환 */
        /*숫자가 아닌 값을 입력하게 되면 java.InputMismatchException 이 발생한다(런타임에러 )*/

        System.out.print("나이를 입력하시오 ");
        int age = sc.nextInt();
        System.out.println("입력하신 나이는" + age + "세 입니다.");

        // 컴파일에러 - 문법적인 에러
        //런타임(Runtime) 에러 - 실행시 에러 - 어디에서 에러가 났는지 위치를 콘솔에서 볼수 있음  첫번쨰 줄에 오류이유가 적혀있다.

        /* nextLong() - 입력 받은 값을 long형으로 반환*/
        /* nextInt와 에러가 발생하는 이유는 동일하다. */
        System.out.print("금액을 입력하세요 :");
        long money = sc.nextLong();
        System.out.println("입력하신 금액은 :" + money + "원 입니다.");

        /* 2-3. 실수형 값 입력받기 - nextFloat(): 입력 받은 값을 float형으로 반환한다. */
        System.out.println("키를 입력하세요 : ");
        float height = sc.nextFloat(); //실수에 정수를 입력하는것은 형변환이 알아서 되기때문에 문제되지 않는다.
        System.out.println("입력하신 키는 " + height + "입니다.");

        /*2-4. 논리형 값 입력받기 - nextBoolean(): 입력받은 bollean형으로 반환한다.
        * true나 false이외에 .. InputException 에러가 발생*/
        System.out.println("참과 거짓 중 한가지를 true or false로 입력해주세요 :");
        boolean isTrue = sc.nextBoolean();// true enter
        System.out.println("입력하신 논리값은 " + isTrue + "입니다.");

        sc.nextLine();//입력버퍼에 이전에 있는 enter를 읽고 버린다.
        /* 2-5 문자형 값 입력받기
        * 문자를 직접 입력받는 기능을 제공하지 않으므로 문자열로 입력 받은 뒤 원하는 문자를 분리해서 사용해야한다.
        * java.lang.String의 charAt(int index)를 사용한다.
        * index는 0부터 시작하는 숫자 체계이며 컴퓨터에서 주로 사용하는 방식이다. */
        /*만약 존재 하지 않는 인덱스를 입력하게 되면 java.lang.StringIndexOutOfBoundException*/
        System.out.println("아무 문자나 입력해주세요 : ");
        char ch =sc.nextLine().charAt(0); //인덱스는 0,1,2,3.4로 0부터 시작한다는것.
        //char ch =sc.nextLine().charAt(10); //StringIndexOutOfBoundException에러가 발생한다 인덱스가 입력한값의 인덱스보다 범위가 많아서.
        //입력받은 문자의 첫번째 인덱스(0으로 작성해줘서 )의 글자를 뽑아와서 저장한다.
        System.out.println("입력하신 문자는" + ch +"입니다. ");
    }
}
