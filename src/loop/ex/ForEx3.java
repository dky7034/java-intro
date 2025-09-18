package loop.ex;

import java.util.Scanner;

public class ForEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력: ");
        int max = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= max; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }
}
