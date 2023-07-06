package com.ohgiraffers.section01.method;

public class Application1 {

    public static void main(String[] args) {
        /*프로그램이 실행됐을때 가장먼저 호출되는것이 메인메서드(프로그램실행시 최초로실행) */

        /*메서드의 호출 흐름에 대해 이해할수 있다.*/
        System.out.println("main()시작됨...");

        /* 작성한 메소드를 호출한다.
        * 클래스명 사용할 이름 = new 클래스명(); // 객체 생성
        * 사용할 이름.메소드명();//메서드 호출
        * */
        Application1 app1 = new Application1();// Application1에 작성된 메서드를 호출한 준비를 한것임.
        app1.methodA();

        System.out.println("main() 종료됨...");

    }

    public void methodA() {
        System.out.println("methodA() 호출됨...");
        //methodB호출
        methodB();
        System.out.println("methodB() 종료됨...");
    }//메서드를 선언한것이므로 실행시켰을때 호출(실행)되어 출력이 안됨.

    public void methodB() {
        System.out.println("methodB() 호출됨...");
        methodC();
        System.out.println("methodC() 종료됨...");
    }

    public void  methodC() {
        System.out.println( "methodC() 호출됨...");
        System.out.println( "methodC() 종료됨...");
        
        //메인메서드 호출되어 메일메서드A가 호출되고 출력하고 메서드B호출되어 출력되고 메서드C호출하고 출력되고
        // 호출했던 메서도로 다시 돌아가 코드를 실행한다.
        //메인메서드 안에 다 적는게 아니라 분리해서 기능마다 메서드 분리해서 작성
    }
}



