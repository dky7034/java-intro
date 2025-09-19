package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();

        if (cnt <= 0) {
            System.out.println("1 이상의 숫자를 입력해주세요.");
            return;
        }

        int[] arr = new int[cnt];
        System.out.println(cnt + "개의 정수를 입력하세요:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        int max = arr[0];
        // 향상된 for문 사용
        for (int value : arr) {
            if (min > value) {
                min = value;
            }
            if (max < value) {
                max = value;
            }
        }

        System.out.println("가장 작은 정수: " + min);
        System.out.println("가장 큰 정수: " + max);

    }
}
