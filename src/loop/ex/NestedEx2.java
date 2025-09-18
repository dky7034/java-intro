package loop.ex;

import java.util.Scanner;

public class NestedEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력: ");
        int rows =  sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
