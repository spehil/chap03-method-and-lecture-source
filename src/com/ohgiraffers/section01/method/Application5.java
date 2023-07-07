package com.ohgiraffers.section01.method;


public class Application5 {
    public static void main(String[] args) {
        /* 메소드 리턴에 대해 이해할수 있다.*/

        System.out.println("main() 메소드 시작함...");

        Application5 app5 = new Application5();
        app5.testMethod();


        System.out.println("main() 메소드 종료됨...");


    }

    public void  testMethod() {

        System.out.println("testMethod() 동작 확인 ...");


        return;//모든메서드 끝에는 return; 이라는 구문이 숨겨져 있다 컴파일러가 기본적으로 추가시켜준다.
        //void 메소드의 경우 컴파일러가 자동으로 추가해주므로 명시적으로 작성할 필요가 없을 뿐이다
        // "return은 현재 메소드를 강제 종료하고 호출한 구문으로 다시 돌아가는 명령어이다." -> 리턴 명령어 기능 기억하기.
        //return;
       // System.out.println("test"); // return 이후에 명령문을 작성할수 없다.
    }
}
