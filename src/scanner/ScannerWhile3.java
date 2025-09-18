package scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        // 사용자 입력을 받아 그 합계를 계산하는 프로그램
        // 사용자는 한 번에 한 개의 정수를 입력할 수 있으며, 사용자가 0을 입력하면 프로그램 종료
        // 프로그램이 종료될 때까지 사용자가 입력한 모든 정수의 합 출력
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("정수 입력: ");
            int num = sc.nextInt();

            if (num == 0) {
                System.out.println("프로그램 종료");
                break;
            }
            sum += num;
        }
        System.out.println("sum = " + sum);
    }
}
