package com.ohgiraffers.section01.method;


public class Application8 {

    public static void main(String[] args) {
        /*static 메서드를 호출할수 있다*/
        System.out.println("10과 20의 합:" + Application8.sumTwoNumbers(10,20));

        /* 동일한 클래스 내에서 작성된 static메소드는 클래스명 생략이 가능 */
        System.out.println("10과 20의 합:" + sumTwoNumbers(10,20));
    } //기능 메소드에 따라 메소드 구분을 해서 코드를 작성해야한다.

    public static int sumTwoNumbers(int first, int second){
        //static은 메모리할당이 어떻게 되느냐 부분이 다르고
        //static메서드를 호출하는 방법에도 차이가있다.
        /* static 메소드 호출하는 방법
        * 클래스명.메소드명();
        * Application8.sumTwoNumbers; */
        //static 이없을때 호출
        //Application8 app8 = new Application8();
        return first + second;

    }
}
