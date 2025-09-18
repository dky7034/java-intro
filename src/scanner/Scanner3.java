package scanner;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        // 사용자로부터 두 개의 정수를 입력 받고, 더 큰 수를 출력하는 프로그램
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자: ");
        int num1 = sc.nextInt();

        System.out.print("두 번째 숫자: ");
        int num2 = sc.nextInt();

        if (num1 == num2) {
            System.out.println("두 숫자가 같습니다.");
        } else if (num1 > num2) {
            System.out.println("더 큰 수: " + num1);
        } else {
            System.out.println("더 큰 수: " + num2);
        }

    }
}
