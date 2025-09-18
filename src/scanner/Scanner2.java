package scanner;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        // 두 수를 입력받고 그 합을 출력하는 예제
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자 입력: ");
        int num1 = sc.nextInt();

        System.out.print("두 번째 숫자 입력: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.printf("두 숫자의 합: %d\n", sum);

    }
}
