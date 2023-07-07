package com.ohgiraffers.section01.method;


public class Application6 {
    public static void main(String[] args) {
        /* 메소드 리턴값을 이해하고 활욜할수 있다. */

        Application6 app6 = new Application6();
        app6.testMethod();//메서드를 호출하면 "hello world"가 반환은 되었지만, 반환값을 다루어주는 어떤코드가 없으므로 콘솔에 찍히지 않음.

        /* 메서드의 반환 값이 있을 경우 반환 값을 변수에 담을 수 있다. */
        String returnText = app6.testMethod(); //호출하고 반환된 값을 문자열 타입의 변수에 담아준다. -계속 반환값을 사용하려면 변수에 담아서 사용
        System.out.println("returnText : " + returnText);

        /* 변수에 저장하지 않고 바로 출력도 가능하다.*/
        System.out.println(app6.testMethod()); //메소드 호출시 반환된 값을 한번 사용하고 말거면 반환값을 사용할 위치에서 바로 출력할수 있음.
        //pringapp6.testMethod()-전달인자

    }

    public String testMethod() {
        //최종 아웃풋으로 문자열을 반환하겠다는 내용
        //String을 반환하겠다는 코드로 return구문을 작성사지 않으면 에러가 난다.

        return "hello world";

    }

}
