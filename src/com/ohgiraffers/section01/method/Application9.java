package com.ohgiraffers.section01.method;


import java.util.Calendar;

public class Application9 {
    public static void main(String[] args) {
        /*다른 클래스에 작성된 메서드를 호출할수 있다.*/
        int first = 100;
        int second = 50;

        /* 1. non-static 메서드 호출*/
        Calculator cal = new Calculator();
        int min = cal.minNumberOf(first,second); //호출된 값을 변수에 저장
        System.out.println("둘중 최소값은? :" + min);

        /*2. static 메소드 호출 -클래스명.메소드명() 다른 클래스에서 불러오므로 클래스명을 반드시 작성해줘야한다.*/
        int max = Calculator.maxNumberOf(first,second);
        System.out.println("둘중 최대값은? :" + max);

        /* 주의사항 static메서드는 non-static메서드 호출방식으로 호출하는것이 가능하지만 권장하지 않는다.*/

       /*static메모리*/

        int max2 = cal.minNumberOf(first,second);
        System.out.println("둘중 최대값은? :" + max2);

    }
}
