package scanner;

import java.util.Scanner;

public class ScannerWhile1 {
    public static void main(String[] args) {
        // 사용자가 입력한 문자열을 그대로 출력
        // exit 라는 문자가 입력되면 프로그램 종료
        Scanner sc = new Scanner(System.in);

        for (;;) {
            System.out.print("문자열 입력: ");
            String str = sc.nextLine();
            System.out.println("입력한 문자열: " + str);
            if (str.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }

    }
}
