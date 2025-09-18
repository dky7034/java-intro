package cond.ex;

import java.util.Scanner;

public class MoveRateEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("평점을 입력하세요: ");
        double rating = sc.nextDouble();
        if (rating <= 9) {
            System.out.println("어바웃타임을 추천합니다.");
        }
        if (rating <= 8) {
            System.out.println("토이스토리를 추천합니다.");
        }
        if (rating <= 7) {
            System.out.println("고질라를 추천합니다.");
        }
    }
}
