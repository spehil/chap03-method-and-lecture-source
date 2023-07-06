package com.ohgiraffers.section01.method;

public class Application2 {
    public static void main(String[] args) {


            /* 다른 흐름의 메서드 호출 흐름에 대해 이해할수 있다.*/
            System.out.println("main()시작됨...");

            /* 작성한 메소드를 호출한다.
             * 클래스명 사용할 이름 = new 클래스명(); // 객체 생성
             * 사용할 이름.메소드명();//메서드 호출
             * */
            Application2 app2 = new Application2();// Application1에 작성된 메서드를 호출한 준비를 한것임.
            app2.methodA();
            app2.methodB();
            app2.methodC();


            System.out.println("main() 종료됨...");

        }

        public void methodA() {
            System.out.println("methodA() 호출됨...");
            System.out.println("methodB() 종료됨...");
        }//메서드를 선언한것이므로 실행시켰을때 호출(실행)되어 출력이 안됨.

        public void methodB() {
            System.out.println("methodB() 호출됨...");
            System.out.println("methodC() 종료됨...");
        }

        public void  methodC() {
            System.out.println( "methodC() 호출됨...");
            System.out.println( "methodC() 종료됨...");
    //메인메소드가 호출되고 코드가 실행되면서 methodA호출되면 methodA()코드로가서 실행하고
            // 호출했던 곳으로 다시 돌아와서 코드를 실행한다.
    //해당 코드가 실행되면 stack 메모리 영역에서 메소드를 실행되기 위한 공간을 할당해주고 메서드들이
            //실행이 완료되면 메모리 상에서 사라지고 나를 호출했던 곳으로 돌아간다.

        }
    }

