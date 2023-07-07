package com.ohgiraffers.section01.method;


public class Calculator {

    public int minNumberOf(int first, int second){

        return first > second ? second: first;

    }

    //호출방식의 차이를 보기위해static으로 작성
    public static int maxNumbersOf(int first, int second){

        return first > second? first : second;
    }
}
