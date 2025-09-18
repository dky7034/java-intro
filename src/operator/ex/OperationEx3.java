package operator.ex;

import java.util.Scanner;

public class OperationEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력해 주세요(정수 입력): ");
        int score = sc.nextInt();
        if (80 <= score && score <= 100) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
