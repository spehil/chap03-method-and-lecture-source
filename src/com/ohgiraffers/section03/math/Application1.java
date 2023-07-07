package com.ohgiraffers.section03.math;

public class Application1 {

    public static void main(String[] args) {


            /* Math 클래스에서 제공하는 static 메소드를 호출할수 있다.
             *
             * java.lang.Math
             * 수학에서 자주 사용되는 상수들과 함수들을 미리 구현해 놓을 클래스로
             * 모든 메서드는 static 메서드로  작성되어 있다.
             * static메서도 호출방법으로 출력해본다.*/

            /* 1. 절대값 출력
             * 클래스의 full name 작성*/
            System.out.println("-7의 절대값 :" + (java.lang.Math.abs(-7)));

            /*import를 해서 사용*/
            System.out.println("-1.25의 절대값 :" + Math.abs(-1.25));//다른 패키지에 있는 애를 호출하려면 풀패키지명을 쓰거나 import를 받아야하는데
            //java.lang패키지 하위의 기능은 매우 자주 사용되는 기능들이 있기 때문에
            //컴파일러가 자동으로 import.java.lang.*; 코드를 추가한다. 따라서 별로도 임포트 할 필요가 없다.
            //*(모든,전체의의미)

        /*2. 최대값, 최소값 출력*/

        System.out.println("10과 20 중 더 작은값? : " + Math.min(10,20));
        System.out.println("10과 20 중 더 큰 값? : " + Math.max(10,20));


        /*3.원주율 */
        System.out.println("원주율 : " + Math.PI);

        /*4. 난수출력*/
        System.out.println("난수발생:" + Math.random());//0~1미만의 실수를 발생시키는 메서드이다.
        // Math.random() -호출시마다 다른 값을 가진다
        }

    }

