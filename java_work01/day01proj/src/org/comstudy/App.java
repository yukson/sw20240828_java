package org.comstudy;
import java.util.*;

// Servlet&JSP는 Eclipse에서 하는 것이 편함
// JAVA 기본이나 Spring boot는 VS-Code도 편함
// 이유는 VS-Code가 가볍고 편함.
// 그리고 많은 확장 기능이 있다.

public class App {
    public static void main(String[] args) throws Exception {
        // 변수명 초기화는 변수를 선언할 때 초기값을 넣어 주는 것.
        // 초기 값은 리터럴이라고도 표현한다.
        // 변수 선언: 타입 변수명 = 초기값;
        // 타입은 기본타입(8가지), 참조타입
        // 기본 타입:
        // ---- 논리형 boolean
        // ---- 실수형 float, double (부동 소수점을 갖는다, 기본형은 double) 3.14, 3.14ff
        // ---- 정수형 byte, short, int, long (정수형의 기본형은 int) 365, 365L
        // ---- 문자형 char (문자형도 정수형에 속한다. 문자는 아스키코드이기 때문)
        // String은 문자열을 다루는 타입으로 기본형처럼 쓰이는 참조형(클래스)

        // 키보드 입력
        Scanner scan = new Scanner(System.in);

        String greeting = "안녕 세계";
        System.out.print("이름 입력: ");
        String name = scan.next();

        System.out.println(greeting);
        System.out.println(name);
    }
}