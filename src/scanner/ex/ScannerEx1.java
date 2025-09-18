package scanner.ex;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        // 사용자로부터 입력받은 이름과 나이를 출력
        Scanner sc = new Scanner(System.in);

        System.out.print("이름 입력: ");
        String name = sc.nextLine();

        System.out.print("나이 입력: ");
        int age = sc.nextInt();

        System.out.println("당신의 이름은 " + name + "이고, " + "나이는 " + age + "살입니다.");
    }
}
