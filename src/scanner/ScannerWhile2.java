package scanner;

import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {
        // 첫 번째 숫자와 두 번째 숫자를 더해서 출력하는 프로그램
        // 첫 번째 숫자와 두 번째 숫자 모두 0을 입력하면 프로그램 종료
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("첫 번째 숫자 입력: ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자 입력: ");
            int num2 = sc.nextInt();

            if (num1 == 0 && num2 == 0) {
                System.out.print("프로그램 종료");
                break;
            } else {
                int sum = num1 + num2;
                System.out.println("두 수의 합: " + sum);
            }
        }

    }
}
