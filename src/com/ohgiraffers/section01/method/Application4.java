package com.ohgiraffers.section01.method;


public class Application4 {

    public static void main(String[] args) {
        /* 여러개의 전달인자를 이용한 메소드 호출을 할수 있다*/
        
        Application4 app4 = new Application4();//객체생성
        app4.testMethod("홍길동",28,'남');//데이터타입의 순서, 갯수에 맞게 매개변수 입력한다 그래야 호출 가능하다
        // 매개변수의 타입, 개수, 순서가 모두 일치해야 전달 가능

        /* 변수에 저장된 값을 전달하며 호출 */
        String name = "유관순";
        int age = 20;
        char gender = '여';

        app4.testMethod(name, age,gender);

        //메소드의 매개변수와 메인메서드의 변수명은 지역변수로 각각의 블럭 안에서만 사용되고 값만 전달되는것으로 변수명이 같아도 문제가없다.
        //stack에서 저장공간이 생겨서 할일을 마치면 사라진다.

    }

    public void testMethod(String name, int age, final char gender){
        //매개변수는 일종의 지역변수(선언부의 블럭 안에서만 사용가능하다) 분류된다.  매개변수에 final을 쓸수 있다.
        //다른 매개변수는 값을 바꿀수 있지만 ," final 상수는 값 변경이 안된다". 단, final매개변수는
        // 상수 네이밍 규칙을 선택적으로 따르는 경향이 있다(대문자가 아닌 소문자로 작성-매개변수 final 매개변수는)

        System.out.println("당신의 이름은"+ name +"이고, 나이는" + age +"세 이며 , 성별은" +gender+"입니다.");



    }

}
