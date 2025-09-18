package loop.ex;

import java.util.Scanner;

public class WhileEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력: ");
        int max = sc.nextInt();
        int i = 1;
        int sum = 0;
        while (i <= max) {
            sum += i;
            i++;
        }
        System.out.println("max = " + max + ", sum = " + sum);
    }
}
