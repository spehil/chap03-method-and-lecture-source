package com.ohgiraffers.section01.method;

public class Application3 {

    public static void main(String[] args) {

        /* 메소드 전달인자 (argument)-호출시 소괄호에 전달하는값 와 매개변수 ((parameter)-선언시 매개변수 선언부에 적어주는것)에 대해 이해하고 메소드 호출시 사용할수 있다.*/

        /*1. 전달 인자로 값 전달 테스트
        * 호출하려는 메소드의 매개변수 선언부에 미리 선언해둔 자료형과 갯수, 순서가 일치하게 값을 넣고 호출해야한다.*/
        Application3 app3 = new Application3();
        app3.testMethod(40);
       //app3.testMethod("40");
       //app3.testMethod(40,20);
       //app3.testMethod();

    /* 2. 변수에 저장한 값 전달 테스트 */
        int age = 20;
        app3.testMethod(age);//리터럴값대신에 변수가 들어가도 된다. 메인안에 정의된 변수 age와 tesMethod안에 정의된 age이므로
        //stack이라는 공간에 메인이라는 공간에  age20 메모리 공간이 생기고 testMethod안에rhdrksdp age라는 변수이 20이라는 값이 초기화된것이므로
        //이름이 같아도 관계없다 영억이 다르므로 . / 코드실행후 stack에서 사라진다.

        /* 3. 자동 형변환을 이용한 값 전달 테스트*/
        byte byteAge = 10;
        app3.testMethod(byteAge);//전달인자와 매개변수 타입이 같아야하는데 byteAge의 타입이 byte여도 자동형변환으로 코드가 실행된다.

        /* 4. 강제 형변환을 이용한 값 전달 테스트*/
        long longAge = 80;
        app3.testMethod((int)longAge);

        /* 5.연산 결과를 이용한 값 전달 테스트 */
        app3.testMethod(age * 3);

    }

    public void testMethod(int age){ //(int age)이부분은 매개변수 선언부이다. 이 기능을 사용하려면 int타입의 값을 전달 받아야만 메서드 수행이 가능
        //int타입으로 받은 값을 age로 받음


        System.out.println("당신의 나이는" + age+ "입니다.");

    }//메서드 선언

}
