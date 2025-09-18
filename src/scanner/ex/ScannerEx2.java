package scanner.ex;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        // 사용자로부터 하나의 정수를 입력받고, 이 정수가 홀수인지 짝수인지 판별
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 입력: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("입력한 숫자 " + num + "는 짝수입니다.");
        } else {
            System.out.println("입력한 숫자 " + num + "는 홀수입니다.");
        }
    }
}
