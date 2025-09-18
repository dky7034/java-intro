package scanner.ex;

import java.util.Scanner;

public class ChangeVarEx {
    public static void main(String[] args) {
        // 변수 a의 값과 변수 b의 값을 서로 바꾸기
        int a = 10;
        int b = 20;
        System.out.println("바꾸기 전:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int c = a;
        a = b;
        b = c;
        System.out.println("바꾼 후:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
