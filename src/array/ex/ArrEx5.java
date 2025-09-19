package array.ex;

import java.util.Scanner;

public class ArrEx5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("입력받은 숫자의 개수를 입력하세요: ");
        int cnt = sc.nextInt();

        int[] numbers = new int[cnt];
        int sum = 0;

        System.out.println(cnt + "개의 정수를 입력하세요.");
        for (int i = 0; i < cnt; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int number : numbers) {
            sum += number;
        }

        double avg = (double) sum / cnt;
        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);
    }
}
