package array.ex;

import java.util.Scanner;

public class ArrEx6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int cnt = sc.nextInt();

        int[] numbers = new int[cnt];

        System.out.println(cnt + "개의 정수를 입력하세요:");
        for (int i = 0; i < cnt; i++) {
            numbers[i] = sc.nextInt();
        }

        int max = numbers[0];
        int min = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }
        System.out.println("가장 작은 정수: " + min);
        System.out.println("가장 큰 정수: " + max);
    }
}
